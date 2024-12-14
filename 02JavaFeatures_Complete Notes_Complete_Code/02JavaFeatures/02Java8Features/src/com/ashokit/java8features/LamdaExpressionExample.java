package com.ashokit.java8features;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LamdaExpressionExample {
	
	
	//Lamda correspondance to an interface and specifically abstract method present in 
	//interface.
	
	void add(int x,int y){
		int i=x+y;
		System.out.println(i);
	}
	
	void show(Employee e){
		System.out.println(e.getEmpId()+" "+e.getEmpName());
	}
	
	void run(Test i) {
		
	}
	public static void main(String[] args) {
		
		LamdaExpressionExample le= new LamdaExpressionExample();
		Employee e= new Employee();
		e.setEmpId(134);
		e.setEmpName("karthik");
		/*
		 * int x=10; int y=20; le.add(x,y);//data
		 */		le.show(e);
		Test t= new A();
		le.run(t);
		//We are passing data as a method arguement
		
		/*
		 * Test t3=; le.run(t3);
		 */
		le.run((x,y)->{
			int z=x+y;
			return z;
		});
		
		String x="karthik";
		int i=10;
		
		Consumer<Integer> t1=(c)->System.out.println("value c is "+c);
				
				
		
		t1.accept(10);
		
		
		//Lamda allows functional programming
		
		Function<Integer, Integer> r= (t)->{
			int c=10;
			double z=10.0;
			System.out.println(t);
			return t;
		};
		System.out.println(r.apply(10));
		
		
		Consumer<String> t3=(f)->{
			System.out.println(f);
		};
		
		t3.accept("Karthik");
		
		Supplier<String> t4=()->{
			return "Java features class";
		};
		System.out.println(t4.get());
		
		List<Integer> l= new ArrayList<Integer>();
		List<Integer> l2= new Vector<Integer>();
		List<Integer> l3= new LinkedList<Integer>();
		ArrayList<Integer> l1= new ArrayList<Integer>();
		
		
		
	}
	
	void display(List i) {
		
	}

}
