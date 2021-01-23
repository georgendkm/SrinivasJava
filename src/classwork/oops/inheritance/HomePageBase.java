package classwork.oops.inheritance;

public class HomePageBase {
	
	public String uname = "";
	protected String fristName = "";
	String lastName = "";
	private String userPwd = "";
	
	private void priPrint() {
		System.out.println("its private method");
	}
	
	public final void noOverride() {
		System.out.println("in final parent");
	}
	public void login() {
		System.out.println("Logged into app");
	}
	
	public void logon(String un, String up) {
		System.out.println("I am in parent logon");
	}
	
	protected void logout() {
		System.out.println("Logged out of app");
	}
	
	void packPri() {
		System.out.println("its package private method");
	}
	
	public static void parStat() {
		System.out.println("In parent static");
	}
	
	public static void main(String[] args) {
		HomePageBase obj = new HomePageBase();
		obj.login();
		obj.logon("guest", "guest");
		obj.logout();
		obj.packPri();
		obj.priPrint();
		
	}

}
