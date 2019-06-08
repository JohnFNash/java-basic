package com.johnfnash.learn.jackson.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@JsonIgnoreType
public class Owner {

	private String name;

	public Owner() {
	}
 
	public Owner(String name) {
		super();
		this.name = name;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	@Override
	public String toString() {
		return "Owner [name=" + name + "]";
	}
	
}
