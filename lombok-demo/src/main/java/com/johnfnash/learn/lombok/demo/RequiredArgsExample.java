package com.johnfnash.learn.lombok.demo;

import java.util.Date;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@SuppressWarnings("unused")
public class RequiredArgsExample {

	@NonNull
	private String field;
	
	private Date date;
	private Integer integer;
    private int i;
    private boolean b;
    private Boolean aBoolean;
	
}
