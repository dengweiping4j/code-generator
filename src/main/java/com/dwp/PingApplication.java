package com.dwp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dwp.dao" )
public class PingApplication {

    public static void main(String[] args) {
        SpringApplication.run(PingApplication.class, args);
    }
}
