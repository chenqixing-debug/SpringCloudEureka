package com.cqx.eurekaservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {

    private static final Logger logger = LoggerFactory.getLogger(EurekaServiceApplication.class);
    public static void main(String[] args) {
        logger.info("Run Success EurekaService");
        SpringApplication.run(EurekaServiceApplication.class, args);
        System.out.println("----------Run Success EurekaService----------");
    }

}
