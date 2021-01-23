package classwork.oops;

public class UsingThisDemo {
	
	float radius;
	int length;
	int width;
	int side;
	
	UsingThisDemo(float radius, int length, int width, int s){
		this(radius, length, width);
		side = s;
//		this.radius = radius;
//		this.length = length;
//		this.width = width;
	}
	UsingThisDemo(float radius, int length, int width){
		//this.radius = radius;
		this(radius);
		this.length = length;
		this.width = width;
	}
	UsingThisDemo(float radius){
		this.radius = radius;
	}

	public void areaofCircle() {
		double a = Math.PI * this.radius * this.radius;
		System.out.println("area = " + a);
	}
	public static void main(String[] args) {
		
		UsingThisDemo obj = new UsingThisDemo(8.75f, 5, 8, 10);
		obj.areaofCircle();
		
		UsingThisDemo obj2 = new UsingThisDemo(8.75f, 5, 8);
		UsingThisDemo obj3 = new UsingThisDemo(8.75f);
		
		
		
	}

}
