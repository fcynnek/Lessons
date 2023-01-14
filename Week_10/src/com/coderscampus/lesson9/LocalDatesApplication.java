package com.coderscampus.lesson9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Formatter;

public class LocalDatesApplication {

	public static void main(String[] args) {

//		lesson9();
		
		LocalDateTime jan1 = LocalDateTime.of(2020, 1, 1, 13, 30, 0);
		System.out.println(jan1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm:ss a")));
		
		LocalDateTime jan2 = LocalDateTime.of(2020, 1, 2, 9, 0, 0);
		System.out.println(jan1.isBefore(jan2));
		
		LocalDateTime jan3 = jan1.plusDays(2);
		// immutability
		System.out.println(jan3.isBefore(jan2));
		
		jan3 = jan3.minus(1, ChronoUnit.DAYS);
		System.out.println(jan3);

	}

	private static void lesson9() {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(datetime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));
	}

}
