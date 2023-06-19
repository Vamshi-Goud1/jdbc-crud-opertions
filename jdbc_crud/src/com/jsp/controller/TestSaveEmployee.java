package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class TestSaveEmployee {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(3);
		emp.setName("MOHINI");
		emp.setPhno(7997555122l);
		emp.setEmail("sreddy@gmail.com");
		emp.setPassword("sarika143");
		
		EmployeeService service=new EmployeeService();
		int res=service.saveEmployee(emp);
		
		if(res>0) {
			System.out.println("data saved..");
		}
		else {
			System.out.println("plz check the data");
		}

	}

}
