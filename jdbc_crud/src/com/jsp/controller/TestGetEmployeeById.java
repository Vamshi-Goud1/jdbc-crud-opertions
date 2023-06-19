package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class TestGetEmployeeById {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();

		Employee emp = service.getEmployeeById(2);

		if (emp != null) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getPhno());
			System.out.println(emp.getEmail());
			System.out.println(emp.getPassword());
		}else {
			System.out.println("plz check the id");
		}

	}

}
