package classwork.oops;

import classwork.oops.inheritance.HomePageBase;

public class FlightSearchPage extends HomePageBase{
	
	public void searchFlight() {
		System.out.println("Searching for flight");
	}
	public void bookFlightFlight() {
		System.out.println("Booking flight");
	}

	public static void main(String[] args) {
		
		FlightSearchPage obj = new FlightSearchPage();
		obj.login();
		obj.searchFlight();
		obj.bookFlightFlight();
		obj.logout();
		//obj.priPrint(); // can not access private
		//obj.packPri(); // can not access package private
		
	}

}
