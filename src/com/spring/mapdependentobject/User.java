package com.spring.mapdependentobject;

public class User {
	private int id;
	private String uname,email;
	
	public User(int id, String uname, String email) {
		super();
		this.id = id;
		this.uname = uname;
		this.email = email;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", email=" + email + "]";
	}
	

}
