package com.ilp03.entity;

public class Employees {
	private int employeeId;
	private String employeeName;
	private ManageEmployeesSchedules managerName;
	private TimeOffRequests status;
	private String departmentName;
	private String emailId;
	private int phone_number;
	private WorkSchedule workschedule;
	public Employees(int employeeId, String employeeName, ManageEmployeesSchedules managerName, TimeOffRequests status,
			String departmentName, String emailId, int phone_number) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.managerName = managerName;
		this.status = status;
		this.departmentName = departmentName;
		this.emailId = emailId;
		this.phone_number = phone_number;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public ManageEmployeesSchedules getManagerName() {
		return managerName;
	}
	public void setManagerName(ManageEmployeesSchedules managerName) {
		this.managerName = managerName;
	}
	public TimeOffRequests getStatus() {
		return status;
	}
	public void setStatus(TimeOffRequests status) {
		this.status = status;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	
public WorkSchedule getWorkschedule() {
		return workschedule;
	}
	public void setWorkschedule(WorkSchedule workschedule) {
		this.workschedule = workschedule;
	}
	//	public Employees(int employeeId, String employeeName, ManageEmployeesSchedules managerName,
//			TimeOffRequests status) {
//		super();
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//		this.managerName = managerName;
//		this.status = status;
//	}
	public Employees(int employeeId, String employeeName, ManageEmployeesSchedules managerName, TimeOffRequests status,
			WorkSchedule workschedule) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.managerName = managerName;
		this.status = status;
		this.workschedule = workschedule;
	}
}	