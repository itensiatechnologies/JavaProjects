package com.springpackage;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		
		Student student = (Student) applicationContext.getBean("studentbean");
		student.setName(name);
		System.out.println("Student Name :"+student.getName());
		
		Employee e =  (Employee) applicationContext.getBean("employeebean");
		e.setEmp_name(student.getName());
		
		System.out.println("Enter Employee Salary");
		int sal = sc.nextInt();
		e.setEmp_salary(sal);
		
		System.out.println("Emp Name :"+e.getEmp_name() +" and his salary is " + e.getEmp_salary());
		sc.close();
		
	}
}
