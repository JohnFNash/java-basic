package com.johnfnash.learn.jackson.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class House {

	private String name;

	//仅仅注解 @JsonIgnore时，序列化和反序列化都忽略
//	@JsonIgnore
	//在属性上添加 @JsonProperty，结果是忽略不生效
//	@JsonProperty
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//getter注解 @JsonIgnore
	@JsonIgnore
	public String getAddress() {
		return address;
	}

	//setter注解@JsonProperty，忽略被取消，和注解在属性上一样结果
    @JsonProperty
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "House [name=" + name + ", address=" + address + "]";
	}
	
}
