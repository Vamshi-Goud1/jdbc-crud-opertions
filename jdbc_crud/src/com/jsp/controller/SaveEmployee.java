package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class SaveEmployee {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmail("VGS@gmail.com");
		emp.setId(1);
		emp.setName("VGS");
		emp.setPassword("vgs@143");
		emp.setPhno(1234567890l);
		
	   EmployeeService service=new EmployeeService();
	   int res=service.saveEmployee1(emp);
	    if(res>0) {System.out.println("DATA SAVED");}
	    else {System.out.println("enter valid data");}

	}

}
