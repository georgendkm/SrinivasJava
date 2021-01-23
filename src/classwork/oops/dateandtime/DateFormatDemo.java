package classwork.oops.dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) throws Exception {

		SimpleDateFormat fm = new SimpleDateFormat("MMMM-dd-yyyy hh:mm:ss:SS a");
		
		Date now = new Date();
		System.out.println(now);
		
		System.out.println(fm.format(now));
		SimpleDateFormat fm2 = new SimpleDateFormat("EEEE MM-dd-yy HH:mm:ss:SS");
		System.out.println(fm2.format(now));
		SimpleDateFormat fm3 = new SimpleDateFormat("EEEE dd-MMM-yyyy z");
		System.out.println(fm3.format(now));
		
		
		SimpleDateFormat fm4 = new SimpleDateFormat("MMM/dd/yyyy HH:mm:ss");
		String datStr = "Jan/01/2021 12:00:00";
		Date myDate = fm4.parse(datStr);
		System.out.println("myDate : " + myDate);
		System.out.println(fm2.format(myDate));
		
		
		
	}

}
