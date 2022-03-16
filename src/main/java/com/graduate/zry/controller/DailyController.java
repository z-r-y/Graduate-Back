package com.graduate.zry.controller;

import com.alibaba.fastjson.JSON;
import com.graduate.zry.bean.Daily;
import com.graduate.zry.bean.Login;
import com.graduate.zry.bean.QueryInfo;
import com.graduate.zry.dao.DailyDao;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DailyController {
@Autowired
  DailyDao dailyDao;

@RequestMapping("/addDa")
  public String addDaily(@RequestBody Daily daily){
  daily.setState(true);
  int i=dailyDao.addDaily(daily);
  return i > 0 ? "success":"error";
}

@RequestMapping("/deleteDa")
  public String deleteDaily(String p_id){
  int i=dailyDao.deleteDaily(p_id);
  return i>0?"success":"error";
}

@RequestMapping("/updateDa")
  public String getUpdateDaily(String p_id){
  Daily daily=dailyDao.getUpdateDaily(p_id);
  String string= JSON.toJSONString(daily);
  return string;
}

  @RequestMapping("/getupdateDa")
  public String getUpdateUser(String p_id){
    Daily daily=dailyDao.getUpdateDaily(p_id);
    String string=JSON.toJSONString(daily);
    return string;
  }

@RequestMapping("/editDa")
  public String editDaily(@RequestBody Daily daily){
  int i=dailyDao.editDaily(daily);
  return i>0?"success":"error";
}

  @RequestMapping("/dailyState")
  public String updateUserState(@RequestParam("p_id") String  p_id,
      @RequestParam("state") Boolean state){
    int i = dailyDao.updateState(p_id, state);
    System.out.println("用户编号:"+p_id);
    System.out.println("用户状态:"+state);
    String str = i >0?"success":"error";
    return str;
  }

@RequestMapping("/allDa")
  public String getDailyList(QueryInfo queryInfo){
  int numbers=dailyDao.getDailyCounts("%"+queryInfo.getQuery()+"%");
  int pageStart=(queryInfo.getPageNum()-1)* queryInfo.getPageSize();
  List<Daily> da=dailyDao.getAllDaily("%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());
  HashMap<String,Object> res=new HashMap<>();
  res.put("numbers",numbers);
  res.put("data",da);
  System.out.println(da);
  String res_string=JSON.toJSONString(res);
  System.out.println(res_string);
  return res_string;
}
}
