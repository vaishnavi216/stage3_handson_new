package com.hql.service;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.hql.Application;
import com.hql.model.Employee;
import com.hql.repository.EmployeeRepository;

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
  
  @Transactional
  public List<Employee> getAllPermanentEmployees()
  {
	  return employeeRepository.getAllPermanentEmployees();
  }
  
  @Transactional
  public double getAverageSalary(int id)
  {
	  return employeeRepository.getAverageSalary(id);
  }
  
  @Transactional
  public List<Employee> getAllEmployeesNative()
  {
	  return employeeRepository.getAllEmployeesNative();
  }
  
}