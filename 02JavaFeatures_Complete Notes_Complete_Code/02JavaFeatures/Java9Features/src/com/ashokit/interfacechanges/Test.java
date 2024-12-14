package com.ashokit.interfacechanges;

public class Test implements Display{
	
	private void subtract() {
		
	}
	
	void show() {
		//InterfaceNAme.super.defaultmethodname();
		Display.super.add();
		Display.super.add1();
		Display.mul();
		//Display.duplicateCode();
	}
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		//Display.super.add();
	}
	
	@Override
	public void add1() {
		// TODO Auto-generated method stub
	//	Display.super.add1();
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}

}
