package com.ashokit.java8features.collectionenhancements;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
	
	public static void main(String[] args) {
		
		
		
		LocalDateTime startTime=null;
		LocalDateTime endTime=null;
		Duration d=null;
		List<String> stringList=new ArrayList<String>();
		stringList.add("karthik");
		stringList.add("karthik");
		stringList.add("Melvin");
		stringList.add("Krishna");
		stringList.add("Krishna");
		stringList.add("Venkat");
		stringList.add("Swathi");
		stringList.add("Bharat");
		
		System.out.println(stringList.stream().collect(Collectors.groupingBy((p)->p,Collectors.counting())));;
		

		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(123, "karthik", 100000));//1
		empList.add(new Employee(129, "karthik", 800000));//1
		empList.add(new Employee(124, "Aditya", 200000));//2
		empList.add(new Employee(125, "Aditya", 300000));//3
		empList.add(new Employee(126, "Vaibhav", 400000));//4
		empList.add(new Employee(127, "Shesha", 500000));//5
		empList.add(new Employee(128, "karan", 600000));//5
		
		
		
		///
		System.out.println("Start of operation");
		startTime=LocalDateTime.now();
		empList.stream().map(p->p.getEmpName()).forEach(p->System.out.println(p));
		endTime=LocalDateTime.now();
		d= Duration.between(startTime, endTime);
		System.out.println("Time taken for stream operation is "+d.toNanos());
		
		System.out.println("Start of Parallel Stream operation");
		startTime=LocalDateTime.now();
		empList.parallelStream().map(p->p.getEmpName()).forEachOrdered(p->System.out.println(p));
		endTime=LocalDateTime.now();
		d=Duration.between(startTime, endTime);
		System.out.println("Time taken for parallel stream operation is "+d.toNanos());
		
		
		System.out.println(empList.stream().collect(Collectors.groupingBy((p)->p.getEmpName(),Collectors.counting())));
		
		//empList.stream().mapToDouble((p)->p.getEmpSal()).collect(Collectors.toList());
		
		
		List<String> l1=new ArrayList<String>();
		l1.add("KARTHIK");
		l1.add("Kiran");
		l1.add("Abc");
		
		List<String> l2=new ArrayList<String>();
		l2.add("Ashok");
		l2.add("Aditya");
		
		List<List<String>> l3=new ArrayList<>();
		l3.add(l1);//0th l1
		l3.add(l2);//
		
		/* l4<string> */
		//input is List<List<String>>
		//op List<String>
		
		List<String> result= new ArrayList<String>();
		for (int i = 0; i < l3.size(); i++) {//2
			List<String> innerList=l3.get(i);//l2
			for (int j = 0; j < innerList.size(); j++) {//2
				String obj=innerList.get(j);
				result.add(obj);
			}
		}
		
		System.out.println(l3.stream().flatMap(p->p.stream()).collect(Collectors.toList()));
		DoubleSummaryStatistics d1= empList.stream().collect(Collectors.summarizingDouble((p)->p.getEmpSal()));
		System.out.println(d1);
		System.out.println("Average "+d1.getAverage());
		System.out.println("max "+d1.getMax());
		System.out.println("min "+d1.getMin());
		
		
		/*
		 * Limit skip
		 */
		
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(30);
		numbers.add(45);
		numbers.add(55);	
		System.out.println("For Each Example");
		numbers.stream().forEach(p->System.out.println(p));
		System.out.println("For Each Ordered Example");
		numbers.stream().forEachOrdered(p->System.out.println(p));
		//What is the difference between map and flat map
		
		//write a program to print first number in the given array
		//forEachOrdered
		//forEach
//flatmap
		//reduce
		//parallel stream
		//55,45,30,20,15,10
		//45
		//Write a stream program to display the second largest number
		System.out.println("Write a stream program to display the second largest number");
		numbers.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).forEach(p->System.out.println(p));
		
		//Write a stream program to display the second smallest number
		//10,15,20,30,45,55
		//10,15
		//15
				System.out.println("Write a stream program to display the second shortest number");
				numbers.stream().sorted().limit(2).skip(1).forEach(p->System.out.println(p));
		System.out.println("second largest emp sala");
		//t1,t2,t3
		//t2,t3
		empList.stream().sorted((t1,t2)->(t1.getEmpSal() < t2.getEmpSal()) ? 1 : ((t1.getEmpSal() == t2.getEmpSal()) ? 0 : -1)).limit(3).skip(1).forEach(p->System.out.println(p));
		
		System.out.println(numbers.stream().limit(4));
		
		numbers.stream().limit(4).filter(p->p>10).forEach(p->System.out.println(p));;
		System.out.println("skip method output");
		numbers.stream().skip(3).forEach(p->System.out.println(p));
		//1000-select * from employee;
		
	}

}
