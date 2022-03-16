package com.graduate.zry.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Timestamp;
import org.springframework.format.annotation.DateTimeFormat;

public class Retreat {
private String p_id;
private String r_id;
private Timestamp r_time;

  public Retreat() {
  }

  public Retreat(String r_id, Timestamp r_time) {
    this.r_id = r_id;
    this.r_time = r_time;
  }

  public String getP_id() {
    return p_id;
  }

  public void setP_id(String p_id) {
    this.p_id = p_id;
  }

  public String getR_id() {
    return r_id;
  }

  public void setR_id(String r_id) {
    this.r_id = r_id;
  }

  public Timestamp getR_time() {
    return r_time;
  }

  public void setR_time(Timestamp r_time) {
    this.r_time = r_time;
  }

  @Override
  public String toString() {
    return "Retreat{" +
        "p_id='" + p_id + '\'' +
        ", r_id='" + r_id + '\'' +
        ", r_time=" + r_time +
        '}';
  }
}
