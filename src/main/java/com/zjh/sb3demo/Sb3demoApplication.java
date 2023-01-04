package com.zjh.sb3demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableConfigurationProperties
@EnableAspectJAutoProxy
@EnableWebSecurity
public class Sb3demoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sb3demoApplication.class, args);
    }

}
