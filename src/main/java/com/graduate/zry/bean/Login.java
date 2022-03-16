package com.graduate.zry.bean;
//用户实体
public class Login {
  private String id;
  private String passwd;
  private boolean state;
  private int identity;

  public Login(){

  }

  public Login(String passwd, boolean state, int identity) {
    this.passwd = passwd;
    this.state = state;
    this.identity = identity;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPasswd() {
    return passwd;
  }

  public void setPasswd(String passwd) {
    this.passwd = passwd;
  }

  public boolean getState() {
    return state;
  }

  public void setState(boolean state) {
    this.state = state;
  }

  public int getIdentity() {
    return identity;
  }

  public void setIdentity(int identity) {
    this.identity = identity;
  }
}
