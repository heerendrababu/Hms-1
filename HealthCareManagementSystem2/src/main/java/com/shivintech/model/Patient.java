package com.shivintech.model;


public class Patient 
{
 private int id;
 private String name;
 private String email;
 private String password;
 private String gender;
public Patient(int id, String name, String email, String password, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.password = password;
	this.gender = gender;
}
public Patient(String name, String email, String password, String gender) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.gender = gender;
}

public Patient() {
	super();
	// TODO Auto-generated constructor stub
}
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

 
 

  
}
