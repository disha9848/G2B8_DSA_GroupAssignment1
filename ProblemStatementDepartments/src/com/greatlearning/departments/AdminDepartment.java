package com.greatlearning.departments;

public class AdminDepartment extends SuperDepartment{
	String departmentName() {
		return  "Admin Department";
	}
	
	String getTodaysWork() {
		return  "Complete your documents Submission";
	}
	
	String getWorkDeadline() {
		return  "Complete by EOD";
	}
	
	void displayDepartmentDetails() {
		System.out.println("Welcome to "+ departmentName() + '\n' + 
				getTodaysWork() + '\n' +
				getWorkDeadline() + '\n' +
				isTodayAHoliday()+ '\n');
	}
}
