package com.hql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hql.service.*;
import com.hql.model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.*;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	public static EmployeeService employeeService;
	public static DepartmentService departmentService;
	public static SkillService skillService;

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);
		employeeService = context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);
		skillService = context.getBean(SkillService.class);
		
		testGetAllPermanentEmployees();
		testGetAverageSalary();
		testGetAllEmployeesNative();
		LOGGER.info("Inside main");
	}
	public static void testGetAllPermanentEmployees() {

		LOGGER.info("Start");

		List<Employee> employees = employeeService.getAllPermanentEmployees();

		LOGGER.debug("Permanent Employees:{}", employees);

		employees.forEach(e -> LOGGER.debug("Skills:{}", e.getSkillList()));
		System.out.println("------------------------------------------------------------------------");
		System.out.println(employees);
		System.out.println("--------------------------------------------------------------------------");
		LOGGER.info("End");
		

		}
	
	public static void testGetAverageSalary()
	{
		LOGGER.info("Start");
		double sal=employeeService.getAverageSalary(1);
		System.out.println("------------------------------------------\n AVG salary is "+sal+"\n-------------------------------------");
		LOGGER.info("End");
	}
	
	public static void testGetAllEmployeesNative()
	{
		LOGGER.info("Start");
		List<Employee> elist=employeeService.getAllEmployeesNative();
		System.out.println("---------------------------------------------------------------");
		for(Employee e:elist)
		{
			System.out.println(e);
		}
		System.out.println("---------------------------------------------------------------");
		LOGGER.info("End");
	}
}	