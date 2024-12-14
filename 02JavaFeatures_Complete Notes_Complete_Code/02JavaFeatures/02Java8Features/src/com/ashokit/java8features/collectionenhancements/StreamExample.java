package com.ashokit.java8features.collectionenhancements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	
	
	public void m1(String ...a) {
		
		System.out.println(a.length);
		
	}
	
	/*
	 * @Override public String toString() { // TODO Auto-generated method stub
	 * return super.toString(); }
	 */
	public static void main(String[] args) {
		StreamExample s= new StreamExample();
		System.out.println(s);
		s.m1();
		s.m1("10");
		s.m1("10","20");
		/*
		 * s.m1(10,20,20); s.m1(10,4,3,2,2);
		 */
		
		List<Integer> l= new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		//Collection Data Structure
		//LinkedList, Stack and Queue, ArrayList-> Data Structures
		
		//Stream-> Stream is used to perform the operation on the collection object
		
		//How to create Stream.
		Stream<String> st= Stream.of("Hi","sdd","dssd");
		//Java 1.5 -> Var args or variable arguments
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(123, "karthik", 100000));//1
		empList.add(new Employee(123, "karthik1", 800000));//1
		empList.add(new Employee(124, "Aditya", 200000));//2
		empList.add(new Employee(125, "Atul", 300000));//3
		empList.add(new Employee(126, "Vaibhav", 400000));//4
		empList.add(new Employee(127, "Shesha", 500000));//5
		empList.add(new Employee(128, "karan", 600000));//5
		//Write a program to conver the given empList into hashMap<empId,Emp>
		//write a program to create a list which contains empnames 
		//whose name is starting with k
		//k or A
		empList.stream().filter((p)->(p.getEmpName().startsWith("k")&& p.getEmpName().startsWith("A"))).
		map((q)->q.getEmpName()).collect(Collectors.toList());
		System.out.println("output @@@@@@@"+empList.stream().filter((p)->p.getEmpName().startsWith("k")));
		Map<Integer, Employee> m1= empList.stream().distinct().collect(Collectors.toMap((p)->p.getEmpId(), (p)->p));
		System.out.println("Map Object is "+m1);
		System.out.println("Sort employee List");
		empList.stream().sorted().forEach((p)->System.out.println(p));
		System.out.println("******* Distinct Emlpoyees******");
		empList.stream().distinct().forEach(p->System.out.println(p));
		System.out.println("reverse emp order ");
		empList.stream().sorted(Collections.reverseOrder()).forEach((p)->System.out.println(p));
		//sort based on salary
		System.out.println("Employee order by Salary");
		empList.stream().sorted((t1,t2)->(t1.getEmpSal() < t2.getEmpSal()) ? -1 : ((t1.getEmpSal() == t2.getEmpSal()) ? 0 : 1)).forEach((p)->System.out.println(p));
		System.out.println("Employee order by descending Salary");
		empList.stream().sorted((t1,t2)->(t1.getEmpSal() < t2.getEmpSal()) ? 1 : ((t1.getEmpSal() == t2.getEmpSal()) ? 0 : -1)).forEach((p)->System.out.println(p));
		
		
		//Write a stream program to print emp name who is getting maximum salary
		System.out.println("Max emp Salary "+empList.stream().max((t1,t2)->(t1.getEmpSal() < t2.getEmpSal()) ? -1 : ((t1.getEmpSal() == t2.getEmpSal()) ? 0 : 1)).get());
		Employee e2=empList.stream().max((t1,t2)->(t1.getEmpSal() < t2.getEmpSal()) ? -1 : ((t1.getEmpSal() == t2.getEmpSal()) ? 0 : 1)).get();
		System.out.println(e2.getEmpName()+" salary is "+e2.getEmpSal());
		//Write a stream program to print emp name who is getting maximum salary
				System.out.println("Min emp Salary "+empList.stream().min((t1,t2)->(t1.getEmpSal() < t2.getEmpSal()) ? -1 : ((t1.getEmpSal() == t2.getEmpSal()) ? 0 : 1)).get());
				
		
		List emp=new ArrayList();
		//emp.add(100.9);
		emp.add("Karthik");
		//emp.add(10);
		String i1=(String)emp.get(0);//Type Cast //Type Safety
		
		/* emp.stream().map(null) */
		//Write a program to collect all the emp ids into separate list from empList
		empList.stream().map(re->re.getEmpId()).collect(Collectors.toList());
		//empList.stream().collect(Collectors.toList());
		//Write a program to print employee name whose name is starting with k
		List<String> empNameList=new ArrayList<String>();
		for (int i = 0; i < empList.size(); i++) {
			/*
			 * if(validateName(empList.get(i).getEmpName())) {
			 * System.out.println(empList.get(i).getEmpName()); }
			 */
			String name=getName(empList.get(i));
			empNameList.add(name);
		}
		
		System.out.println("code with Stream");
		empList.stream().filter((r)->r.getEmpName().startsWith("k")).forEach((t)->System.out.println(t.getEmpName()));
		
		System.out.println("out put"+empList.stream().filter((r)->r.getEmpName().startsWith("k")));
		//Write a program to collect emp names into separate List from EmpList
		List<String> empNameListUsingStream= empList.stream().map((t)->t.getEmpName()).collect(Collectors.toList());
		System.out.println("Emp Names using stream"+empNameListUsingStream);
		System.out.println("map method output "+empList.stream().map((t)->t.getEmpName()));
		
		
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(30);
		numbers.add(45);
		numbers.add(55);
		numbers.add(55);
		numbers.add(45);
		numbers.add(15);
				
		//Remove the duplicates from the given array list.
		//Write a program to print number of duplicated elements
		int duplicateElementCount=(int) ((int)numbers.size()-numbers.stream().distinct().count());
		System.out.println("duplicateElementCount "+duplicateElementCount);
		System.out.println("duplicate removal "+numbers.stream().distinct());;
		numbers.stream().distinct().forEach((o)->System.out.println(o));
		System.out.println(numbers);//contents of arraylist
		Set<Integer> s2= numbers.stream().filter((gf)->(gf%2==0)).collect(Collectors.toSet());
		//Write a program to sort the list of number
		System.out.println("Sorted numbers "+numbers.stream().sorted().collect(Collectors.toList()));
		
		//Write a program to descending order the list of number
		System.out.println("Descending order numbers "+numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
		
		
		System.out.println(" order numbers using comparator "+numbers.stream().sorted((t1,t2)->(t1 < t2) ? -1 : ((t1 == t2) ? 0 : 1)).collect(Collectors.toList()));
		
		System.out.println(" order numbers using comparator descending "+numbers.stream().sorted((t1,t2)->(t1 < t2) ? 1 : ((t1 == t2) ? 0 : -1)).collect(Collectors.toList()));
		
		//Write a program to print min number from the given list
		/*
		 * int maxval=numbers.get(0); for(int i=1;i<numbers.size();i++) {
		 * if(numbers[i]>minVal) { maxVal=numbers[i]; } }
		 */
		
		System.out.println("Min Number"+numbers.stream().min((t1,t2)->(t1 < t2) ? -1 : ((t1 == t2) ? 0 : 1)).get());
		System.out.println("max Number"+numbers.stream().max((t1,t2)->(t1 < t2) ? -1 : ((t1 == t2) ? 0 : 1)).get());
		//Write a program to print max number from the given list
		//Intermediate operation and terminal operation
		//filter
		//map
		//Terminal operation
		//forEach
		//collec
		/*
		 * List<String> s1= new ArrayList<String>(); s1.add("Karthik");
		 * s1.add("vaibhav");
		 * 
		 * s1.stream().filter((g)->)
		 */
	}
	
	public static boolean validateName(String s) {
		if(s.startsWith("k")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static String getName(Employee e) {
		return e.getEmpName();
	}

}
