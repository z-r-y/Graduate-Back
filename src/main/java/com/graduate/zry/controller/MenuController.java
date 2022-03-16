package com.graduate.zry.controller;

import com.alibaba.fastjson.JSON;
import com.graduate.zry.bean.MainMenu;
import com.graduate.zry.dao.MenuDao;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {
  @Autowired
  MenuDao menuDao;

  @RequestMapping("/menus")
  public String getAllMenus(){
    System.out.println("访问成功");
    HashMap<String,Object> data=new HashMap<>();
    List<MainMenu> menus=menuDao.getMenus();
    if(menus!=null){
      data.put("menus",menus);
      data.put("flag",200);
    }else {
      data.put("flag",404);
    }
    String s= JSON.toJSONString(data);
    return s;
  }
}
