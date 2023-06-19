package com.jsp.service;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class EmployeeService {

	EmployeeDao dao = new EmployeeDao();

	public Employee getEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}

	public List<Employee> getAllEmployee() {
		return dao.getAllEmployee();
	}

	public void createTable() {
		dao.createTable();
	}

	public int saveEmployee(Employee emp) {
		return dao.saveEmployee(emp);
	}

	public int updateEmployee(Employee emp) {
		return dao.updateEmployee(emp);
	}

	public int deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

	public int saveEmployee1(Employee emp) {
		return dao.saveEmployee1(emp);
	}
}
