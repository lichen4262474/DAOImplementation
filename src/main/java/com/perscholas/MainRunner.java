package com.perscholas;

import com.perscholas.service.EmployeeService;

public class MainRunner {

	public static void main(String[] args) {

		EmployeeService es = new EmployeeService();

		System.out.println(es.getAllEmployees());
		//
		//		Employees newEmp = new Employees(1111, "Chen", "Li", "0000", "abc@gmail.com", "000", 1110, "developer", 10);
		//		EmployeeService newEmpService = new EmployeeService();
		//		System.out.println(newEmpService.createEmployee(newEmp));

		//		Employees newEmpUpdated = new Employees(1111, "Chen", "Li", "1111", "aaa@gmail.com", "000", 1110,
		//				"data scientist", 10);
		EmployeeService newEmpService = new EmployeeService();
		System.out.println(newEmpService.deleteEmployee(1111));

	}


}
