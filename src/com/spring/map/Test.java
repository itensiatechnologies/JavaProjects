package com.spring.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Map.xml");
		Question q = (Question) applicationContext.getBean("ans1");
		q.displayInfo();
		
	}

}
