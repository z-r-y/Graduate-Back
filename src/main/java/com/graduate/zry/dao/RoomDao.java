package com.graduate.zry.dao;

import com.graduate.zry.bean.Room;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomDao {
  public List<Room> getAllRoom(@Param("r_id") String r_id,@Param("pageStart") int PageStart,@Param("pageSize") int PageSize);
  public int getRoomCounts(@Param("r_id") String r_id);
  public int addRoom(Room room);
  public int deleteRoom(String r_id);
  public Room getUpdateRoom(String r_id);
  public int editRoom(Room room);
  public int updateState(String r_id,Boolean r_state);
}
