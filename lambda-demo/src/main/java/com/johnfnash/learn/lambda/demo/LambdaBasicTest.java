package com.johnfnash.learn.lambda.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class LambdaBasicTest {

	@Test
	public void listTest() {
		String[] atp = { "Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer",
				"Andy Murray", "Tomas Berdych", "Juan Martin Del Potro" };
		List<String> players = Arrays.asList(atp);

		// 以前的循环方式
		for (String player : players) {
			System.out.print(player + "; "); 
		}
		System.out.println();
		
		// 使用 lambda 表达式以及函数操作(functional operation)  
		players.forEach((player) -> System.out.print(player + "; "));
		System.out.println();
		
		// 在 Java 8 中使用双冒号操作符(double colon operator)  
		players.forEach(System.out::print);
	}
	
	@Test
	public void runnableTest() {
		// 1.1使用匿名内部类  
		new Thread(new Runnable() {  
		    @Override  
		    public void run() {  
		        System.out.println("Hello world !");  
		    }  
		}).start();  
		
		// 1.2使用 lambda expression  
		new Thread(() -> System.out.println("Hello world !")).start();
		
		// 2.1使用匿名内部类  
		Runnable race1 = new Runnable() {  
		    @Override  
		    public void run() {  
		        System.out.println("Hello world !");  
		    }  
		};  
		  
		// 2.2使用 lambda expression  
		Runnable race2 = () -> System.out.println("Hello world !");  
		   
		// 直接调用 run 方法(没开新线程哦!)  
		race1.run();  
		race2.run();  
	}
	
	@Test
	public void listSortTest() {
		String[] players = {"Rafael Nadal", "Novak Djokovic",   
			    "Stanislas Wawrinka", "David Ferrer",  
			    "Roger Federer", "Andy Murray",  
			    "Tomas Berdych", "Juan Martin Del Potro",  
			    "Richard Gasquet", "John Isner"};  
		
		// 1.1 使用匿名内部类根据 name 排序 players  
		Arrays.sort(players, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		// 1.2 使用 lambda expression 排序 players  
		Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
		Arrays.sort(players, sortByName);
		
		// 1.3 也可以采用如下形式:  
		Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));
	}

}
