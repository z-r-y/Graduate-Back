package com.graduate.zry.controller;

import com.alibaba.fastjson.JSON;
import com.graduate.zry.bean.Lodging;
import com.graduate.zry.bean.QueryInfo;
import com.graduate.zry.bean.Retreat;
import com.graduate.zry.dao.LodgingDao;
import com.graduate.zry.dao.RetreatDao;
import com.graduate.zry.service.LodgingService;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LodgingController implements LodgingService {
  @Autowired
  LodgingDao lodgingDao;
  @Autowired
  RetreatDao retreatDao;

  @RequestMapping("/addLo")
  public String addlodging(@RequestBody Lodging lodging){
    int i=lodgingDao.addLodging(lodging);
    return i > 0 ? "success":"error";
  }

  @RequestMapping("/lodgingState")
  public String updateLodgingState(@RequestParam("p_id") String  p_id,
      @RequestParam("re_state") Boolean re_state){
    int i = lodgingDao.updateState(p_id, re_state);
    System.out.println("用户编号:"+p_id);
    System.out.println("用户状态:"+re_state);
    String ii=Test(p_id);
    String first = lodgingDao.bbb(p_id).get(0).getR_id();

    String str = i >0 && ii==p_id?"success":"error";
    return str;
  }

  @RequestMapping("/deleteLo")
  public String deletelodging(String p_id){
    int i=lodgingDao.deleteLodging(p_id);
    return i>0?"success":"error";
  }

  @RequestMapping("/getupdateLo")
  public String getUpdateLo(String p_id){
    Lodging lodging=lodgingDao.getUpdateLodging(p_id);
    String string=JSON.toJSONString(lodging);
    return string;
  }

  @RequestMapping("/updateLo")
  public String getUpdatelodging(String p_id){
    Lodging lodging=lodgingDao.getUpdateLodging(p_id);
    String string= JSON.toJSONString(lodging);
    return string;
  }

  @RequestMapping("/editLo")
  public String editlodging(@RequestBody Lodging lodging){
    int i=lodgingDao.editLodgin(lodging);
    return i>0?"success":"error";
  }

  @RequestMapping("/allLo")
  public String getlodgingList(QueryInfo queryInfo){
    int numbers=lodgingDao.getLodgingCounts("%"+queryInfo.getQuery()+"%");
    int pageStart=(queryInfo.getPageNum()-1)* queryInfo.getPageSize();
    List<Lodging> da=lodgingDao.getAllLodging("%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());
    HashMap<String,Object> res=new HashMap<>();
    res.put("numbers",numbers);
    res.put("data",da);
    String res_string=JSON.toJSONString(res);
    return res_string;
  }

  @Override
  public String Test(String id) {
    String r_room=lodgingDao.bbb(id).get(0).getR_id();
    Retreat retreat=new Retreat();
    retreat.setP_id(id);
    retreat.setR_id(r_room);
    Timestamp date=new Timestamp(System.currentTimeMillis());
    retreat.setR_time(date);
    String reid=retreatDao.aaa(id);
    System.out.println("========================"+retreat);
    System.out.println("==================================="+reid);
    if(reid == null){
      retreatDao.addRetreat(retreat);
    }else{
      System.out.println("-----------------------------------");
      retreatDao.deleteRetreat(id);
      System.out.println("======++++++++++=======");
    }
    return id;
  }
}
