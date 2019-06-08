package com.johnfnash.learn.jackson.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(getterVisibility = Visibility.NON_PRIVATE)
public class Person {

	protected String name = "zyc";

	private boolean boy = true;

	// getterVisibility=Visibility.NON_PRIVATE: protected 修饰的name可见
	protected String getName() {
		return name;
	}

	// setter默认所有可见，所以反序列化都会被赋值
	@SuppressWarnings("unused")
	private void setName(String name) {
		this.name = name;
	}

	// isGetterVisibility默认为public修饰可见，所有序列化时，没有boy属性
	@SuppressWarnings("unused")
	private boolean isBoy() {
		return boy;
	}

	@SuppressWarnings("unused")
	private void setBoy(boolean boy) {
		this.boy = boy;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", boy=" + boy + "]";
	}

}
