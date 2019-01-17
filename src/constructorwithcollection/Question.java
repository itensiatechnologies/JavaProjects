package constructorwithcollection;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	private int id;
	private String name;
	List<String> list;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	
	public Question() {
		// TODO Auto-generated constructor stub
	}
	
	public Question(int id, String name, List<String> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}
	
	public void displayInfo() {
		System.out.println("Id :" + id + "name :" + name);
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
