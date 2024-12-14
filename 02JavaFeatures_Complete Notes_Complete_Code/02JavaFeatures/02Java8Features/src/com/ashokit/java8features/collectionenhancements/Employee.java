package com.ashokit.java8features.collectionenhancements;

public class Employee implements Comparable<Employee>{

	private int empId;
	private String empName;
	private double empSal;
	private double basicSalary;
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getNoOfWorkingdays() {
		return noOfWorkingdays;
	}
	public void setNoOfWorkingdays(int noOfWorkingdays) {
		this.noOfWorkingdays = noOfWorkingdays;
	}
	

	public Employee(int empId, String empName, double empSal, double basicSalary, int noOfWorkingdays) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.basicSalary = basicSalary;
		this.noOfWorkingdays = noOfWorkingdays;
	}


	private int noOfWorkingdays;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Emp Id is "+empId+" Name is "+empName+" salary is "+empSal;
	}
	
	  
	  public static int compare(Employee e1, Employee e2) {
	    return (e1.getEmpId() < e2.getEmpId()) ? -1 : ((e1.getEmpId() == e2.getEmpId()) ? 0 : 1);
	  }
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return compare(this, o);

	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empId;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e=(Employee)obj;
		if(this.empId==e.empId)
			return true;
		else
		return false;
	}
	
}
