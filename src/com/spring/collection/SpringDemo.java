package com.spring.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean2.xml");
		MyCollection myCollection = (MyCollection) applicationContext.getBean("myCollection");
		
		//Access list
		  System.out.println("---access list---");
		List<String> list = myCollection.getMyList();
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println("");
		
		//Accessing Set
		  System.out.println("---access set---");
		  Set<String> set = myCollection.getMySet();
		  Iterator<String> iterator = set.iterator();
		  while(iterator.hasNext()) {
			  System.out.println(iterator.next());
		  }
		  System.out.println("");
	        //access properties
	        System.out.println("---access properties---");
	        Properties prop=myCollection.getMyProp();
	        System.out.println(prop.getProperty("propKeyA"));
	        System.out.println(prop.getProperty("propKeyB"));
	    
	        System.out.println("");
	        //Access Book List
	        System.out.println("---Access Book List---");
	        System.out.println(myCollection.getBookList().get(0).getBookName());
	        System.out.println(myCollection.getBookList().get(1).getBookName());
	      
		  
	}

}
