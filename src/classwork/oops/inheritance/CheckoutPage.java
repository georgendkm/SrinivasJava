package classwork.oops.inheritance;

public class CheckoutPage extends SearchPage{
	
	public void checkOutHotel() {
		System.out.println("Checking out hotel booking");
	}

	public static void main(String[] args) {
		
		CheckoutPage obj = new CheckoutPage();
		obj.login();
		obj.searchHotel();
		obj.SelectHotel();
		obj.checkOutHotel();
		obj.logout();
	}

}
