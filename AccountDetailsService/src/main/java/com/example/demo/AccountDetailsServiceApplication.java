package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient
public class AccountDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountDetailsServiceApplication.class, args);
	}

}
