package com.hql;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hql.model.Attempt;
//import com.hql.model.User;
import com.hql.service.AttemptService;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

//import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day2S2Handson3Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Day2S2Handson3Application.class);
	private static AttemptService attemptService;
	public static void main(String[] args) {
		SpringApplication.run(Day2S2Handson3Application.class, args);
		ApplicationContext context = SpringApplication.run(Day2S2Handson3Application.class, args);
		attemptService = context.getBean(AttemptService.class);
		LOGGER.info("Inside main"); 
		testGetAttempt();
	}
	
	public static void testGetAttempt() {
		Attempt a=attemptService.getAttemptById();
		//LOGGER.debug("Attempt:{}", attemptService.getAttemptById());
		System.out.println(a.getId()+" "+a.getScore()+" "+a.getUser().getName());
		
		
	}



}
