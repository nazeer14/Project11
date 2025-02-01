package com.pack1;

import java.io.Serializable;

public class UserBean implements Serializable{
	
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String mail_id;
	private String phone;
	
	public UserBean() {
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
