package com.ashokit.java8features.collectionenhancements;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample {
	
	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(123, "karthik", 100000));//1
		empList.add(new Employee(123, "karthik1", 800000));//1
		empList.add(new Employee(124, "Aditya", 200000));//2
		empList.add(new Employee(125, "Atul", 300000));//3
		empList.add(new Employee(126, "Vaibhav", 400000));//4
		empList.add(new Employee(127, "Shesha", 500000));//5
		empList.add(new Employee(128, "karan", 600000));//5
		
		empList.stream().map(p->p.getEmpSal()).reduce((m,n)->m<n?m:n).ifPresent(p->System.out.println("Min salary is"+p));
	}

}
