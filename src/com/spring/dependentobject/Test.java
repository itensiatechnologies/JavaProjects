package com.spring.dependentobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DependentObject.xml");
		Question question = (Question) applicationContext.getBean("ans3");
		question.displayInfo();
		
	}
}
