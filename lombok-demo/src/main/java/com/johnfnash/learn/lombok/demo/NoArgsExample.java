package com.johnfnash.learn.lombok.demo;

import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor(force=true)
public class NoArgsExample {

	@NonNull
	private final String field;
	
	public static void main(String[] args) {
		new NoArgsExample();
	}
	
}
