package com.johnfnash.learn.lombok.demo;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class NonNullExample {

	@Getter
	@Setter
	private String name;
	
	public NonNullExample(@NonNull Person person) {
		this.name = person.getName();
	}
	
}

class Person {
	
	@Getter
	@Setter
	private String name;
	
}