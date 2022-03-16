package com.graduate.zry.controller;

import com.alibaba.fastjson.JSON;
import com.graduate.zry.bean.Person;
import com.graduate.zry.bean.QueryInfo;
import com.graduate.zry.dao.PersonpDao;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonpController {
  @Autowired
  PersonpDao personDao;

  @RequestMapping("/addPe")
  public String addperson(@RequestBody Person person){
    int i=personDao.addPerson(person);
    return i > 0 ? "success":"error";
  }

  @RequestMapping("/deletePe")
  public String deleteperson(String p_id){
    int i=personDao.deletePerson(p_id);
    return i>0?"success":"error";
  }

  @RequestMapping("/updatePe")
  public String getUpdateperson(String p_id){
    Person person=personDao.getUpdatePerson(p_id);
    String string= JSON.toJSONString(person);
    return string;
  }

  @RequestMapping("/getupdatePe")
  public String getUpdateUser(String p_id){
    Person person= personDao.getUpdatePerson(p_id);
    String string=JSON.toJSONString(person);
    return string;
  }

  @RequestMapping("/editPe")
  public String editperson(@RequestBody Person person){
    int i=personDao.editPerson(person);
    return i>0?"success":"error";
  }

  @RequestMapping("/allPe")
  public String getpersonList(QueryInfo queryInfo){
    int numbers=personDao.getPersonCounts("%"+queryInfo.getQuery()+"%");
    int pageStart=(queryInfo.getPageNum()-1)* queryInfo.getPageSize();
    List<Person> da=personDao.getAllPerson("%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());
    HashMap<String,Object> res=new HashMap<>();
    res.put("numbers",numbers);
    res.put("data",da);
    String res_string=JSON.toJSONString(res);
    return res_string;
  }
}
