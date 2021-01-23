package classwork.oops.dateandtime;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws Exception {

		Date date1 = new Date();
		Thread.sleep(5000);
		Date date2 = new Date();
		
		System.out.println(date1);
		System.out.println(date2);
		
		System.out.println(" Equlas : " +   date1.equals(date2));
		System.out.println(" Before : " +   date1.before(date2));
		System.out.println(" After : " +   date1.after(date2));
		
		System.out.println(" date1 compareTo date2 (before) :" +    date1.compareTo(date2));
		System.out.println(" date2 compareTo date1 (after) :" +    date2.compareTo(date1));
		System.out.println(" date2 compareTo date2(equal) : " +    date2.compareTo(date2));

	}

}
