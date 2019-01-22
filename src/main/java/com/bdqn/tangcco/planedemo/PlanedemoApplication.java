package com.bdqn.tangcco.planedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bdqn.tangcco.planedemo.*.dao")
public class PlanedemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlanedemoApplication.class, args);
    }
}

