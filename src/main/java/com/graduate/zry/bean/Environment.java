package com.graduate.zry.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Timestamp;
import org.springframework.format.annotation.DateTimeFormat;

public class Environment {
private int id;
private Timestamp e_dt;
private String e_people;
private String wheree;
private boolean state;
private String e_asss;

  public Environment() {
  }

  public Environment(Timestamp e_dt, String e_people, boolean state, String e_asss,String wheree) {
    this.e_dt = e_dt;
    this.e_people = e_people;
    this.state = state;
    this.e_asss = e_asss;
    this.wheree=wheree;
  }

  public String getWheree() {
    return wheree;
  }

  public void setWheree(String where) {
    this.wheree = where;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Timestamp getE_dt() {
    return e_dt;
  }

  public void setE_dt(Timestamp e_dt) {
    this.e_dt = e_dt;
  }

  public String getE_people() {
    return e_people;
  }

  public void setE_people(String e_people) {
    this.e_people = e_people;
  }

  public boolean isState() {
    return state;
  }

  public void setState(boolean state) {
    this.state = state;
  }

  public String getE_asss() {
    return e_asss;
  }

  public void setE_asss(String e_asss) {
    this.e_asss = e_asss;
  }

  @Override
  public String toString() {
    return "Environment{" +
        "id=" + id +
        ", e_dt=" + e_dt +
        ", e_people='" + e_people + '\'' +
        ", where='" + wheree + '\'' +
        ", state=" + state +
        ", e_asss='" + e_asss + '\'' +
        '}';
  }
}
