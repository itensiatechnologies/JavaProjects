package com.spring.dependentobject;

public class Answer {
	private int id;  
	private String name;  
	private String by;  
	
	public Answer() {
		// TODO Auto-generated constructor stub
	}

	public Answer(int id, String name, String by) {
		super();
		this.id = id;
		this.name = name;
		this.by = by;
	}
	
	public String toString(){  
	    return id+" "+name+" "+by;  
	}
	

}
