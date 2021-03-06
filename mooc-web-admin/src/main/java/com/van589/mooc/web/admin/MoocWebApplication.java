package com.van589.mooc.web.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.van589.mooc.web.admin.dao")
@EnableTransactionManagement
@SpringBootApplication
public class MoocWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoocWebApplication.class, args);
    }

}
