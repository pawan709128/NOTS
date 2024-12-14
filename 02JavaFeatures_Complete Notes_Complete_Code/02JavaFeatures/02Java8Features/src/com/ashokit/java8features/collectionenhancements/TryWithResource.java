package com.ashokit.java8features.collectionenhancements;

import java.io.BufferedReader;
import java.io.FileReader;



public class TryWithResource {
	
	public static void main(String[] args) {
		
		AutoCLosableExample a= new AutoCLosableExample();
		BufferedReader b=new BufferedReader(new FileReader("C:\\\\Users\\\\DELL\\\\Desktop\\\\SRINU EAMCET\\\\Allotment Order.pdf"));
		try(a;b){
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("hi");
		}
	}

}
