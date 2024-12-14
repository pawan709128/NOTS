package com.ashokit.java11features;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LamdaLocalVariables {
	public static void main(String[] args) {
		
		var s="Karthik";
		Test t= (var x,var y)->x+y;
		System.out.println(t.add(10,20));
	}

}
