package com.graduate.zry.dao;

import com.graduate.zry.bean.Person;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonwDao {
  public List<Person> getAllPersonw(@Param("p_id") String p_id, @Param("pageStart") int PageStart, @Param("pageSize") int PageSize);
  public int getPersonwCounts(@Param("p_id") String p_id);
  public int addPersonw(Person person);
  public int deletePersonw(String p_id);
  public Person getUpdatePersonw(String p_id);
  public int editPersonw(Person person);
}
