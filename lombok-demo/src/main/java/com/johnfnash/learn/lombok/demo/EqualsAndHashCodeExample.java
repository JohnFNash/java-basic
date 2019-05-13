package com.johnfnash.learn.lombok.demo;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(exclude = { "id", "shape" })
@SuppressWarnings("unused")
public class EqualsAndHashCodeExample {

	private transient int transientVar = 10;
	private String name;
	private double score;
	private String[] tags;
	private int id;
	private ToStringExample.Shape shape = new Square(5, 10);

	@EqualsAndHashCode(callSuper=true)
	public static class Square extends ToStringExample.Shape {
		private final int width, height;

		public Square(int width, int height) {
			this.width = width;
			this.height = height;
		}
	}

	public static void main(String[] args) {
		EqualsAndHashCodeExample example = new EqualsAndHashCodeExample();
		EqualsAndHashCodeExample example1 = new EqualsAndHashCodeExample();
		boolean equals = example.equals(example1);
		System.out.println(equals);
		
		boolean b = example.canEqual(example);
		System.out.println(b);
		
		int i = example.hashCode();
		System.out.println(i);
	}
	
}
