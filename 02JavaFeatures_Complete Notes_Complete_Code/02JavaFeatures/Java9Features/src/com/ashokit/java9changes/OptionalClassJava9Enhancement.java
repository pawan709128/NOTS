package com.ashokit.java9changes;

import java.util.Optional;

public class OptionalClassJava9Enhancement {
	public static void main(String[] args) {
		Optional<Integer> op= m1();
		
		op.ifPresent(p->System.out.println(p));
		op.ifPresentOrElse(p->System.out.println(p), ()->System.out.println("value is null"));
		/*op.ifPresent();*/
		
		System.out.println(op.orElse(0));
		System.out.println(op.orElseGet(()->{
			System.out.println("supplier");
			
		});
		
		System.out.println(op);
	}
	
	public static Optional<Integer> m1(){

		Optional<Integer> op=Optional.ofNullable(null);
		return op;
	}

}
