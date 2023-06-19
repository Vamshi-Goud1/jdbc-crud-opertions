package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class TestGetAllEmployee {

	public static void main(String[] args) {

		EmployeeService service = new EmployeeService();
		List<Employee> employees = service.getAllEmployee();

		if (employees.size() > 0) {
			for (Employee employee : employees) {
				System.out.println(employee.getId());
				System.out.println(employee.getName());
				System.out.println(employee.getPhno());
				System.out.println(employee.getEmail());
				System.out.println(employee.getPassword());
				System.out.println("--------------------");
		}
		}
		else {
			System.out.println("please add data");
		}

	}

}
