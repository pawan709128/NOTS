package com.ashokit.java8features;

public class Example4 {

	void display() {
		
	}
	public static void main(String[] args) {
		Example4 t2=new Example4();
		new Example4().display();
		
		t2=null;
		Thread t= new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Calling run method");
			}
		});


		Thread t1=new Thread(()->System.out.println("Calling run method"));


	}
}