package com.graduate.zry.dao;

import com.graduate.zry.bean.Retreat;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
public interface RetreatDao {
  public List<Retreat> getAllRetreat(@Param("p_id") String p_id, @Param("pageStart") int PageStart, @Param("pageSize") int PageSize);
  public int getRetreatCounts(@Param("p_id") String p_id);
  public int addRetreat(Retreat retreat);
  public int deleteRetreat(String p_id);
  public Retreat getUpdateRetreat(String p_id);
  public int editRetreat(Retreat retreat);
  public String aaa(@Param("p_id") String p_id);

}

