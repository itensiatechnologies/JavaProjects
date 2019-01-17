package com.spring.mapdependentobject;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;  
	private String name;  
	private Map<Answer,User> answers;  
	
	public Question(int id, String name, Map<Answer, User> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public Question() {
		// TODO Auto-generated constructor stub
	}
	
	public void displayInfo() {
		System.out.println("Question and Answer...");
		Set<Entry<Answer, User>> entry = answers.entrySet();
		Iterator<Entry<Answer, User>> iterator = entry.iterator();
		while(iterator.hasNext()) {
			Entry<Answer, User> entry2 = iterator.next();
			Answer ans = entry2.getKey();
			User user = entry2.getValue();
			 System.out.println("Answer Information:");  
		        System.out.println(ans);  
		        System.out.println("Posted By:");  
		        System.out.println(user);  
		}		
	}
	
}
