package Entities.Concretes;

import Entities.Abstracts.Entitiy;

public class User implements Entitiy {
	private String name;
	private String lastName;
	private String email;
	private String password;
	boolean vertification = false;
	public User(String name, String lastName, String email, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password=password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isVertification() {
		return vertification;
	}
	public void setVertification(boolean vertification) {
		this.vertification = vertification;
	}
	
}
