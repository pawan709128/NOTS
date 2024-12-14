package com.ashokit.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1{
	
	static void add() { 
		System.out.println("in add method"); 
	}
	
	public static void main(String[] args) {
		//To Access static method present in interface
		//InterfaceName.staticMethodName()
		Test.add();
		Example1.add();//Using class Name
		Example1 e1= new Example1();
		e1.add();
		Example1 e2=null;
		e2.add();
	//	e1.abc();
		
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		//Collection - Interface
		//Collections - Class
		Collections.synchronizedList(l);
		
		
		//Lamda correspondances to an interface and specifically abstract method present 
		//in interface
		//when ever you write a lamda that interface should have only 1 abstract method
		
		String s="Karthik";
		int i=10;
		
		Test t=()->	{
			int x=10;
			System.out.println("in Example 1 display method");
		};
		t.display();
		
		
		
		
		
		
	}

	
}
