package com.johnfnash.learn.predicate.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegexPredicate {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^(.+)@example.com$");
		// Input list
	    List<String> emails = Arrays.asList("alex@example.com", "bob@yahoo.com",
	                        "cat@google.com", "david@example.com");
	    for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			if(matcher.matches()) {
				System.out.println(email);
			}
		}
	    
	    System.out.println("---------------------------");
	    
	    // 使用 lambda predicate
	    Predicate<String> emailFilter = pattern.asPredicate();
	    List<String> desireEmails = emails.stream()
	    								  .filter(emailFilter)
	    								  .collect(Collectors.toList());
	    desireEmails.forEach(System.out::println);
	}
    
	
}
