package com.johnfnash.learn.lombok.demo;

import java.util.Date;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@SuppressWarnings("unused")
@RequiredArgsConstructor(staticName="of")
public class RequiredArgsStaticExample {

	@NonNull
	private String field;
	
	private Date date;
	private Integer integer;
    private int i;
    private boolean b;
	private Boolean aBoolean;
    
}
