package com.johnfnash.learn.lombok.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor(access=AccessLevel.PROTECTED)
public class AllArgsConstructorExample<T> {

	@SuppressWarnings("unused")
	private int x, y;
	
	@NonNull private T description;
	
}
