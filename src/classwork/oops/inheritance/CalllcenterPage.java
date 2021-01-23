package classwork.oops.inheritance;

public class CalllcenterPage extends HomePageBase {

	@Override
	public void login() { //Method overriding
		System.out.println("in callcenter login");
	}
	
	@Override
	public void logon(String uname, String upwd) {
		System.out.println("in child logon");
	}
	
	public static void parStat() {
		System.out.println("In child static");
	}
	
	public void childMethod() {
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		CalllcenterPage obj = new CalllcenterPage();
		obj.login();
		obj.logon("guest", "guest");
		parStat();
		HomePageBase.parStat();
		obj.childMethod();
		System.out.println("--------------------");
		HomePageBase obj2 = new CalllcenterPage();
		obj2.login();
		obj2.logon("guest", "guest");
		obj2.packPri();
		//obj2.childMethod(); //can't call this
		parStat();
		HomePageBase.parStat();
		System.out.println("--------------------");
		HomePageBase obj3 = new HomePageBase();
		obj3.login();
		obj3.logon("guest", "guest");
	}

}
