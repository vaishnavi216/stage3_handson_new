package com.hibernate.ormlearn.service;
public class CountryNotFoundException extends Exception{
	
	public CountryNotFoundException(String message) {
		super(message);
	}

}