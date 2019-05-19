package com.johnfnash.learn.predicate.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateOperators {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		Predicate<Integer> p1 = i -> i>5;
		Predicate<Integer> p2 = i -> i<20;
		Predicate<Integer> p3 = i -> i%2==0;
		List<Integer> test = list.stream()
								 .filter(p1.and(p2).and(p3))
								 .collect(Collectors.toList());
		System.out.println(test.toString());
		
		test = list.stream()
				 .filter(p1.and(p2).and(p3.negate()))
				 .collect(Collectors.toList());
		System.out.println(test.toString());
		
		test = list.stream()
				 .filter(p1.and(p2).and(p3.negate()).and(Predicate.isEqual(7)))
				 .collect(Collectors.toList());
		System.out.println(test.toString());
	}
	
}
