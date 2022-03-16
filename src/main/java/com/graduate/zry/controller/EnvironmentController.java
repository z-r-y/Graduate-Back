package com.graduate.zry.controller;

import com.alibaba.fastjson.JSON;
import com.graduate.zry.bean.Daily;
import com.graduate.zry.bean.Environment;
import com.graduate.zry.bean.QueryInfo;
import com.graduate.zry.dao.EnvironmentDao;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EnvironmentController {
@Autowired
  EnvironmentDao environmentDao;

  @RequestMapping("/addEn")
  public String addEnvironment(@RequestBody Environment environment){
    environment.setState(true);
    int i= environmentDao.addEnvironment(environment);
    return i > 0 ? "success":"error";
  }

  @RequestMapping("/enState")
  public String updateUserState(@RequestParam("id") String  id,
      @RequestParam("state") Boolean state){
    int i = environmentDao.updateState(id, state);
    System.out.println("用户编号:"+id);
    System.out.println("用户状态:"+state);
    String str = i >0?"success":"error";
    return str;
  }

  @RequestMapping("/getupdateEn")
  public String getUpdateUser(String id){
    Environment environment=environmentDao.getUpdateEnvironment(id);
    String string=JSON.toJSONString(environment);
    return string;
  }

  @RequestMapping("/deleteEn")
  public String deleteEnvironment(String id){
    int i=environmentDao.deleteEnvironment(id);
    return i>0?"success":"error";
  }

  @RequestMapping("/updateEn")
  public String getUpdateEnvironment(String id){
    Environment environment=environmentDao.getUpdateEnvironment(id);
    String string= JSON.toJSONString(environment);
    return string;
  }

  @RequestMapping("/editEn")
  public String editEnvironment(@RequestBody Environment environment){
    int i=environmentDao.editEnvironment(environment);
    return i>0?"success":"error";
  }

  @RequestMapping("/allEn")
  public String getEnvironmentList(QueryInfo queryInfo){
    int numbers=environmentDao.getEnvironmentCounts("%"+queryInfo.getQuery()+"%");
    int pageStart=(queryInfo.getPageNum()-1)* queryInfo.getPageSize();
    List<Environment> da=environmentDao.getAllEnvironment("%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());
    HashMap<String,Object> res=new HashMap<>();
    res.put("numbers",numbers);
    res.put("data",da);
    String res_string=JSON.toJSONString(res);
    return res_string;
  }

}
