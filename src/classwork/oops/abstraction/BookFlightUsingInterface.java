package classwork.oops.abstraction;

public class BookFlightUsingInterface extends AbstractBase implements HomePageInterface {



	@Override
	public void login() {
		System.out.println(" Book flight login successful");
		
	}

	@Override
	public void logout() {
		System.out.println(" Book flight logout successful");
		
	}
	
	public void bookFlight() {
		System.out.println(" Booked flight ");
	}
	public static void main(String[] args) {
		BookFlightUsingInterface obj = new BookFlightUsingInterface();
		obj.login();
		obj.bookFlight();
		obj.logout();
		//obj.PI = 5.67f; cant change as t is public static final
		System.out.println(obj.PI);

		HomePageInterface obj2 = new BookFlightUsingInterface();
		obj2.login();
		obj.logout();
	}

	@Override
	public void checkout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	
}
