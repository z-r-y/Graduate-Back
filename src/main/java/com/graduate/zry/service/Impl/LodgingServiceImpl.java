package com.graduate.zry.service.Impl;

import com.graduate.zry.dao.LodgingDao;
import com.graduate.zry.dao.RetreatDao;
import com.graduate.zry.service.LodgingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LodgingServiceImpl implements LodgingService
{
@Autowired
  LodgingDao lodgingDao;
@Autowired
  RetreatDao retreatDao;

  @Override
  public String Test(String id) {
    return null;
  }
}
