package com.ashokit.java11features;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

public class Java8ReduceMethod {
	
	public static void main(String[] args) {
		
		int a[]= {3,4,12,43,12,43,54};
		String b[]= {"India","Ashokit","Karthik"};
		
		//Arrays.stream(a).reduce(())
		/*IntBinaryOperator*/
		
		Arrays.stream(a).reduce((m,n)->m+n).ifPresent(p->System.out.println(p));
		Arrays.stream(a).reduce((m,n)->m<n?m:n).ifPresent(p->System.out.println(p));
		Arrays.stream(b).reduce((q,x)->q+" "+x).ifPresent(p->System.out.println(p));
		IntBinaryOperator l=(x,y)->x-y;
		l.applyAsInt(10, 20);
		
		Stream.generate(()->100).limit(5).forEach(p->System.out.println(p));
		
	}

}
