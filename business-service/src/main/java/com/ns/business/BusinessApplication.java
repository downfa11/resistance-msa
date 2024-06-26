package com.ns.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class BusinessApplication {

    public static void main(String[] args){
        SpringApplication.run(BusinessApplication.class,args);
    }
}