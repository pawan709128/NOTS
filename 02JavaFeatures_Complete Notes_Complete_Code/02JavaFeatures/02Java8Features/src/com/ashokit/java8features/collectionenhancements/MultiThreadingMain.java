package com.ashokit.java8features.collectionenhancements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadingMain {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//10 emp
		
		Employee e= new Employee(1, "Karthik", 0, 10000, 21);
		Employee e1= new Employee(1, "Vaibhav", 0, 20000, 11);
		Employee e2= new Employee(1, "Harish", 0, 30000, 10);
		Employee e3= new Employee(1, "Aditya", 0, 5000, 20);
		Employee e4= new Employee(1, "Krishna", 0, 6000, 21);
		Employee e5= new Employee(1, "Melvin", 0, 7000, 22);
		Employee e6= new Employee(1, "Sohini", 0, 8000, 23);
		Employee e7= new Employee(1, "sunil", 0, 9000, 24);
		Employee e8= new Employee(1, "amol", 0, 11000, 25);
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(e);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);
		
		
		
		ExecutorService ex= Executors.newFixedThreadPool(5);
		List<SalaryCalculation> taskList=new ArrayList<SalaryCalculation>();
		for (int i = 0; i < empList.size(); i++) {			
			SalaryCalculation sal= new SalaryCalculation(empList.get(i));
			taskList.add(sal);			
		}
		
		ex.invokeAll(taskList);
		
		ex.shutdown();
		
	}

}
