package com.graduate.zry.bean;

public class Ingredients {
private String i_name;
private String i_vendor;
private String i_address;
private String i_price;
private String i_many;

  public Ingredients() {
  }

  public Ingredients(String i_vendor, String i_address, String i_price, String i_many) {
    this.i_vendor = i_vendor;
    this.i_address = i_address;
    this.i_price = i_price;
    this.i_many = i_many;
  }

  public String getI_name() {
    return i_name;
  }

  public void setI_name(String i_name) {
    this.i_name = i_name;
  }

  public String getI_vendor() {
    return i_vendor;
  }

  public void setI_vendor(String i_vendor) {
    this.i_vendor = i_vendor;
  }

  public String getI_address() {
    return i_address;
  }

  public void setI_address(String i_address) {
    this.i_address = i_address;
  }

  public String getI_price() {
    return i_price;
  }

  public void setI_price(String i_price) {
    this.i_price = i_price;
  }

  public String getI_many() {
    return i_many;
  }

  public void setI_many(String i_many) {
    this.i_many = i_many;
  }

  @Override
  public String toString() {
    return "Ingredients{" +
        "i_name='" + i_name + '\'' +
        ", i_vendor='" + i_vendor + '\'' +
        ", i_address='" + i_address + '\'' +
        ", i_price='" + i_price + '\'' +
        ", i_many='" + i_many + '\'' +
        '}';
  }
}
