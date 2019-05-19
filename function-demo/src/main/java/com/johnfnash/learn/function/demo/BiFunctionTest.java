package com.johnfnash.learn.function.demo;

import java.util.function.BiFunction;
import java.util.function.Function;

import org.junit.Test;

public class BiFunctionTest {

	public int compute3(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
		return biFunction.apply(a, b);
	}
	
	@Test
	public void testApply() {
		BiFunctionTest test = new BiFunctionTest();
		int result = test.compute3(2, 3, (v1, v2) -> v1 + v2);
		System.out.println("result: " + result);
		
		result = test.compute3(2, 3, (v1, v2) -> v1 - v2);
		System.out.println("result: " + result);
		
		result = test.compute3(2, 3, (v1, v2) -> v1 * v2);
		System.out.println("result: " + result);
	}
	
	public int compute4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
		return biFunction.andThen(function).apply(a, b);
	}
	
	@Test
	public void testAndThen() {
		BiFunctionTest test = new BiFunctionTest();
		int result = test.compute4(2, 3, (v1, v2) -> v1 + v2, v1 -> v1 * v1);
		System.out.println("result: " + result);
	}
	
}
