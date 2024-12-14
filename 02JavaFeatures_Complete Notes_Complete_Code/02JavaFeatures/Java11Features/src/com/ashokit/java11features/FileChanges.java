package com.ashokit.java11features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileChanges {
	
	public static void main(String[] args) throws IOException {
		Path p= Path.of("C:\\Users\\DELL\\Desktop\\DigitalCurrency.pdf");
		String s=Files.readString(p);
		System.out.println(s);
		
		//Files.writeString(p, "Testing the write operation of files using java 11",StandardOpenOption.TRUNCATE_EXISTING);
	}

}
