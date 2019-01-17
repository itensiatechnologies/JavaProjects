package com.spring.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String name;
	private Map<String,String> answers;  
	
	public Question(int id, String name, Map<String, String> answers) {
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
		Set<Entry<String, String>> entry = answers.entrySet();
		Iterator<Entry<String, String>> iterator = entry.iterator();
		while(iterator.hasNext()) {
			Entry<String, String> entry2 = iterator.next();
			System.out.println("Answer "+entry2.getKey()+ "Posted By "+entry2.getValue() );
		}
		
		
	}
	
	
	

}
