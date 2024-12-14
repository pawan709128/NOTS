package com.ashokit.java11features;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class A1 {
	
	class B{
		
	}
	class C{
		
	}
	
	class D{
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(A1.class.getNestMembers()));
		System.out.println(A1.class.isNestmateOf(PredicateInterfaceChanges.class));
		System.out.println(D.class.getNestHost());
		
		Stream.generate(()->new Random().nextInt()).limit(3).forEach(p->System.out.println(p));
		
		int a[]= {2,3,43,4,31,3};
		Arrays.stream(a).reduce((m,n)->m+n).ifPresent(p->System.out.println(p));;
	}

}
