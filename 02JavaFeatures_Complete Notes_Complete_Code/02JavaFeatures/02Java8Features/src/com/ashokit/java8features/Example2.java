package com.ashokit.java8features;

public class Example2 implements Test{

	@Override
	public void display() {
		System.out.println("in Example 2 display method");
		
	}
	
	@Override
	public void substract(int i) {
	System.out.println("Example 2 class overridden subtract method");
	}
	
	public void bd() {
		Test.super.substract(122);
	}
	
	public static void main(String[] args) {
		Example2 e2= new Example2();
		e2.substract(122);
	}

}
