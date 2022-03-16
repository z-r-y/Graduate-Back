package com.graduate.zry.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.DataTruncation;
import java.sql.Date;
import java.sql.Time;
import javax.xml.crypto.Data;
import org.springframework.format.annotation.DateTimeFormat;

public class Distribute {
private String r_id;
private String p_id;
private int d_many;
private Date d_time;
private int b;
private String breakfirst;
private int l;
private String lunch;
private int d;
private String dinner;

  public Distribute() {
  }

  public Distribute(String r_id, String p_id, int d_many, int b, String breakfirst, int l,
      String lunch, int d, String dinner) {
    this.r_id = r_id;
    this.p_id = p_id;
    this.d_many = d_many;
    this.b = b;
    this.breakfirst = breakfirst;
    this.l = l;
    this.lunch = lunch;
    this.d = d;
    this.dinner = dinner;
  }

  public String getR_id() {
    return r_id;
  }

  public void setR_id(String r_id) {
    this.r_id = r_id;
  }

  public String getP_id() {
    return p_id;
  }

  public void setP_id(String p_id) {
    this.p_id = p_id;
  }

  public int getD_many() {
    return d_many;
  }

  public void setD_many(int d_many) {
    this.d_many = d_many;
  }

  public Date getD_time() {
    return d_time;
  }

  public void setD_time(Date d_time) {
    this.d_time = d_time;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public String getBreakfirst() {
    return breakfirst;
  }

  public void setBreakfirst(String breakfirst) {
    this.breakfirst = breakfirst;
  }

  public int getL() {
    return l;
  }

  public void setL(int l) {
    this.l = l;
  }

  public String getLunch() {
    return lunch;
  }

  public void setLunch(String lunch) {
    this.lunch = lunch;
  }

  public int getD() {
    return d;
  }

  public void setD(int d) {
    this.d = d;
  }

  public String getDinner() {
    return dinner;
  }

  public void setDinner(String dinner) {
    this.dinner = dinner;
  }

  @Override
  public String toString() {
    return "Distribute{" +
        "r_id='" + r_id + '\'' +
        ", p_id='" + p_id + '\'' +
        ", d_many=" + d_many +
        ", d_time=" + d_time +
        ", b=" + b +
        ", breakfirst='" + breakfirst + '\'' +
        ", l=" + l +
        ", lunch='" + lunch + '\'' +
        ", d=" + d +
        ", dinner='" + dinner + '\'' +
        '}';
  }
}
