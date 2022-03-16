package com.graduate.zry.bean;

public class Room {
private String r_id;
private boolean r_state;

  public Room( boolean r_state) {
    this.r_state = r_state;
  }

  public Room() {
  }

  public String getR_id() {
    return r_id;
  }

  public void setR_id(String r_id) {
    this.r_id = r_id;
  }

  public boolean isR_state() {
    return r_state;
  }

  public void setR_state(boolean r_state) {
    this.r_state = r_state;
  }

  @Override
  public String toString() {
    return "Room{" +
        "r_id='" + r_id + '\'' +
        ", r_tate=" + r_state +
        '}';
  }
}
