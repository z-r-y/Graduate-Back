package com.graduate.zry.dao;

import com.graduate.zry.bean.MainMenu;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuDao {
  public List<MainMenu> getMenus();
}
