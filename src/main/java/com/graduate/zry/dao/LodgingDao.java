package com.graduate.zry.dao;

import com.graduate.zry.bean.Lodging;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LodgingDao {
  public List<Lodging> getAllLodging(@Param("p_id") String p_id, @Param("pageStart") int PageStart, @Param("pageSize") int PageSize);
  public int getLodgingCounts(@Param("p_id") String p_id);
  public int addLodging(Lodging lodging);
  public int deleteLodging(String p_id);
  public Lodging getUpdateLodging(String p_id);
  public int editLodgin(Lodging lodgin);
  public int updateState(String p_id,Boolean re_state);
  public List<Lodging> bbb(@Param("p_id") String p_id);
}
