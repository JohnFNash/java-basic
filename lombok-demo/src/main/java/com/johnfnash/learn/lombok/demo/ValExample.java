package com.johnfnash.learn.lombok.demo;

import java.util.HashMap;

import lombok.val;

public class ValExample {

	public static void main(String[] args) {
		// lombok.val 使用
		val map = new HashMap<Integer, String>();
		map.put(0, "zero");
		map.put(5, "five");
		for(val entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
}
