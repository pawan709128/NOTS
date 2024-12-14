package com.ashokit.java9changes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutablilityExample {
	
	public static void main(String[] args) {
		String s="karthik";
		s="ajay";
		
		List<Integer> l1= List.of(10,20,30,40);
		l1.remove(0);
		
		
		List<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		l=Collections.unmodifiableList(l);
		//l.add(50);
		
		List<String> monthList= new ArrayList<String>();
		monthList.add("January");
		monthList.add("February");
		//
		//
		monthList.add("December");
		monthList=Collections.unmodifiableList(monthList);
		//monthList.remove(0);
	}

}
