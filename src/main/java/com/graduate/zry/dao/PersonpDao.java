package com.graduate.zry.dao;

import com.graduate.zry.bean.Person;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonpDao {
  public List<Person> getAllPerson(@Param("p_id") String p_id, @Param("pageStart") int PageStart, @Param("pageSize") int PageSize);
  public int getPersonCounts(@Param("p_id") String p_id);
  public int addPerson(Person person);
  public int deletePerson(String p_id);
  public Person getUpdatePerson(String p_id);
  public int editPerson(Person person);
}
