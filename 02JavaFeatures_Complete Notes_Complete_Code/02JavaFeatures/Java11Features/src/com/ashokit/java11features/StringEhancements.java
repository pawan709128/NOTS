package com.ashokit.java11features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringEhancements {
	
	String s="hi";
	//var d1="hi";
	
	public static void main(String[] args) {
		
		String s="ABCD";//String object creation using literal
		String s1= new String("ABC");
		String s2= new String("ABC");
		String s3="karthik";
		
		System.out.println(s==s1);
		//s and s1 both string object
		StringEhancements e= new StringEhancements();
		e.hashCode();//SHA
		System.out.println("s1 hashcode "+s1.hashCode());
		System.out.println("s2 hashcode"+s2.hashCode());
		//if the hash code is same then the object may or may not same
		//if the memory location is same then hash code must be same
		System.out.println(s==s3);//
		System.out.println(s1==s2);//false
		//== memory localtion or memory reference
		String s4= new String("ABCD").intern();
		String s5="ABCD";
		System.out.println(s==s4);
		//S="ABCD"
		/*
		 * s=s.concat(" HI"); s.substring(0,2); System.out.println(s);//ABCD HI
		 * System.out.println(s.concat(" Hello"));
		 */
		
		String e1=s.repeat(2);//ABCDABCD
		System.out.println(e1);
		System.out.println(e1.repeat(2));//ABCDABCDABCDABCD
		//s.repeat(Integer.MAX_VALUE);//illegal arguement exception
		//2147483647/ 
		
		String x="Karthik";
		x.repeat(2);//
		System.out.println(x);
		System.out.println(x.repeat(3));
		System.gc();Runtime.getRuntime().gc();
		
		
		String f=" Karthik Hello ";
		System.out.println(f);
		System.out.println(f.trim());
		System.out.println(f.strip());
		System.out.println(f.stripLeading());//Karthik Hello 
		System.out.println(f.stripTrailing());// Karthik Hello
		System.out.println(f);// Karthik Hello 
		
		 String string = '\u2001'+"String    with    space"+ '\u2001';
		 System.out.println(string);
		 System.out.println("output of Strip method ** "+string.strip());
		System.out.println("output of trim method ** "+string.trim());
		
		String j="     ";
		System.out.println(j.isBlank());
		j="abc";
		System.out.println(j.isBlank());
		System.out.println("lines method output");
		System.out.println();
		String k="Karthik \n\r teaching \n Java 11 features";
		//\n or \r or \n\r
		/* System.out.print(k.split("\n")); */
		
		/*
		 * int a[]= {1,3,4,5,6,7}; Arrays.stream(a).filter(null)
		 */
		
		/*
		 * String a[]=k.split("\n"); Arrays.stream(a).filter().for
		 */
		k.lines().forEach(p->System.out.println(p));
		
		//Stream ->0 ->karthik
		//1-> teaching
		//2-> java 11 features
		
		String g="karthik";
		int f1=10;
		//g=10;
		String d;
		/* var u; */
		var h="karthik";
		//h=10;
		var l=10;
		var l1=new ArrayList<Integer>();
		Map<String , Integer> q=m1();
		var q1=m1();
	}
	
	public static  Map<String , Integer> m1(){
		return new HashMap<String, Integer>();
	}

}
