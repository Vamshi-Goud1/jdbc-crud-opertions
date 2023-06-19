package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class TestUpdateEmployee {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setName("MK");
		emp.setEmail("mk295@gmail.com");
		emp.setId(1);
		emp.setPhno(7997460122l);
	
		emp.setPassword("Mk@vgs");
		
		EmployeeService service=new EmployeeService();
		int res=service.updateEmployee(emp);
        if (res>0) {System.out.println("table updated");}
        else {System.out.println("please check data");}
	}

}
