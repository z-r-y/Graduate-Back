package com.graduate.zry.dao;

import com.graduate.zry.bean.Daily;
import com.graduate.zry.bean.Deliver;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliverDao {
  public List<Deliver> getAllDeliver(@Param("id") String id, @Param("pageStart") int PageStart, @Param("pageSize") int PageSize);
  public int getDeliverCounts(@Param("id") String id);
  public int addDeliver(Deliver deliver);
  public int deleteDeliver(String id);
  public Deliver getUpdateDeliver(String id);
  public int editDeliver(Deliver deliver);
}
