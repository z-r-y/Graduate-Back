package com.graduate.zry.service.Impl;

import com.graduate.zry.dao.GoodsDao;
import com.graduate.zry.dao.IoDao;
import com.graduate.zry.service.GoodService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GoodServiceImpl implements GoodService {
  @Autowired
  GoodsDao goodsDao;
  @Autowired
  IoDao ioDao;


  public int Test(int id) {
    System.out.println("=============无用=================");
    return 0;
  }
}
