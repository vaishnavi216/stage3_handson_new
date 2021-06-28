package com.cognizant.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import javax.transaction.Transactional;


@Service
public class CountryService {
	
	@Autowired
	private CountryRepository repository;
	
	@Transactional
	public List<Country> getAllCountries() {
		return repository.findAll();
	}

}