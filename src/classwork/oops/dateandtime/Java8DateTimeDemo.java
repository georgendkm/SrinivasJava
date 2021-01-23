package classwork.oops.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Java8DateTimeDemo {

	public static void main(String[] args) throws Exception {
		
		LocalDate mydate = LocalDate.now();
		System.out.println("mydate : " + mydate);
		
		LocalTime mytime = LocalTime.now();
		System.out.println("mytime : " + mytime);
		
		LocalDateTime mydatetime = LocalDateTime.now();
		System.out.println("mydatetime : " + mydatetime);
		
		ZonedDateTime zdatetime = ZonedDateTime.now();
		System.out.println("zdatetime : " + zdatetime);
		
		DateTimeFormatter ft = DateTimeFormatter.ofPattern("MMMM-dd-yyyy EEE hh:mm:ss a z");
		String dateStr = ft.format(zdatetime);
		System.out.println("date in format : " + dateStr);
		
		//DateTimeFormatter ft2 = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
		
		System.out.println(" Day of month : " + mydate.getDayOfMonth());
		System.out.println(" month : " + mydate.getMonthValue());
		System.out.println(" year : " + mydate.getYear());
		System.out.println(" day of the year : " + mydate.getDayOfYear());	
		System.out.println(" length of month : " + mydate.lengthOfMonth());	
		System.out.println(" is lear year : " + mydate.isLeapYear());
		LocalDate mydate2 = LocalDate.now();
		System.out.println("mydate : " + mydate);
		
		Thread.sleep(5000);
		LocalDateTime mydatetime2 = LocalDateTime.now();
		System.out.println("mydatetime : " + mydatetime);
		
		System.out.println("is after : " + mydatetime.isAfter(mydatetime2));
		System.out.println("is before : " + mydatetime.isBefore(mydatetime2));
		System.out.println("is equal : " + mydatetime.isEqual(mydatetime));
		System.out.println("is equal : " + mydatetime.isEqual(mydatetime2));
		
		System.out.println(" my date before plus: "+ mydate);
		mydate = mydate.plusDays(5).plusMonths(1).plusWeeks(1).plusYears(1);
		System.out.println(" my date after plus: "+ mydate);
		
		System.out.println("date and time : " + mydatetime);
		mydatetime = mydatetime.minusDays(10).minusMonths(1).minusYears(1).minusHours(5).minusSeconds(10);
		System.out.println("date and time with minus : " + mydatetime);
		
		System.out.println("mydatetime2 : " + mydatetime2);
		mydatetime2 = mydatetime2.plusYears(2).plusHours(10).minusHours(10);
		System.out.println("mydatetime2 : " + mydatetime2);
		
	      // check period between dates
        LocalDate oldDate = LocalDate.of(2021, Month.JANUARY, 31);
        LocalDate newDate = LocalDate.of(2020, Month.DECEMBER, 31);
        
        System.out.println("old date : " + oldDate);
        System.out.println("new date : " + newDate);
        Period period = Period.between(oldDate, newDate);
        
        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.print(period.getDays() + " days");
        System.out.println();
        
        /* Setting the date using formatter*/
		DateTimeFormatter ft2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String dstr = "10/01/2021 12:59:25";
		LocalDateTime pasredDate = LocalDateTime.parse(dstr, ft2);
		System.out.println("pasred Date : " + pasredDate);
		
				
	}

}
