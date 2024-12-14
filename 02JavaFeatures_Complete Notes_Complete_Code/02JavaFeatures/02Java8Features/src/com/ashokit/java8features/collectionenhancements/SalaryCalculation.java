package com.ashokit.java8features.collectionenhancements;

import java.util.concurrent.Callable;

public class SalaryCalculation implements Callable<Employee>{
	//Callable

	private Employee e=null;
	public SalaryCalculation(Employee e) {
		this.e=e;
	}
	
	/*
	 * @Override public void run() { double salary=
	 * e.getBasicSalary()*e.getNoOfWorkingdays(); e.setEmpSal(salary); }
	 */

	@Override
	public Employee call() throws Exception {
		// TODO Auto-generated method stub
		
		activateSim();
		double salary= e.getBasicSalary()*e.getNoOfWorkingdays();
		e.setEmpSal(salary);
		return e;
	}
	
	public void activateSim() {
		
	}

}
