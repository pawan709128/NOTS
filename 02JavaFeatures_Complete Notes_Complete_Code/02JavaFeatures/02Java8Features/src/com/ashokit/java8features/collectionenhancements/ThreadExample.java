package com.ashokit.java8features.collectionenhancements;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample extends Thread{
	
	@Override
	public void run() {//Running
		System.out.println("run method");
		m1();
	}
	//Dead
	
	public static void main(String[] args) {
		
		/*ThreadExample t1= new ThreadExample();//New
		ThreadExample t2=new ThreadExample();
		//Thread is independent path of execution with in a same program
		t1.start();
		t2.start();
		
		t1.start();*/
		
		/*
		 * ExecutorService ex=Executors.newFixedThreadPool(3); ex.su
		 */
	}
	
	public void m1() {
		System.out.println("m1 method execution");
		
	}
	
	

}
