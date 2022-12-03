package com.zjh.sb3demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableConfigurationProperties
@EnableAspectJAutoProxy
public class Sb3demoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sb3demoApplication.class, args);
    }

}
