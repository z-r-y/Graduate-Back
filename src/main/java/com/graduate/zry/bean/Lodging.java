package com.graduate.zry.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Timestamp;
import org.springframework.format.annotation.DateTimeFormat;

public class Lodging {
private String r_id;
private String p_id;
private Timestamp l_time;
private boolean re_state;
  public Lodging(String r_id, Timestamp l_time, boolean re_state) {
    this.r_id = r_id;
    this.l_time = l_time;
    this.re_state = re_state;
  }

  public Lodging() {
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

  public Timestamp getL_time() {
    return l_time;
  }

  public void setL_time(Timestamp l_time) {
    this.l_time = l_time;
  }

  public boolean isRe_state() {
    return re_state;
  }

  public void setRe_state(boolean re_state) {
    this.re_state = re_state;
  }

  @Override
  public String toString() {
    return "Lodging{" +
        "r_id='" + r_id + '\'' +
        ", p_id='" + p_id + '\'' +
        ", l_time=" + l_time +
        ", re_state=" + re_state +
        '}';
  }
}
