package com.greatlearning.departments;

public class TechDepartment extends SuperDepartment{
	String departmentName() {
		return  "Tech Department";
	}
	
	String getTodaysWork() {
		return  "Complete coding of module 1";
	}
	
	String getWorkDeadline() {
		return  "Complete by EOD";
	}
	
	String getTechStackInformation() {
		return  "Core Java";
	}
	
	void displayDepartmentDetails() {
		System.out.println("Welcome to "+ departmentName() + '\n' + 
				getTodaysWork() + '\n' +
				getWorkDeadline() + '\n' +
				getTechStackInformation() + '\n' +
				isTodayAHoliday()+ '\n');
	}
}
