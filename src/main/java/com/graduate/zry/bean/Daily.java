package com.graduate.zry.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Timestamp;
import org.springframework.format.annotation.DateTimeFormat;

public class Daily {
  private String r_id;
  private String p_id;
  private float f_tem;
  private float s_tem;
  private String symptoms;
  private boolean state;
  private Timestamp time;

  public Daily() {
  }

  public Daily(String r_id, float f_tem, float s_tem, String symptoms, boolean state,
      Timestamp time) {
    this.r_id = r_id;
    this.f_tem = f_tem;
    this.s_tem = s_tem;
    this.symptoms = symptoms;
    this.state = state;
    this.time = time;
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

  public float getF_tem() {
    return f_tem;
  }

  public void setF_tem(float f_tem) {
    this.f_tem = f_tem;
  }

  public float getS_tem() {
    return s_tem;
  }

  public void setS_tem(float s_tem) {
    this.s_tem = s_tem;
  }

  public String getSymptoms() {
    return symptoms;
  }

  public void setSymptoms(String symptoms) {
    this.symptoms = symptoms;
  }

  public boolean getState() {
    return state;
  }

  public void setState(boolean state) {
    this.state = state;
  }

  public Timestamp getTime() {
    return time;
  }

  public void setTime(Timestamp time) {
    this.time = time;
  }

  @Override
  public String toString() {
    return "Daily{" +
        "r_id='" + r_id + '\'' +
        ", p_id='" + p_id + '\'' +
        ", f_tem=" + f_tem +
        ", s_tem=" + s_tem +
        ", symptoms='" + symptoms + '\'' +
        ", state=" + state +
        ", time=" + time +
        '}';
  }
}
