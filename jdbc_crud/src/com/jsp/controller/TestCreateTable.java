package com.jsp.controller;

import com.jsp.service.EmployeeService;

public class TestCreateTable {

	public static void main(String[] args) {
		EmployeeService service=new EmployeeService();
		service.createTable();
	}

}
