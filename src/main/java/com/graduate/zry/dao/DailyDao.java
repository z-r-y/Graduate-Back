package com.graduate.zry.dao;

import com.graduate.zry.bean.Daily;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyDao {
  public List<Daily> getAllDaily(@Param("p_id") String p_id,@Param("pageStart") int PageStart,@Param("pageSize") int PageSize);
  public int getDailyCounts(@Param("p_id") String p_id);
  public int addDaily(Daily daily);
  public int deleteDaily(String p_id);
  public Daily getUpdateDaily(String p_id);
  public int editDaily(Daily daily);
  public int updateState(String p_id,Boolean state);
}
