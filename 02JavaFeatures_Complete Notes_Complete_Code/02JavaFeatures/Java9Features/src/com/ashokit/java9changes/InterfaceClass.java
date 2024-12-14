package com.ashokit.java9changes;

public class InterfaceClass implements InterfaceTest{
	final int z;//blank final variable
	InterfaceClass(int z){
		this.z=z;
	}
	
	
	public static void main(String[] args) {
		InterfaceClass t1=new InterfaceClass(5);
		InterfaceClass t2=new InterfaceClass(10);
		
		System.out.println(t1.i);//50
		System.out.println(t2.i);//50
		System.out.println(t1.z);//5
		System.out.println(t2.z);//10
		/* t1.z=35; */
		
		
	}

}
