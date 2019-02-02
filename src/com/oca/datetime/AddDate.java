package com.oca.datetime;
import java.time.LocalDate;
import java.time.Month;

public class AddDate {
	
	public static void main(String...strings) {
		LocalDate today = LocalDate.of(2017, Month.JANUARY, 23);
		today = today.plusDays(42);
		System.out.println(today);
	}
}
