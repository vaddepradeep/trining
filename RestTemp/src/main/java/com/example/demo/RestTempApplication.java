package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.config.RibbonConfiguration;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RibbonClient(name="orderclient", configuration = RibbonConfiguration.class)
public class RestTempApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTempApplication.class, args);
	}
	
	
/*	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();	
	}
*/
}
