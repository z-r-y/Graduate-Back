package com.graduate.zry.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Timestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class Io {
private int id;
private boolean state;
private int outport;
private Timestamp out_time;
private int inport;
private Timestamp in_time;
private String people;
private String boss;

  public Io() {
  }

  public Io(boolean state, int outport, Timestamp out_time, int inport, Timestamp in_time,
      String people, String boss) {
    this.state = state;
    this.outport = outport;
    this.out_time = out_time;
    this.inport = inport;
    this.in_time = in_time;
    this.people = people;
    this.boss = boss;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean isState() {
    return state;
  }

  public void setState(boolean state) {
    this.state = state;
  }

  public int getOutport() {
    return outport;
  }

  public void setOutport(int outport) {
    this.outport = outport;
  }

  public Timestamp getOut_time() {
    return out_time;
  }

  public void setOut_time(Timestamp out_time) {
    this.out_time = out_time;
  }

  public int getInport() {
    return inport;
  }

  public void setInport(int inport) {
    this.inport = inport;
  }

  public Timestamp getIn_time() {
    return in_time;
  }

  public void setIn_time(Timestamp in_time) {
    this.in_time = in_time;
  }

  public String getPeople() {
    return people;
  }

  public void setPeople(String people) {
    this.people = people;
  }

  public String getBoss() {
    return boss;
  }

  public void setBoss(String boss) {
    this.boss = boss;
  }

  @Override
  public String toString() {
    return "Io{" +
        "id=" + id +
        ", state=" + state +
        ", outport=" + outport +
        ", out_time=" + out_time +
        ", inport=" + inport +
        ", in_time=" + in_time +
        ", people='" + people + '\'' +
        ", boss='" + boss + '\'' +
        '}';
  }
}
