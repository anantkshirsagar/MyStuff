package com.connection_master_api;

import java.io.IOException;

public class TestDBService {
	public static void main(String[] args) {
		try {
			//insert();
			findEmpById(1);
			printEmployeeUsingQueryRunner();
		} catch (Exception e) {
			System.out.println(" Exception: " +e);
		}		
	}
	
	public static void insert() throws Exception {
		DatabaseService databaseService = new DatabaseService();
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Anant Kshirsagar");
		employee.setDesignation("Developer");
		employee.setSalary(15000.0);
		databaseService.save(employee);
	}
	
	public static void findEmpById(int id) throws Exception {
		DatabaseService databaseService = new DatabaseService();
		Employee employee = databaseService.find(1);
		System.out.println(" Employee record: " +employee);
	}
	
	public static void printEmployeeUsingQueryRunner() throws Exception {
		DatabaseService dbService = new DatabaseService();
		dbService.usingQueryRunner();
	}
}
