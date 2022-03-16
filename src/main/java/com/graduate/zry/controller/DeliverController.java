package com.graduate.zry.controller;

import com.alibaba.fastjson.JSON;
import com.graduate.zry.bean.Daily;
import com.graduate.zry.bean.Deliver;
import com.graduate.zry.bean.Login;
import com.graduate.zry.bean.QueryInfo;
import com.graduate.zry.dao.DeliverDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class DeliverController {
  @Autowired
  DeliverDao deliverDao;

  @RequestMapping("/addDe")
  public String addDeliver(@RequestBody Deliver deliver){
    int i=deliverDao.addDeliver(deliver);
    return i > 0 ? "success":"error";
  }

  @RequestMapping("/deleteDe")
  public String deleteDeliver(String id){
    int i=deliverDao.deleteDeliver(id);
    return i>0?"success":"error";
  }

  @RequestMapping("/updateDe")
  public String getUpdateDeliver(String id){
    Deliver deliver=deliverDao.getUpdateDeliver(id);
    String string= JSON.toJSONString(deliver);
    return string;
  }

  @RequestMapping("/editDe")
  public String editDeliver(@RequestBody Deliver deliver){
    int i=deliverDao.editDeliver(deliver);
    return i>0?"success":"error";
  }

  @RequestMapping("/getupdateDe")
  public String getUpdateUser(String id){
    Deliver deliver=deliverDao.getUpdateDeliver(id);
    String string=JSON.toJSONString(deliver);
    return string;
  }

  @RequestMapping("/allDe")
  public String getDeliverList(QueryInfo queryInfo){
    int numbers=deliverDao.getDeliverCounts("%"+queryInfo.getQuery()+"%");
    int pageStart=(queryInfo.getPageNum()-1)* queryInfo.getPageSize();
    List<Deliver> da=deliverDao.getAllDeliver("%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());
    HashMap<String,Object> res=new HashMap<>();
    res.put("numbers",numbers);
    res.put("data",da);
    String res_string=JSON.toJSONString(res);
    return res_string;
  }
}
