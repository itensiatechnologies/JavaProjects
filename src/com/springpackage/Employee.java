package com.springpackage;

public class Employee {
	private String emp_name;
	private int emp_salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}

	public Employee(String emp_name, int emp_salary) {
		super();
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}
	
}
