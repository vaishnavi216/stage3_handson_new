package com.jpa.demo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.demo.model.*;
import com.jpa.demo.service.*;

import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory; 
@SpringBootApplication
public class Day2Handson2StockApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(Day2Handson2StockApplication.class);
	private static StockService stockService;
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = SpringApplication.run(Day2Handson2StockApplication.class, args);
		LOGGER.info("Inside main"); 
		stockService = context.getBean(StockService.class);
		
		System.out.println(stockService.getStocks());
		
		List<Stock> list1=stockService.getByCodeAndDate();
		for(Stock s: list1) {
			System.out.println(s.toString());
		}
		
		List<Stock> list2=stockService.getByCodeAndStockPrice();
		for(Stock s: list2) {
			System.out.println(s.toString());
		}
		
		List<Stock> list3=stockService.getTop3ByVolume();
		for(Stock s: list3) {
			System.out.println(s.toString());
		}
		
		List<Stock> list4=stockService.getTop3ByCode();
		for(Stock s: list4) {
			System.out.println(s.toString());
		}
		
		
		
		
	}

}