package classwork.oops.dateandtime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {

	public static void main(String[] args) {

		GregorianCalendar mycal = new GregorianCalendar();
		
		System.out.println(mycal.getTimeZone());
		System.out.println(mycal.get(Calendar.DAY_OF_MONTH));
		System.out.println(mycal.get(Calendar.MONTH));
		System.out.println(mycal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(mycal.get(Calendar.YEAR));
		System.out.println(mycal.get(Calendar.HOUR_OF_DAY));
		mycal.add(Calendar.DAY_OF_MONTH, 5);
		System.out.println(mycal.get(Calendar.DAY_OF_MONTH));
		mycal.add(Calendar.MONTH, 3);
		mycal.add(Calendar.YEAR, 1);
		Date newDate = mycal.getTime();
		System.out.println(mycal.get(Calendar.MONTH));
		System.out.println(newDate);
		mycal.add(Calendar.DAY_OF_MONTH, -15);
		mycal.add(Calendar.MONTH, -3);
		mycal.add(Calendar.YEAR, -1);
		Date newDate2 = mycal.getTime();
		System.out.println(newDate2);
		
		/*Print a date by ading 2 months from today*/
		GregorianCalendar mycal2 = new GregorianCalendar();
		mycal2.add(Calendar.MONTH, 2);
		Date myDate = mycal2.getTime();
		SimpleDateFormat fr = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println(fr.format(myDate));
	}

}
