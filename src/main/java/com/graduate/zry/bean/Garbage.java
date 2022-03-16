package com.graduate.zry.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Timestamp;
import org.springframework.format.annotation.DateTimeFormat;

public class Garbage {
private int id;
private Timestamp g_dt;
private String water;
private String goods;
private String w_man;
private String g_man;

  public Garbage() {
  }

  public Garbage(Timestamp g_dt, String water, String goods, String w_man, String g_man) {
    this.g_dt = g_dt;
    this.water = water;
    this.goods = goods;
    this.w_man = w_man;
    this.g_man = g_man;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Timestamp getG_dt() {
    return g_dt;
  }

  public void setG_dt(Timestamp g_dt) {
    this.g_dt = g_dt;
  }

  public String getWater() {
    return water;
  }

  public void setWater(String water) {
    this.water = water;
  }

  public String getGoods() {
    return goods;
  }

  public void setGoods(String goods) {
    this.goods = goods;
  }

  public String getW_man() {
    return w_man;
  }

  public void setW_man(String w_man) {
    this.w_man = w_man;
  }

  public String getG_man() {
    return g_man;
  }

  public void setG_man(String g_man) {
    this.g_man = g_man;
  }

  @Override
  public String toString() {
    return "Garbage{" +
        "id=" + id +
        ", g_dt=" + g_dt +
        ", water='" + water + '\'' +
        ", goods='" + goods + '\'' +
        ", w_man='" + w_man + '\'' +
        ", g_man='" + g_man + '\'' +
        '}';
  }
}
