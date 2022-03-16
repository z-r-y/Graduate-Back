package com.graduate.zry.dao;

import com.graduate.zry.bean.Daily;
import com.graduate.zry.bean.Io;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IoDao {
  public List<Io> getAllIo(@Param("id") String id,@Param("pageStart") int PageStart,@Param("pageSize") int PageSize);
  public int getIoCounts(@Param("id") String id);
  public int addIo(Io io);
  public int deleteIo(String id);
  public Io getUpdateIo(int id);
  public int editIo(Io io);
  public int updateState(int id,Boolean state);
  public int getOneIo(@Param("id") int id);
  public int getOneOut(@Param("id") int id);
}
