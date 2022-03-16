package com.graduate.zry.controller;

import com.alibaba.fastjson.JSON;
import com.graduate.zry.bean.Person;
import com.graduate.zry.bean.QueryInfo;
import com.graduate.zry.dao.PersonpDao;
import com.graduate.zry.dao.PersonwDao;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonwController {
  @Autowired
  PersonwDao personDao;

  @RequestMapping("/addPew")
  public String addperson(@RequestBody Person person){
    int i=personDao.addPersonw(person);
    return i > 0 ? "success":"error";
  }

  @RequestMapping("/deletePew")
  public String deleteperson(String p_id){
    int i=personDao.deletePersonw(p_id);
    return i>0?"success":"error";
  }

  @RequestMapping("/updatePew")
  public String getUpdateperson(String p_id){
    Person person=personDao.getUpdatePersonw(p_id);
    String string= JSON.toJSONString(person);
    return string;
  }

  @RequestMapping("/getupdatePew")
  public String getUpdateUser(String p_id){
    Person person= personDao.getUpdatePersonw(p_id);
    String string=JSON.toJSONString(person);
    return string;
  }

  @RequestMapping("/editPew")
  public String editperson(@RequestBody Person person){
    int i=personDao.editPersonw(person);
    return i>0?"success":"error";
  }

  @RequestMapping("/allPew")
  public String getpersonList(QueryInfo queryInfo){
    int numbers=personDao.getPersonwCounts("%"+queryInfo.getQuery()+"%");
    int pageStart=(queryInfo.getPageNum()-1)* queryInfo.getPageSize();
    List<Person> da=personDao.getAllPersonw("%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());
    HashMap<String,Object> res=new HashMap<>();
    res.put("numbers",numbers);
    res.put("data",da);
    String res_string=JSON.toJSONString(res);
    return res_string;
  }
}
