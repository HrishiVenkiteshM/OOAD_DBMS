package com.ilp03.entity;

public class TimeOffRequests {
	private int requestId;
	private int employeeId;
	private String startDate;
	private String endDate;
	private String status;

	public TimeOffRequests(int requestId, int employeeId, String startDate, String endDate, String status) {
		super();
		this.requestId = requestId;
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public TimeOffRequests(String status) {
		super();
		this.status = status;
	}
	

}
