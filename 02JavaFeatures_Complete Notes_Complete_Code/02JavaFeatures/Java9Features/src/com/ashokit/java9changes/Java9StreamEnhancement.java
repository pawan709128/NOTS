package com.ashokit.java9changes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Java9StreamEnhancement {
	
	public static void main(String[] args) {
		
		List<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(15);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(10);
		
		System.out.println("i value is using for loop");
		for (int i = 1; i < 10000; i=i*10) {
			System.out.println(i);
		}
		//1
		//10
		//100
		//1000
		
		System.out.println("using iterate method");
		Stream.iterate(1, j->j<10000, j->j*10).forEach(p->System.out.println(p));
		
		
		//int i=0;
	//	Stream.iterate(0, j->j<l.size(), j->j+1).forEach(l.get(j));
		
		l.stream().limit(3).forEach(p->System.out.println(p));
		System.out.println("skip statment");
		l.stream().skip(3).forEach(p->System.out.println(p));
		System.out.println("take while statment");
		l.stream().takeWhile(p->p%2==0).forEach(p->System.out.println(p));
		
		System.out.println("filter statment");
		l.stream().filter(p->p%2==0).forEach(p->System.out.println(p));
		
		System.out.println("drop while statment");
		l.stream().dropWhile(p->p%2==0).forEach(p->System.out.println(p));
		
		//drop while
		//take while
	}

}
