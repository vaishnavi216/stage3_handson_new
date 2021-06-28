package com.jpa.demo.service;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demo.Application;
import com.jpa.demo.model.Employee;
import com.jpa.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
  @Autowired
  private EmployeeRepository employeeRepository;
  
  private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
  
  @Transactional
  public Employee get(int id) {

	  LOGGER.info("Start");
	  return employeeRepository.findById(id).get();
  }
  
  @Transactional
  public void saveEmployee(Employee employee) {
	  LOGGER.info("Start");
	  employeeRepository.save(employee);
	  LOGGER.info("End");

  }
  
}