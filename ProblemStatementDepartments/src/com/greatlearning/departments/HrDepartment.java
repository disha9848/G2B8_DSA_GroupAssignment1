package com.greatlearning.departments;

public class HrDepartment extends SuperDepartment {
	String departmentName() {
		return  "HR Department";
	}
	
	String getTodaysWork() {
		return  "Fill today’s timesheet and mark your attendance";
	}
	
	String getWorkDeadline() {
		return  "Complete by EOD";
	}
	
	String doActivity() {
		return  "team Lunch";
	}
	
	void displayDepartmentDetails() {
		System.out.println("Welcome to "+ departmentName() + '\n' + 
				doActivity() + '\n' +
				getTodaysWork() + '\n' +
				getWorkDeadline() + '\n' +
				isTodayAHoliday()+ '\n');
	}
}
