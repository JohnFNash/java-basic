package com.johnfnash.learn.lambda.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class LambdaStreamTest2 {

	@Test
	public void variableTest() {
		String waibu = "lambda :";
		List<String> proStrs = Arrays.asList(new String[]{"Ni","Hao","Lambda"});
		List<String> execStrs = proStrs.stream().map(chuandi -> {
			Long zidingyi = System.currentTimeMillis();
			return waibu + chuandi + " -----: " + zidingyi;
		}).collect(Collectors.toList());
		execStrs.forEach(System.out::println);
	}
	
	@Test
	public void whatThis() {
		//转全小写
        List<String> proStrs = Arrays.asList(new String[]{"Ni","Hao","Lambda"});
        List<String> execStrs = proStrs.stream().map(str -> {
        	System.out.println(this.getClass().getName());
        	return str.toLowerCase();
        }).collect(Collectors.toList());
        execStrs.forEach(System.out::println);
	}
	
	@Test
	public void streamSwitch() {
		List<Integer> nums = 
				Arrays.asList(new Integer[]{1,1,null,2,3,4,null,5,6,7,8,9,10});
		System.out.println("sum is:" + nums.stream().filter(num -> num != null)
				.distinct().mapToInt(num -> num*2).peek(System.out::println)
				.skip(2).limit(4).sum());
	}
	
}
