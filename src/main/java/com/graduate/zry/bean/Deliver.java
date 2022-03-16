package com.graduate.zry.bean;

public class Deliver {
private String id;
private String r_id;
private String d_name;
private String d_plantform;
private String d_business;

  public Deliver() {
  }

  public Deliver(String r_id, String d_name, String d_plantform, String d_business) {
    this.r_id = r_id;
    this.d_name = d_name;
    this.d_plantform = d_plantform;
    this.d_business = d_business;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getR_id() {
    return r_id;
  }

  public void setR_id(String r_id) {
    this.r_id = r_id;
  }

  public String getD_name() {
    return d_name;
  }

  public void setD_name(String d_name) {
    this.d_name = d_name;
  }

  public String getD_plantform() {
    return d_plantform;
  }

  public void setD_plantform(String d_plantform) {
    this.d_plantform = d_plantform;
  }

  public String getD_business() {
    return d_business;
  }

  public void setD_business(String d_business) {
    this.d_business = d_business;
  }

  @Override
  public String toString() {
    return "Deliver{" +
        "id='" + id + '\'' +
        ", r_id='" + r_id + '\'' +
        ", d_name='" + d_name + '\'' +
        ", d_plantform='" + d_plantform + '\'' +
        ", d_business='" + d_business + '\'' +
        '}';
  }
}
