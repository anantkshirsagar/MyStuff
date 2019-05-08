package com.connection_master_api;

public class TestDBService {
	public static void main(String[] args) {
		try {
			//insert();
			findEmpById(1);
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
}
