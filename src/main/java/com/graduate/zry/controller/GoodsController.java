package com.graduate.zry.controller;

import com.alibaba.fastjson.JSON;
import com.graduate.zry.bean.Environment;
import com.graduate.zry.bean.Goods;
import com.graduate.zry.bean.QueryInfo;
import com.graduate.zry.dao.GoodsDao;
import com.graduate.zry.service.GoodService;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {
  @Autowired
  GoodsDao goodsDao;
  @Autowired
  private GoodService goodService;

  @RequestMapping("/addGo")
  public String addGoods(@RequestBody Goods goods){
    int i=goodsDao.addGoods(goods);
    return i > 0 ? "success":"error";
  }
  @RequestMapping("/getupdateGo")
  public String getUpdateUser(int id){
    Goods goods= goodsDao.getUpdateGoods(id);
    String string=JSON.toJSONString(goods);
    return string;
  }

  @RequestMapping("/deleteGo")
  public String deleteGoods(String id){
    int i=goodsDao.deleteGoods(id);
    return i>0?"success":"error";
  }

  @RequestMapping("/updateGo")
  public String getUpdateGoods(int id){
    Goods goods=goodsDao.getUpdateGoods(id);
    String string= JSON.toJSONString(goods);
    return string;
  }

  @RequestMapping("/editGo")
  public String editGoods(@RequestBody Goods goods){
    int i=goodsDao.editGoods(goods);
    return i>0?"success":"error";
  }

  @RequestMapping("/allGo")
  public String getGoodsList(QueryInfo queryInfo){
    int numbers=goodsDao.getGoodsCounts("%"+queryInfo.getQuery()+"%");
    int pageStart=(queryInfo.getPageNum()-1)* queryInfo.getPageSize();
    List<Goods> da=goodsDao.getAllGoods("%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());
    HashMap<String,Object> res=new HashMap<>();
    res.put("numbers",numbers);
    res.put("data",da);
    String res_string=JSON.toJSONString(res);
    return res_string;
  }
}
