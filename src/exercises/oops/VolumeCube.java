package exercises.oops;

public class VolumeCube implements VolumeShapesInterface{
	int a;
	

	VolumeCube(int i){
		a = i;
	}
	@Override
	public void volume() {
		int res = (int) Math.pow(a, 3);
		System.out.println("Cube Volume: "+ res);
		
	}
	
	public static void main(String[] args) {
		VolumeCube cObj = new VolumeCube(15);
		cObj.volume();
		cObj.login("guest", "guest");
		
		VolumeCube cObj2 = new VolumeCube(45);
		cObj2.volume();
	}
	@Override
	public void login(String uname, String pwd) {
		System.out.println("login successful");
		
	}

}
