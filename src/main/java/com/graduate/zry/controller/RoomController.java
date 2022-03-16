package com.graduate.zry.controller;

import com.alibaba.fastjson.JSON;
import com.graduate.zry.bean.Room;
import com.graduate.zry.bean.QueryInfo;
import com.graduate.zry.dao.RoomDao;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
  @Autowired
  RoomDao roomDao;

  @RequestMapping("/addRo")
  public String addroom(@RequestBody Room room){
    int i=roomDao.addRoom(room);
    return i > 0 ? "success":"error";
  }

  @RequestMapping("/deleteRo")
  public String deleteroom(String r_id){
    int i=roomDao.deleteRoom(r_id);
    return i>0?"success":"error";
  }

  @RequestMapping("/updateRo")
  public String getUpdateroom(String r_id){
    Room room=roomDao.getUpdateRoom(r_id);
    String string= JSON.toJSONString(room);
    return string;
  }

  @RequestMapping("/editRo")
  public String editroom(@RequestBody Room room){
    int i=roomDao.editRoom(room);
    return i>0?"success":"error";
  }
  @RequestMapping("/roomState")
  public String updateRoomState(@RequestParam("r_id") String  r_id,
      @RequestParam("r_state") Boolean r_state){
    int i = roomDao.updateState(r_id, r_state);
    System.out.println("用户编号:"+r_id);
    System.out.println("用户状态:"+r_state);
    String str = i >0?"success":"error";
    return str;
  }

  @RequestMapping("/allRo")
  public String getroomList(QueryInfo queryInfo){
    int numbers= roomDao.getRoomCounts("%"+queryInfo.getQuery()+"%");
    int pageStart=(queryInfo.getPageNum()-1)* queryInfo.getPageSize();
    List<Room> da=roomDao.getAllRoom("%"+queryInfo.getQuery()+"%",pageStart, queryInfo.getPageSize());
    HashMap<String,Object> res=new HashMap<>();
    res.put("numbers",numbers);
    res.put("data",da);
    String res_string=JSON.toJSONString(res);
    return res_string;
  }
}
