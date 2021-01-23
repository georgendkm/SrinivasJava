package classwork.oops.inheritance;

public class SearchPage extends HomePageBase {
	
	
	public void searchHotel() {
		System.out.println("Searching for Hotel");
	}
	public void SelectHotel() {
		System.out.println("Selecting a Hotel");
	}
	
//	@Override
//	public void noOverride() { //final method can not be oerridden
		
//	}

	public static void main(String[] args) {
		SearchPage obj = new SearchPage();
		obj.login();
		obj.searchHotel();
		obj.SelectHotel();
		obj.logout();
		//obj.userPwd; // private can not be accessible
		//obj.priPrint();// private can not be accessible
		obj.packPri();
		
		
		
	}

}
