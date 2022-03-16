package com.graduate.zry.dao;

import com.graduate.zry.bean.Login;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.juli.logging.Log;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface LoginDao {
  public Login getLoginByMassage(@Param("id") String id,@Param("passwd") String passwd);
  public List<Login> getAllLogin(@Param("id") String id,@Param("pageStart") int PageStart,@Param("pageSize") int PageSize);
  public int getLoginCounts(@Param("id") String id);
  public int updateState(String id,Boolean state);
  public int addUser(Login login);
  public int deleteUser(String id);
  public Login getUpdateUser(String id);
  public int editUser(Login login);
}
