package example.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExample {
	public static void main(String[] args) {
		LocalDate sysDate = LocalDate.now();
		System.out.println("Today's date is " + sysDate);
		LocalTime sysTime = LocalTime.now();
		System.out.println("Current Time: " + sysTime);
		LocalDateTime timeStamp = LocalDateTime.now();
		System.out.println("Current Time Stamp: " + timeStamp);
		
		LocalDate independenceDay = LocalDate.of(1947, 8, 15);
		System.out.println("We got independence on " + independenceDay);
	}
}
