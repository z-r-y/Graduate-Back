package com.graduate.zry;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.graduate.zry.dao")
@SpringBootApplication
public class ZryApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZryApplication.class, args);
  }

}
