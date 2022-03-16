package com.graduate.zry.controller;

import com.alibaba.fastjson.JSON;
import com.graduate.zry.bean.Daily;
import com.graduate.zry.bean.Io;
import com.graduate.zry.bean.Login;
import com.graduate.zry.bean.QueryInfo;
import com.graduate.zry.dao.GoodsDao;
import com.graduate.zry.dao.IoDao;
import com.graduate.zry.service.GoodService;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.io.ResolverUtil.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IoController implements GoodService{
  @Autowired
  GoodsDao goodsDao;
  @Autowired
  IoDao ioDao;

  int gio,gioid;

  @RequestMapping("/addIo")
  public String addio(@RequestBody Io io){
    int i=ioDao.addIo(io);
//    尝试事务操作
    gioid=io.getId();
    int zry=Test(gioid);
    if(zry==1) {
      return i > 0 ? "success":"error";
    }else{
      return i > 0 ? "error":"error";
    }

    /*return i > 0 ? "success":"error";*/
  }

  @RequestMapping("/ioState")
  public String updateUserState(@RequestParam("id") int  id,
      @RequestParam("state") Boolean state){
    int i = ioDao.updateState(id, state);
    System.out.println("用户编号:"+id);
    System.out.println("用户状态:"+state);
    String str = i >0?"success":"error";
    return str;
  }

  @RequestMapping("/deleteIo")
  public String deleteio(String id){
    int i=ioDao.deleteIo(id);
    return i>0?"success":"error";
  }

  @RequestMapping("/updateIo")
  public String getUpdateio(int id){
    Io io=ioDao.getUpdateIo(id);

    String string= JSON.toJSONString(io);
    return string;
  }

  @RequestMapping("/getupdateIo")
  public String getUpdateUser(int id){
    Io io= ioDao.getUpdateIo(id);
    //    尝试事务操作
    gioid=io.getId();
    Test(gioid);

    String string=JSON.toJSONString(io);
    return string;
  }

  @RequestMapping("/editIo")
  public String editio(@RequestBody Io io){
    int i=ioDao.editIo(io);
    //    尝试事务操作
    gioid=io.getId();
    int zry=Test(gioid);
    if(zry==1) {
      return i > 0 ? "success":"error";
    }else{
      return i > 0 ? "error":"error";
    }

    /*return i>0?"success":"error";*/
  }

  @RequestMapping("/allIo")
  public String getIoList(QueryInfo queryInfo){
    int numbers=ioDao.getIoCounts("%"+queryInfo.getQuery()+"%");
    int pageStart=(queryInfo.getPageNum()-1)* queryInfo.getPageSize();
    List<Io> da= ioDao.getAllIo("%" + queryInfo.getQuery() + "%", pageStart, queryInfo.getPageSize());
    HashMap<String,Object> res=new HashMap<>();
    res.put("numbers",numbers);
    res.put("data",da);
    System.out.println(da);
    String res_string=JSON.toJSONString(res);
    System.out.println(res_string);
    return res_string;
  }

  @Override
  public int Test(int id) {
    System.out.println("=====================Text is Ready==============================");
    int g=goodsDao.bbb(id);
    int i=ioDao.getOneIo(id);
    int o=ioDao.getOneOut(id);
    System.out.println("===================IGO赋值已完成==================================");
    if(g-o+i >=0) {
      System.out.println("---------------计算g-o+i>0 已成功-----------");
      goodsDao.aaa(id, g - o + i);
      System.out.println("---------------------计算aaa已成功----------------");
      return 1;
    }else{
      System.out.println("----------------------计算g-o+i已失败----------");
      return 0;
    }
  }
}
