package com.ashokit.java8features.collectionenhancements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CollectionEnhancements {
	
	public static void main(String[] args) {
		
		/*
		 * int $1=10+20; System.out.println($1);
		 */
		
		int i=10;
		//String i="hello";
		List<Integer> l= new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		/*
		 * l.remove(new Integer(50));
		 * 
		 * Predicate<Integer> p1=(d)->false; l.removeIf(p->p%2==0);
		 */
		System.out.println("printiong data from collection object without java8");
		for (int i = 0; i < l.size(); i++) {
			
			System.out.println(" ");
			System.out.println(l.get(i));
		}
		
		
		/* Consumer<Integer> c=; */
		System.out.println("printiong data from collection object with java8");
		l.forEach((x)-> {
			System.out.println(" ");
			System.out.println(x);
			});
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(123, "karthik", 100000));//1
		empList.add(new Employee(124, "Aditya", 200000));//2
		empList.add(new Employee(125, "Atul", 300000));//3
		empList.add(new Employee(126, "Vaibhav", 400000));//4
		empList.add(new Employee(127, "Shesha", 500000));//5
		
		
		/*
		 * Iterator<Employee> itr= empList.iterator();//5 while(itr.hasNext()) {
		 * Employee e=itr.next(); empList.add(new Employee(1234, "Srivalli", 1234));//6
		 * 
		 * }
		 */		
		for (int i = 0; i < empList.size(); i++) {
			//System.out.println("EmpId is "+empList.get(i).getEmpId()+ " Emp Name is "+empList.get(i).getEmpName());
			/*
			 * if(empList.get(i).getEmpName().equalsIgnoreCase("k")) { e }
			 */
		}
		
		Consumer<Employee> c= (v)->{
			
			double sal=v.getEmpSal();
			double deductedSal=sal*0.01;
			System.out.println("EmpIs is "+v.getEmpId()+ " Emp Name is "+v.getEmpName()+" Deducted slaary is "+deductedSal);
			
		};
		empList.forEach((v)->{
			
			
			double sal=v.getEmpSal();
			double deductedSal=sal*0.01;
			if(deductedSal>2000)
				System.out.println("EmpIs is "+v.getEmpId()+ " Emp Name is "+v.getEmpName()+" Deducted slaary is "+deductedSal);
			
		});
		
		empList.removeIf(p->p.getEmpName().startsWith("k"));
		//empList.forEach(c)
		
		
		/*
		 * List<List<Integer>> l1= new ArrayList<List<Integer>>();
		 * l1.forEach((r->System.out.println(r)));
		 */
		
		
	}

}
