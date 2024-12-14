package com.ashokit.interfacechanges;

import java.io.BufferedReader;
import java.io.FileReader;


public interface Display {
	
	//Java 9 interface allows the developer to write 
	//private methods in the interface
	private void duplicateCode() {
		//Private methods in the interface will provide the code reusablility
		int c=10+20;
		try {
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("c value is "+c);
	}
	
	
	default void add1() {
		duplicateCode();
		/*
		 * int c=10+20; try {
		 * 
		 * }catch (Exception e) { // TODO: handle exception }
		 * System.out.println("c value is "+c);
		 */
		
		try {
			//DB connection
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	default void add() {
		/* duplicateCode(); */

		//Private methods in the interface will provide the code reusablility
		int c=10+20;
		try {
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("c value is "+c);
	
	}
	
	/*
	 * default void duplicateCode() {
	 * 
	 * }
	 */
	
	private static void testMethod() {

		BufferedReader b= new BufferedReader(new FileReader("c:\\karthik\\abc.txt"));
		b.lines();
	}
	
	static void showA() {
		testMethod();
		
	}
	
	static void ShowB() {
		testMethod();
		
	}
	
	public void check();

}
