package com.pkg.model;

public class Person {
	private String name;
	private String about;
	private int birthYear;
	private String password;
	
	public Person(String name, String about, int birthYear, String password) {
		this.name = name;
		this.about = about;
		this.birthYear = birthYear;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getAbout() {
		return about;
	}

	public int getBirthYear() {
		return birthYear;
	}
	
	public String getPassword(){
		return password;
	}

	public void setAbout(String about2) {
		// TODO Auto-generated method stub
		
	}

	public void setBirthYear(int birthYear2) {
		// TODO Auto-generated method stub
		
	}
}