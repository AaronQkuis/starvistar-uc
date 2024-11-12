package com.starvistar.uc;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class UcApplication {

    public static void main(String[] args) {
        SpringApplication.run(UcApplication.class, args);
    }

}
