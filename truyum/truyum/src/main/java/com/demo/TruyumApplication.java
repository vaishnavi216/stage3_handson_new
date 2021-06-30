package com.demo;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages= {"com.demo, com.demo.dao, com.demo.controller,com.demo.model,com.demo.service, com.demo.repository,com.demo.util"})


public class TruyumApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(TruyumApplication.class, args);
	}

}
