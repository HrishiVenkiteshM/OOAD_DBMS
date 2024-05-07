package com.ilp03.utility;

import java.sql.SQLException;

import com.ilp03.service.EmployeesServiceImpl;

public class EmployeeUtility {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		EmployeesServiceImpl employeesServiceImpl = new EmployeesServiceImpl();
		employeesServiceImpl.getAllEmployees();
	}

}