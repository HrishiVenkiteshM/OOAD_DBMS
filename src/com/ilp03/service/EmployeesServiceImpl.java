package com.ilp03.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.WorkScheduleDAO;
import com.ilp03.entity.Employees;

public class EmployeesServiceImpl implements EmployeesService {

	@Override
	public void getAllEmployees() throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = WorkScheduleDAO.getConnection();
		ArrayList<Employees> employeeList = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter mode of work : ");
		String modeOfWork = scanner.nextLine();
		employeeList = WorkScheduleDAO.getAllCustomers(connection, modeOfWork);
		System.out.println("Employee Id\tEmployeeName\tManager Name\t\tStatus\t\tStart Date\t\tEnd Date\t\tStart Time\t\tEnd Time\t\tLocation");
		for(Employees employees : employeeList)
		{
			System.out.println();
			System.out.println(employees.getEmployeeId()+"\t\t"+employees.getEmployeeName()+"\t"+employees.getManagerName().getManagerName()+"\t\t"+employees.getStatus().getStatus()+"\t\t"+employees.getWorkschedule().getStartDate()+"\t\t"+employees.getWorkschedule().getEndDate()+"\t\t"+employees.getWorkschedule().getStartTime()+"\t\t"+employees.getWorkschedule().getEndTime()+"\t\t"+employees.getWorkschedule().getLocation());
		}
		WorkScheduleDAO.closeConnection(connection);

	}

}
