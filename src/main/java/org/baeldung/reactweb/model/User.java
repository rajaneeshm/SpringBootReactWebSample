package org.baeldung.reactweb.model;

public class User {
	
	String Name;
	
	String id;
	
	

	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public User(String name, String id) {
		super();
		Name = name;
		this.id = id;
	}
	
	

}
