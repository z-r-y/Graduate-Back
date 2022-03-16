package com.graduate.zry.controller;


import com.alibaba.fastjson.JSON;
import com.graduate.zry.bean.Environment;
import com.graduate.zry.bean.Garbage;
import com.graduate.zry.bean.QueryInfo;
import com.graduate.zry.dao.GarbageDao;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GarbageController {
  @Autowired
  GarbageDao garbageDao;

  @RequestMapping("/addGa")
  public String addgarbage(@RequestBody Garbage garbage){
    int i=garbageDao.addGarbage(garbage);
    return i > 0 ? "success":"error";
  }

  @RequestMapping("/deleteGa")
  public String deletegarbage(String id){
    int i=garbageDao.deleteGarbage(id);
    return i>0?"success":"error";
  }

  @RequestMapping("/getupdateGa")
  public String getUpdateUser(String id){
    Garbage garbage=garbageDao.getUpdateGarbage(id);
    String string=JSON.toJSONString(garbage);
    return string;
  }

  @RequestMapping("/updateGa")
  public String getUpdategarbage(String id){
    Garbage garbage=garbageDao.getUpdateGarbage(id);
    String string= JSON.toJSONString(garbage);
    return string;
  }

  @RequestMapping("/editGa")
  public String editgarbage(@RequestBody Garbage garbage){
    int i=garbageDao.editGarbage(garbage);
    return i>0?"success":"error";
  }

  @RequestMapping("/allGa")
  public String getgarbageList(QueryInfo queryInfo){
    int numbers=garbageDao.getGarbageCounts("%"+queryInfo.getQuery()+"%");
    int pageStart=(queryInfo.getPageNum()-1)* queryInfo.getPageSize();
    List<Garbage> da=garbageDao.getAllGarbage("%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());
    HashMap<String,Object> res=new HashMap<>();
    res.put("numbers",numbers);
    res.put("data",da);
    String res_string=JSON.toJSONString(res);
    return res_string;
  }
}
