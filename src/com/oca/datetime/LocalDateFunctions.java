package com.oca.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateFunctions {
	
	public static void main(String...strings ) {
		
		// 1. CREATE
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		localDate = LocalDate.parse("2017-05-09");
		System.out.println(localDate);

		localDate = LocalDate.of(2017, 8, 9);
		System.out.println(localDate);
		
		//2. MANIPULATE
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getDayOfYear());
		
		System.out.println(localDate.plusDays(10));
		
		LocalTime now = LocalTime.now();
		System.out.println(now);
		now = LocalTime.of(23,59);
		System.out.println(now);
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(dtf.format(localDate));
		
		LocalDate date = LocalDate.of(2014,8,24);
		LocalTime time = LocalTime.of(14,46,15);
		DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yy");
		DateTimeFormatter d2 = DateTimeFormatter.ofPattern("YYYY");
		DateTimeFormatter d3 = DateTimeFormatter.ofPattern("Y M D");
		DateTimeFormatter d4 = DateTimeFormatter.ofPattern("e ee eee");
		DateTimeFormatter t1 = DateTimeFormatter.ofPattern("H h m s");
		DateTimeFormatter t2 = DateTimeFormatter.ofPattern("'Time now:'HH mm a");
		System.out.println(d1.format(date)); // 14
		System.out.println(d2.format(date)); // 2014
		System.out.println(d3.format(date)); // 14 08 xxx
		System.out.println(d4.format(date)); // Sunday
		System.out.println(t1.format(time)); // 14 2 46 15
		System.out.println(t2.format(time)); // Time now 14 46 PM
		
		String printDate = LocalDateTime.parse("2057-08-11T13:46").format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(printDate);
		
		
		
		

		
		
		
	}

}
