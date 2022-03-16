package com.graduate.zry.dao;

import com.graduate.zry.bean.Garbage;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GarbageDao {
  public List<Garbage> getAllGarbage(@Param("id") String id, @Param("pageStart") int PageStart, @Param("pageSize") int PageSize);
  public int getGarbageCounts(@Param("id") String id);
  public int addGarbage(Garbage garbage);
  public int deleteGarbage(String id);
  public Garbage getUpdateGarbage(String id);
  public int editGarbage(Garbage garbage);
}
