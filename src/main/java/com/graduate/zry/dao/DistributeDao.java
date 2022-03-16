package com.graduate.zry.dao;

import com.graduate.zry.bean.Deliver;
import com.graduate.zry.bean.Distribute;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DistributeDao {
  public List<Distribute> getAllDistribute(@Param("p_id") String p_id, @Param("pageStart") int PageStart, @Param("pageSize") int PageSize);
  public int getDistributeCounts(@Param("p_id") String p_id);
  public int addDistribute(Distribute distribute);
  public int deleteDistribute(String p_id);
  public Distribute getUpdateDistribute(String p_id);
  public int editDistribute(Distribute distribute);
}
