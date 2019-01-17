package constructorwithcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test2 {
	public static void main(String[] args) {
		/*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Question q = (Question) applicationContext.getBean("q");
		q.displayInfo();*/
		
		Scanner sc = new Scanner(System.in);
		  Resource r=new ClassPathResource("applicationContext.xml");  
		  BeanFactory factory=new XmlBeanFactory(r);  
		      
		    Question qt=(Question)factory.getBean("q");
		    
		    System.out.println("Enter Id");
		    int id = sc.nextInt();
		    qt.setId(id);
		    
		    System.out.println("Enter Name :");
		    String name = sc.next();
		    qt.setName(name);
		    
		    System.out.println("Enter answer in list");
		    List<String> list = new ArrayList<>();
		    list.add("Java is a programming language");
		    list.add("Java is a Platform");
		    list.add("Java is an Island of Indonasia");
		    
		    qt.setList(list);
		   
		    qt.displayInfo();  
		
	}
}
