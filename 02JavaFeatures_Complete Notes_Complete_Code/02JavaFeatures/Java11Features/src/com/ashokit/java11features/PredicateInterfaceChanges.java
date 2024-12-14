package com.ashokit.java11features;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateInterfaceChanges {

	public static void main(String[] args) {
		
		String a[]= {""," ","\r","Hi","Test"};
		Arrays.stream(a).filter(p->!p.isBlank()).forEach(p->System.out.println(p));
		
		Arrays.stream(a).filter(Predicate.not(p->p.isBlank())).forEach(p->System.out.println(p));
		System.out.println("second stmt output");
		Arrays.stream(a).filter(p->p.isBlank()).forEach(p->System.out.println(p));
		/* Predicate<Integer> */
	}
}
