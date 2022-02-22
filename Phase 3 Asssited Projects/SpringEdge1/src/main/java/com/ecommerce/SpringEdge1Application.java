package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringEdge1Application {

        public static void main(String[] args) {
                SpringApplication.run(SpringEdge1Application.class, args);
        }

}

