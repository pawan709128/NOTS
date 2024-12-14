package com.ashokit.java8features.collectionenhancements;

public class MethodReferenceExample {
	
	public static void main(String[] args) {
		
		MethodRefClass2 mr=new MethodRefClass2();
		Test t=(y,y1)->MethodRefClass2.show(y);
		/* t.display(10,20); */
		
		//Test t1=MethodRefClass2::show;
		
		Test t2=(y,x)->mr.add(y,x);
		
		Test t3=mr::add;
		t2.display(10, 20);
		t3.display(20, 0);
	}
	
	
}
