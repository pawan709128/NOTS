package com.ashokit.java9changes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;



public class TryWithResourceJava7 {

	public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader b=null; try { b= new BufferedReader(new
		 * FileReader("C:\\Users\\DELL\\Desktop\\SRINU EAMCET\\Allotment Order.pdf"));
		 * }catch (Exception e) { // TODO: handle exception }finally { if(b!=null) {
		 * b.close(); } }
		 */
		
		
		/*try(BufferedReader b=new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\SRINU EAMCET\\Allotment Order.pdf");AutoCLosableExample a= new AutoCLosableExample()))) {*/
		/*
		 * try(AutoCLosableExample a= new AutoCLosableExample(); BufferedReader b=new
		 * BufferedReader(new
		 * FileReader("C:\\\\Users\\\\DELL\\\\Desktop\\\\SRINU EAMCET\\\\Allotment Order.pdf"
		 * ))){ }catch (Exception e) { // TODO: handle exception
		 * System.out.println("hi"); }
		 */
		
		AutoCLosableExample a= new AutoCLosableExample();
		BufferedReader b=new BufferedReader(new FileReader("C:\\\\Users\\\\DELL\\\\Desktop\\\\SRINU EAMCET\\\\Allotment Order.pdf"));
		try(a;b){
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("hi");
		}

	}
}
