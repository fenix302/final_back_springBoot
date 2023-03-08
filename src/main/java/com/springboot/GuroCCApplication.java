package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.board.controller.FreeBoardController;

@EntityScan(basePackages = {"com.springboot"})
@SpringBootApplication
public class GuroCCApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuroCCApplication.class, args);
		
		System.out.println("====== 시작 =======");
	}

}


