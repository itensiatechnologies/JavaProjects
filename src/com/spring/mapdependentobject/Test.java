package com.spring.mapdependentobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("MapDependentObject.xml");
		Question q = (Question) applicationContext.getBean("ans5");
		q.displayInfo();
	}

}
