package com.johnfnash.learn.lombok.demo;

import java.util.Date;

import lombok.NonNull;
import lombok.Value;

@Value
public class ValueExample {
	
	@NonNull
    private String id;
    private String name;
    private boolean active;
    private Date createTime;
	
}
