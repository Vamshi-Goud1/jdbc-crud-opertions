package com.jsp.controller;

import com.jsp.service.EmployeeService;

public class TestDeleteEmployee {

	public static void main(String[] args) {
		EmployeeService service=new EmployeeService();
		int res=service.deleteEmployee(1);
     if(res>0) {System.out.println("data deleted");}
     else {System.out.println("please check id");}
	}

}
