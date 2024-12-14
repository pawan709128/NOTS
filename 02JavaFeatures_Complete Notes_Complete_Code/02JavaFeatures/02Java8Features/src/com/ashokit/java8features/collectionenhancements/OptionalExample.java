package com.ashokit.java8features.collectionenhancements;

import java.util.Optional;

public class OptionalExample {
	
	public static void main(String[] args) {
		
		Optional<String> s=display("Hi");
		System.out.println(s.isPresent());
		if(s.isPresent()) {
			System.out.println(s.get()) ;
			System.out.println("Not null");
		}else {
			System.out.println("Null");
		}
		
	}
	
	public static  Optional<String> display(String i) {
		
		Optional<String> op=Optional.ofNullable(i);
		Optional<String> op1=Optional.of(i);
		
		return op;
		
	}

}
