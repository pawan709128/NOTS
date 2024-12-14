package com.ashokit.java9changes;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperatorExample {
	
	public static void main(String[] args) {
		
		DiamondAbstract<Integer> b= new DiamondAbstract<>() {

			@Override
			public void add(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				
			}
			
			
		};
		
		List<Integer> l= new ArrayList<>();
		List<Integer> l1= new ArrayList<Integer>();
		l.add(10);
		l.add(10);
		l.add(10);
		//Type Safety
		
		int s=l.get(2);//Type Casting
	}

}
