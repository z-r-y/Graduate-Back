package com.graduate.zry.dao;

import com.graduate.zry.bean.Environment;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvironmentDao {
  public List<Environment> getAllEnvironment(@Param("id") String id, @Param("pageStart") int PageStart, @Param("pageSize") int PageSize);
  public int getEnvironmentCounts(@Param("id") String id);
  public int addEnvironment(Environment Environment);
  public int deleteEnvironment(String id);
  public Environment getUpdateEnvironment(String id);
  public int editEnvironment(Environment deliver);
  public int updateState(String id,Boolean state);
}
