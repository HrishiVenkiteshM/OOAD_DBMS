package com.ilp03.entity;

public class WorkArragementPreferences {
	private int preferenceId;
	private int employeeId;
	private String arrangementType;
	private String preferenceLevel;

	public WorkArragementPreferences(int preferenceId, int employeeId, String arrangementType, String preferenceLevel) {
		super();
		this.preferenceId = preferenceId;
		this.employeeId = employeeId;
		this.arrangementType = arrangementType;
		this.preferenceLevel = preferenceLevel;
	}

	public int getPreferenceId() {
		return preferenceId;
	}

	public void setPreferenceId(int preferenceId) {
		this.preferenceId = preferenceId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getArrangementType() {
		return arrangementType;
	}

	public void setArrangementType(String arrangementType) {
		this.arrangementType = arrangementType;
	}

	public String getPreferenceLevel() {
		return preferenceLevel;
	}

	public void setPreferenceLevel(String preferenceLevel) {
		this.preferenceLevel = preferenceLevel;
	}

}
