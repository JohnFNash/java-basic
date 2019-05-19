package com.johnfnash.learn.function.demo;

import java.util.function.Function;

import org.junit.Test;

public class FunctionTest {

	public int compute(int a, Function<Integer, Integer> function) {
		int result = function.apply(a);
		return result;
	}
	
	@Test
	public void testApply() {
		FunctionTest test = new FunctionTest();
		int result = test.compute(5, value -> value * value); // 25 计算平方
		System.out.println(result);
		
		result = test.compute(5, value -> value + value); // 10 求和
		System.out.println(result);
		
		result = test.compute(5, value -> value - 2); // 3 求差
		System.out.println(result);
	}
	
	public int compute(int a, Function<Integer, Integer> function1,
			Function<Integer, Integer> function2) {
		return function1.compose(function2).apply(a);
	}
	
	@Test
	public void testCompose() {
		FunctionTest test = new FunctionTest();
		int result = test.compute(2, value -> value * 3, value -> value * value);
		System.out.println(result);
	}
	
	public int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
	    return function1.andThen(function2).apply(a);
	}
	
	@Test
	public void testAndThen() {
		FunctionTest test = new FunctionTest();
		int result = test.compute2(2, value -> value * 3, value -> value * value);
		System.out.println(result);
	}
	
}
