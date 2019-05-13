package com.johnfnash.learn.lombok.demo;

import java.util.Date;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class GetterSetterExample {
	@Getter
	@Setter
	private int age = 10;
	
	@Getter
    @Setter
    private boolean active;

    @Getter
    @Setter
    private Boolean none;

    @Getter
    @Setter
    private Date date;
	
	@Setter(AccessLevel.PROTECTED)
	private String name;
	
	@Override
	public String toString() {
	    return String.format("%s (age: %d)", name, age);
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		GetterSetterExample example = new GetterSetterExample();
		example.setActive(true);
		example.setAge(123);
		example.setDate(new Date());
		example.setName("abc");
		example.setNone(false);

		System.out.println(example);
		
		Date date = example.getDate();
		Boolean none = example.getNone();
		boolean active = example.isActive();
	}
	
}
