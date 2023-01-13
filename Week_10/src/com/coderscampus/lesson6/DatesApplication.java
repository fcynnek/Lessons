package com.coderscampus.lesson6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;

public class DatesApplication {

	public static void main(String[] args) {

//		lesson6();
//		lesson7();
		
//		Date date = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 0, 1);
		Date jan1 = cal.getTime();
		System.out.println(jan1);
		
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // HH=24hr format hh=12hr format
		String formattedDate = formatter.format(jan1);
		System.out.println(formattedDate);
		
		DateFormat formatter2 = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss z");
		formatter2.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		String formattedDate2 = formatter2.format(jan1);
		System.out.println(formattedDate2);
		
		String dateValue1 = "2020-01-05 5:00 PM";
		String dateValue2 = "2019-01-01 10:00 AM";
		
		DateFormat formatter3 = new SimpleDateFormat("yyyy-MM-dd h:mm a");
		try {
			Date date1 = formatter3.parse(dateValue1);
			Date date2 = formatter3.parse(dateValue2);
			if (date1.before(date2) ) {
				System.out.println("date1 is before date2");
			} else {
				System.out.println("date1 is after date2");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

	private static void lesson7() {
		Date jan012020 = new Date(2020,1,1,0,0,0); // YYYY, MM, DD, HH, MM, SS
		System.out.println(jan012020);
		
		Calendar cal = Calendar.getInstance(); // calendars cannot be instantiated
		
		Date now = cal.getTime();
		System.out.println(now);
		
		Date someOtherDate = cal.getTime(); // when changing the date, we "instantiate"
		cal.set(2020, 1, 1, 15, 1, 5);		// then we change it to the desired date  ** ALSO: MM is zero base
		someOtherDate = cal.getTime();		// then we call on the variable AFTER WE CHANGED THE DATE
		System.out.println(someOtherDate);
		
		cal.add(Calendar.HOUR, 2); // default value of adding hour = 10
		System.out.println(cal.getTime());
		
		cal.add(Calendar.MINUTE, -1); // there is no add function so we "add" a negative number to subtract 
		System.out.println(cal.getTime());
		
		if (now.after(someOtherDate)) {
			System.out.println(now + " is after " + cal.getTime());
		}
		
//		Calendar.getInstance(TimeZone.getTimeZone("America/Los Angeles"));
	}

	private static void lesson6() {
		Date now = new Date();
		System.out.println(now);
		
		java.sql.Date alsoNow = new java.sql.Date(0);
		System.out.println(alsoNow);
	}

}
