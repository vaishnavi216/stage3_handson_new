package com.jpa.demo.day2_handson1_ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.demo.day2_handson1_ormlearn.service.*;
import com.jpa.demo.day2_handson1_ormlearn.model.*;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Day2Handson1OrmlearnApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Day2Handson1OrmlearnApplication.class);
	public static CountryService countryService;
	
	public static void main(String[] args) {
		
		ApplicationContext context =SpringApplication.run(Day2Handson1OrmlearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		
		 testGetAllCountries(); //testFindCountryByCode(); testAddCountry();
		 //testUpdateCountry(); testDeleteCountry();
		 
		 testFindByNameContaining();
		testFindByNameContainingOrderByAsc();
		testfindByNameStartingWith();
		LOGGER.info("Inside main");
	}

	private static void testGetAllCountries() {

		LOGGER.info("Start");

		
			List<Country> list = countryService.getAllCountries();
			System.out.println("<--------------All the records in the table-------------->");
			for (Country c : list) {
				System.out.println(c.getCode() + " " + c.getName());
			}
			System.out.println("<--------------------------------------------------------->");

		LOGGER.info("End");

	}

	/*private static void testFindCountryByCode() {
		try {
			Country country = countryService.findCountryByCode("ME");
			System.out.println(country.getName());
		} catch (CountryNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testAddCountry() {
		Country newCountry = new Country();
		newCountry.setCode("KM");
		newCountry.setName("MEGH");
		countryService.addCountry(newCountry);
		testFindCountryByCode();

	}

	private static void testUpdateCountry() {
		countryService.updateCountry("KM", "Megh");
	}

	private static void testDeleteCountry() {
		countryService.deleteCountry("KM");
	}*/

	private static void testFindByNameContaining() {

		List<Country> cList = countryService.findByNameContaining("ia");
		System.out.println("----------------------COUTRIES CONTAINING ou IN NAME---------------------------");
		for (Country c : cList) {
			System.out.println(c.getCode() + " " + c.getName());
		}
		System.out.println("------------------------------------------------------------------");
	}

	private static void testFindByNameContainingOrderByAsc() {

		List<Country> cList = countryService.findByNameContainingOrderByAsc("ia");
		System.out.println("------------------------COUTRIES CONTAINING ou IN NAME IN ASCENDING ORDER-------------------");
		for (Country c : cList) {
			System.out.println(c.getCode() + " " + c.getName());
		}
		System.out.println("-------------------------------------------------------------------");
	}

	private static void testfindByNameStartingWith() {
		List<Country> list = countryService.findByNameStartingWith("A");
		System.out.println("-------------------------------COUNTRIES STARTING WITH z----------------------------------- ");
		for (Country c : list) {
			System.out.println(c.getCode() + " " + c.getName());
		}
		System.out.println("--------------------------------------------------------------------");
	}

}


