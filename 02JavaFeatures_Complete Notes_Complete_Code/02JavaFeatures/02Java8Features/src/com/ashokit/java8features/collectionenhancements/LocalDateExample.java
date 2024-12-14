package com.ashokit.java8features.collectionenhancements;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
	
	public static void main(String[] args) {
		
		LocalDateTime d= LocalDateTime.now();
		System.out.println(d);
		System.out.println(LocalTime.now()) ;
		System.out.println(LocalDateTime.now());
		
		System.out.println(d.plusDays(31));
		
		
		//31- Aug-2022
		
		LocalDateTime d1=LocalDateTime.of(2022, Month.SEPTEMBER, 26,9,26,30);
		
		System.out.println(d1);
		//2 date objects
		//d= 27-09-2022, d1= 31- 08-2022
		
		Duration dur= Duration.between(d1, d);
		
		System.out.println(dur.toMillis());
		
		//Dur
		
		//String- Date

		 
		
		/*
		 * DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 * 
		 * 
		 * String dateTime = "2020-12-11"; LocalDate formatDateTime =
		 * LocalDate.parse(dateTime, formatter); System.out.println(formatDateTime);
		 */
		
		
		ZonedDateTime currentTimeInIndia = ZonedDateTime.now();
		System.out.println("currentTimeInIndia "+currentTimeInIndia);

		
		 ZonedDateTime instantInUTC =
		 currentTimeInIndia.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
		 System.out.println(instantInUTC);
		 
	}

}
