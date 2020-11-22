package com.winfred.order.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderCenterApplication {
  public static void main(String[] args) {
    SpringApplication springApplication = new SpringApplication(OrderCenterApplication.class);
    springApplication.run(args);
  }
}
