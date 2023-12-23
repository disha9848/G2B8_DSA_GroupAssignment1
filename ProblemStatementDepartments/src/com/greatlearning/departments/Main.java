package com.greatlearning.departments;

public class Main {

	public static void main(String[] args) {
		HrDepartment HrObj = new HrDepartment();
		TechDepartment TechObj = new TechDepartment();
		AdminDepartment AdminObj = new AdminDepartment();
		
		System.out.println("Welcome to "+ AdminObj.departmentName() + '\n' + 
				AdminObj.getTodaysWork() + '\n' +
				AdminObj.getWorkDeadline() + '\n' +
				AdminObj.isTodayAHoliday()+ '\n');
		
		System.out.println("Welcome to "+ HrObj.departmentName() + '\n' + 
				HrObj.doActivity() + '\n' +
				HrObj.getTodaysWork() + '\n' +
				HrObj.getWorkDeadline() + '\n' +
				HrObj.isTodayAHoliday()+ '\n');
		
		System.out.println("Welcome to "+ TechObj.departmentName() + '\n' + 
				TechObj.getTodaysWork() + '\n' +
				TechObj.getWorkDeadline() + '\n' +
				TechObj.getTechStackInformation() + '\n' +
				TechObj.isTodayAHoliday()+ '\n');

	}

}
