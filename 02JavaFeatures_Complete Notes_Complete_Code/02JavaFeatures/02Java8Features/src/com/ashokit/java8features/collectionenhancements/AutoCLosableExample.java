package com.ashokit.java8features.collectionenhancements;

public class AutoCLosableExample implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("close method of AutoCLosableExample is called");
		
	}

}
