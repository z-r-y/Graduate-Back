package com.graduate.zry.bean;

public class Person {
private String p_id;
private String p_phone;
private String morbidity;
private int age;
private String p_from;
private String p_arrive;
private String p_name;
private int p_type;

  public Person() {
  }

  public Person(String p_phone, String morbidity, int age, String p_from, String p_arrive,
      String p_name, int p_type) {
    this.p_phone = p_phone;
    this.morbidity = morbidity;
    this.age = age;
    this.p_from = p_from;
    this.p_arrive = p_arrive;
    this.p_name = p_name;
    this.p_type = p_type;
  }

  public String getP_id() {
    return p_id;
  }

  public void setP_id(String p_id) {
    this.p_id = p_id;
  }

  public String getP_phone() {
    return p_phone;
  }

  public void setP_phone(String p_phone) {
    this.p_phone = p_phone;
  }

  public String getMorbidity() {
    return morbidity;
  }

  public void setMorbidity(String morbidity) {
    this.morbidity = morbidity;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getP_from() {
    return p_from;
  }

  public void setP_from(String p_from) {
    this.p_from = p_from;
  }

  public String getP_arrive() {
    return p_arrive;
  }

  public void setP_arrive(String p_arrive) {
    this.p_arrive = p_arrive;
  }

  public String getP_name() {
    return p_name;
  }

  public void setP_name(String p_name) {
    this.p_name = p_name;
  }

  public int getP_type() {
    return p_type;
  }

  public void setP_type(int p_type) {
    this.p_type = p_type;
  }

  @Override
  public String toString() {
    return "Person{" +
        "p_id='" + p_id + '\'' +
        ", p_phone='" + p_phone + '\'' +
        ", morbidity='" + morbidity + '\'' +
        ", age=" + age +
        ", p_from='" + p_from + '\'' +
        ", p_arrive='" + p_arrive + '\'' +
        ", p_name='" + p_name + '\'' +
        ", p_type=" + p_type +
        '}';
  }
}
