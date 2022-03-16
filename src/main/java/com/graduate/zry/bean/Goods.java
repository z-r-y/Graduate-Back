package com.graduate.zry.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class Goods {
private int id;
private String name;
private String vendor;
private Date e_time;
private Date l_time;
private int many;
private int r_require;
private int e_require;
private String e_add;

  public Goods() {
  }

  public Goods(String name, String vendor, Date e_time, Date l_time, int many, int r_require,
      int e_require, String e_add) {
    this.name = name;
    this.vendor = vendor;
    this.e_time = e_time;
    this.l_time = l_time;
    this.many = many;
    this.r_require = r_require;
    this.e_require = e_require;
    this.e_add = e_add;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public Date getE_time() {
    return e_time;
  }

  public void setE_time(Date e_time) {
    this.e_time = e_time;
  }

  public Date getL_time() {
    return l_time;
  }

  public void setL_time(Date l_time) {
    this.l_time = l_time;
  }

  public int getMany() {
    return many;
  }

  public void setMany(int many) {
    this.many = many;
  }

  public int getR_require() {
    return r_require;
  }

  public void setR_require(int r_require) {
    this.r_require = r_require;
  }

  public int getE_require() {
    return e_require;
  }

  public void setE_require(int e_require) {
    this.e_require = e_require;
  }

  public String getE_add() {
    return e_add;
  }

  public void setE_add(String e_add) {
    this.e_add = e_add;
  }

  @Override
  public String toString() {
    return "Goods{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", vendor='" + vendor + '\'' +
        ", e_time=" + e_time +
        ", l_time=" + l_time +
        ", many=" + many +
        ", r_require=" + r_require +
        ", e_require=" + e_require +
        ", e_add='" + e_add + '\'' +
        '}';
  }
}
