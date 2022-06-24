package com.api.FeignApplication1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignApplication1Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication1Application.class, args);
	}

}
