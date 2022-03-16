package com.graduate.zry.controller;

import com.alibaba.fastjson.JSON;
import com.graduate.zry.bean.Retreat;
import com.graduate.zry.bean.QueryInfo;
import com.graduate.zry.dao.RetreatDao;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetreatController {
  @Autowired
  RetreatDao retreatDao;

  @RequestMapping("/addRe")
  public String addretreat(@RequestBody Retreat retreat){
    int i=retreatDao.addRetreat(retreat);
    return i > 0 ? "success":"error";
  }

  @RequestMapping("/deleteRe")
  public String deleteretreat(String p_id){
    int i=retreatDao.deleteRetreat(p_id);
    return i>0?"success":"error";
  }

  @RequestMapping("/updateRe")
  public String getUpdateretreat(String p_id){
    Retreat retreat=retreatDao.getUpdateRetreat(p_id);
    String string= JSON.toJSONString(retreat);
    return string;
  }

  @RequestMapping("/editRe")
  public String editretreat(@RequestBody Retreat retreat){
    int i=retreatDao.editRetreat(retreat);
    return i>0?"success":"error";
  }

  @RequestMapping("/allRe")
  public String getretreatList(QueryInfo queryInfo){
    int numbers=retreatDao.getRetreatCounts("%"+queryInfo.getQuery()+"%");
    int pageStart=(queryInfo.getPageNum()-1)* queryInfo.getPageSize();
    List<Retreat> da=retreatDao.getAllRetreat("%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());
    HashMap<String,Object> res=new HashMap<>();
    res.put("numbers",numbers);
    res.put("data",da);
    String res_string=JSON.toJSONString(res);
    return res_string;
  }
}
