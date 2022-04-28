package com.example.cmimock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CmiMockApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmiMockApplication.class, args);
    }

}
