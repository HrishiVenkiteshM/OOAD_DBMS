package com.ilp03.entity;

public class ManageEmployeesSchedules {
	private int managerId;
	private String managerName;
	private String status;

	public ManageEmployeesSchedules(int managerId, String managerName, String status) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.status = status;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ManageEmployeesSchedules(String managerName) {
		super();
		this.managerName = managerName;
	}
	
		
}
