package com.jsp.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.jsp.dto.Employee;
import com.mysql.cj.jdbc.Driver;

public class EmployeeDao {

	public Employee getEmployeeById(int id) {
		Employee emp = new Employee();
		try {
			DriverManager.registerDriver(new Driver());

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud?user=root&password=root");

			PreparedStatement ps = c.prepareStatement("select * from employee where id=?");

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setPhno(rs.getLong(3));
				emp.setEmail(rs.getString(4));
				emp.setPassword(rs.getString(5));
			}

			c.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return emp;

	}

	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<>();
		try {
			DriverManager.registerDriver(new Driver());

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud?user=root&password=root");

			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from employee");

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				long phno = rs.getLong(3);
				String email = rs.getString(4);
				String password = rs.getString(5);

				Employee emp = new Employee();
				emp.setEmail(email);
				emp.setId(id);
				emp.setName(name);
				emp.setPassword(password);
				emp.setPhno(phno);

				list.add(emp);
			}
			c.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;

	}

	public int deleteEmployee(int id) {
		try {
			DriverManager.registerDriver(new Driver());

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud?user=root&password=root");

			PreparedStatement ps = c.prepareStatement("delete from employee where id=?");
			ps.setInt(1, id);
			int res = ps.executeUpdate();

			c.close();
			return res;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}

	public int updateEmployee(Employee emp) {
		try {
			DriverManager.registerDriver(new Driver());

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud?user=root&password=root");

			PreparedStatement ps = c
					.prepareStatement("update employee set name=?,email=?,phno=?,password=? where id=?");
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getEmail());
			ps.setLong(3, emp.getPhno());
			ps.setString(4, emp.getPassword());
			ps.setInt(5, emp.getId());

			int res = ps.executeUpdate();

			c.close();
			return res;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;

	}

	public void createTable() {

		try {

			DriverManager.registerDriver(new Driver());
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud?user=root&password=root");
			Statement s = c.createStatement();
			s.execute(
					"create table employee(id int primary key,name varchar(45),phno bigint(10),email varchar(45),password varchar(45))");
			c.close();
			System.out.println("TABLE CREATED");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public int saveEmployee(Employee emp) {

		try {
			DriverManager.registerDriver(new Driver());

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud?user=root&password=root");

			PreparedStatement ps = c.prepareStatement("insert into employee values(?,?,?,?,?)");
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setLong(3, emp.getPhno());
			ps.setString(4, emp.getEmail());
			ps.setString(5, emp.getPassword());

			int result = ps.executeUpdate();
			c.close();

			return result;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int saveEmployee1(Employee emp) {

		try {
			DriverManager.registerDriver(new Driver());

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud?user=root&password=root");

			PreparedStatement ps = c.prepareStatement("insert into employee values(?,?,?,?,?)");
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setLong(3, emp.getPhno());
			ps.setString(4, emp.getEmail());
			ps.setString(5, emp.getPassword());

			int result = ps.executeUpdate();
			c.close();

			return result;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
