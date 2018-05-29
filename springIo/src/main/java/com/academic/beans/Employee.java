package com.academic.beans;

//Java bean class
public class Employee {

	public int emp_Id;
	public String emp_Name;
	public int emp_Salary;
	public String emp_Email;

	// const
	public Employee() {

	}

	// const
	public Employee(int emp_Id, String emp_Name, int emp_Salary, String emp_Email) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Salary = emp_Salary;
		this.emp_Email = emp_Email;
		
		
		
		System.out.println("Employee const is called to set emp Properties ");
	}

}
