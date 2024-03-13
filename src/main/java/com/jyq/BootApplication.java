package com.jyq;

import com.jyq.controller.TestController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.jyq.dao")
@SpringBootApplication
public class BootApplication {


    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);


    }
}