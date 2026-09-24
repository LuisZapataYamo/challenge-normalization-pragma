package com.pragma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.pragma", "com.fintech"})
public class DataNormalizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataNormalizationApplication.class, args);
    }
}
