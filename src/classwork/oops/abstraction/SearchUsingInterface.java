package classwork.oops.abstraction;

public class SearchUsingInterface implements HomePageInterface, Interface1, Interface2 {



	@Override
	public void login() {
		System.out.println("Search login sucessful");
	}

	@Override
	public void logout() {
		System.out.println("Search logout sucessful");
	}
	
	public void searchHotel() {
		System.out.println("in search Hotel");
	}
	
	public static void main(String[] args) {
		
		SearchUsingInterface obj = new SearchUsingInterface();
		obj.login();
		obj.searchHotel();
		obj.logout();
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

}
