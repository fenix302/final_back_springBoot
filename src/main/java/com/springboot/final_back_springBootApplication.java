package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.springboot"})
@SpringBootApplication
public class final_back_springBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(final_back_springBootApplication.class, args);
		
		System.out.println("====== 시작 =======");
	}

}


