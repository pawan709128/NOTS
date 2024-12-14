package com.ashokit.java8features.collectionenhancements;

import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.List;

public class ComparatorAndComparableExample {
	
	public static void main(String[] args) {
		
		List<Integer> l= new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(50);
		l.add(60);
		l.add(9);
		l.add(7);
		
		System.out.println(l);//Insertion order
		//Write a program to make the array list sorted (Ascending order)
		
		Collections.sort(l);
		System.out.println(l);//Ascending order
		//Collections.sort(l, new Comparator<T>);
	}

}
