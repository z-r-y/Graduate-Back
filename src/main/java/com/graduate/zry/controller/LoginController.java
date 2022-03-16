package com.graduate.zry.controller;

import com.alibaba.fastjson.JSON;
import com.graduate.zry.bean.Login;
import com.graduate.zry.bean.QueryInfo;
import com.graduate.zry.dao.LoginDao;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
  @Autowired
  LoginDao loginDao;


  @RequestMapping("/login")
  public String login(@RequestBody Login login){
    String flag="error";
    Login l = loginDao.getLoginByMassage(login.getId(),login.getPasswd());
    System.out.println("login"+l);
    HashMap<String,Object> res=new HashMap<>();
    if(l!=null){
      flag="ok";
    }
    res.put("flag",flag);
    res.put("login",login);
    String res_json=JSON.toJSONString(res);
    return res_json;
  }
  @RequestMapping("alllogin")
  public String getLoginList(QueryInfo queryInfo){
    int numbers=loginDao.getLoginCounts("%"+queryInfo.getQuery()+"%");
    int pageStart=(queryInfo.getPageNum()-1)* queryInfo.getPageSize();
    List<Login> lo=loginDao.getAllLogin("%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());
    HashMap<String,Object> res=new HashMap<>();
    res.put("numbers",numbers);
    res.put("data",lo);
    String res_string=JSON.toJSONString(res);
    return res_string;
  }

@RequestMapping("/userState")
public String updateUserState(@RequestParam("id") String  id,
    @RequestParam("state") Boolean state){
  int i = loginDao.updateState(id, state);
  System.out.println("用户编号:"+id);
  System.out.println("用户状态:"+state);
  String str = i >0?"success":"error";
  return str;
}

@RequestMapping("/addUser")
public String addUser(@RequestBody Login login){
    login.setState(true);
    int i=loginDao.addUser(login);
    return i > 0 ? "success":"error";
}

@RequestMapping("/deleteUser")
public String deleteUser(String id){
    int i=loginDao.deleteUser(id);
    return i>0?"success":"error";
}

@RequestMapping("/getupdate")
public String getUpdateUser(String id){
    Login login=loginDao.getUpdateUser(id);
    String string=JSON.toJSONString(login);
    return string;
}

@RequestMapping("/edituser")
  public String editUser(@RequestBody Login login){
    int i=loginDao.editUser(login);
    return i>0?"success":"error";
}
}
