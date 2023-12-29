package com.greatlearning.departments;

public class Main {

	public static void main(String[] args) {
		HrDepartment HrObj = new HrDepartment();
		TechDepartment TechObj = new TechDepartment();
		AdminDepartment AdminObj = new AdminDepartment();
		
		AdminObj.displayDepartmentDetails();
		HrObj.displayDepartmentDetails();
		TechObj.displayDepartmentDetails();

	}

}
