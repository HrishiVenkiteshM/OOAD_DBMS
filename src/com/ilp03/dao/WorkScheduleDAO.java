package com.ilp03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ilp03.entity.Employees;
import com.ilp03.entity.ManageEmployeesSchedules;
import com.ilp03.entity.TimeOffRequests;
import com.ilp03.entity.WorkSchedule;

public class WorkScheduleDAO {
	public static Connection getConnection() {
		String connectionString = "jdbc:mysql://localhost:3306/flexible_work_db?useSSL=false";
		String userName = "root";
		String password = "root";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionString, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Employees> getAllCustomers(Connection connection, String modeOfWork) {
//		Statement statement=connection.createStatement();;
		ArrayList<Employees> employeeList = new ArrayList<Employees>();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("SELECT e.employee_id, e.name AS employee_name, \r\n"
							+ "       m.manager_name, t.status AS time_off_status, \r\n"
							+ "       w.start_date, w.end_date, w.start_time, w.end_time,\r\n" + "       w.location\r\n"
							+ "FROM employees e\r\n" + "JOIN work_schedule w ON e.employee_id = w.employee_id\r\n"
							+ "JOIN manage_employees_schedules m ON e.employee_id = m.manager_id\r\n"
							+ "JOIN time_off_requests t ON e.employee_id = t.employee_id\r\n"
							+ "JOIN work_arrangement_preferences p ON e.employee_id = p.employee_id\r\n"
							+ "WHERE p.arrangement_type = ?;\r\n");

			preparedStatement.setString(1, modeOfWork);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int employeeId = resultSet.getInt(1);
				String employeeName = resultSet.getString(2);
				String managerName = resultSet.getString(3);
				ManageEmployeesSchedules manager = new ManageEmployeesSchedules(managerName);
				String status = resultSet.getString(4);
				TimeOffRequests statusObject = new TimeOffRequests(status);
				String startDate = resultSet.getString(5);
				String endDate = resultSet.getString(6);
				String startTime = resultSet.getString(7);
				String endTime = resultSet.getString(8);
				String location = resultSet.getString(9);
				WorkSchedule workschedule = new WorkSchedule(startDate, endDate, startTime, endTime, location);

				Employees employees = new Employees(employeeId, employeeName, manager, statusObject, workschedule);
				employeeList.add(employees);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeeList;
	}
}
