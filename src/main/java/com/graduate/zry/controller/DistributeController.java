package com.graduate.zry.controller;

import com.alibaba.fastjson.JSON;
import com.graduate.zry.bean.Deliver;
import com.graduate.zry.bean.Distribute;
import com.graduate.zry.bean.Login;
import com.graduate.zry.bean.QueryInfo;
import com.graduate.zry.dao.DistributeDao;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistributeController {
@Autowired
  DistributeDao distributeDao;

  @RequestMapping("/addDi")
  public String addDistribute(@RequestBody Distribute distribute){
    int i=distributeDao.addDistribute(distribute);
    return i > 0 ? "success":"error";
  }

  @RequestMapping("/deleteDi")
  public String deleteDistribute(String p_id){
    int i=distributeDao.deleteDistribute(p_id);
    return i>0?"success":"error";
  }

  @RequestMapping("/updateDi")
  public String getUpdateDistribute(String p_id){
    Distribute distribute=distributeDao.getUpdateDistribute(p_id);
    /*System.out.println(distribute.getD_time());*/
    String string= JSON.toJSONString(distribute);
    return string;
  }

  @RequestMapping("/editDi")
  public String editDistribute(@RequestBody Distribute distribute){
    int i=distributeDao.editDistribute(distribute);
    System.out.println(distribute.getD_time());
    System.out.println(i);
    return i>0?"success":"error";
  }

  @RequestMapping("/getupdateDi")
  public String getUpdateUser(String p_id){
    Distribute distribute=distributeDao.getUpdateDistribute(p_id);
    String string=JSON.toJSONString(distribute);
    return string;
  }

  @RequestMapping("/allDi")
  public String getDistributeList(QueryInfo queryInfo){
    int numbers=distributeDao.getDistributeCounts("%"+queryInfo.getQuery()+"%");
    int pageStart=(queryInfo.getPageNum()-1)* queryInfo.getPageSize();
    List<Distribute> da=distributeDao.getAllDistribute("%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());
    HashMap<String,Object> res=new HashMap<>();
    res.put("numbers",numbers);
    res.put("data",da);
    String res_string=JSON.toJSONString(res);
    return res_string;
  }
}
