package classwork.oops;

public class OverloadingConsDemo {
	float radius;
	int length;
	int width;
	
	public OverloadingConsDemo(){  // Default constructor
	}
	
	public OverloadingConsDemo(float r, int l, int w){
		radius = r;
		length = l;
		width = w;
	}
	public OverloadingConsDemo(int l, int w){
		length = l;
		width = w;
	}
	public OverloadingConsDemo(float r){
		radius = r;
	}
	
	public void areaofCircle() {
		double a = Math.PI * radius * radius;
		System.out.println("Area of circle : " + a);
	}
	public void areaofrectangle() {
		double a = length * width;
		System.out.println("Area of rectangle : " + a);
	}

	public static void main(String[] args) {
		
		OverloadingConsDemo obj = new OverloadingConsDemo(9.75f, 25, 50);
		System.out.println("radius : " + obj.radius);
		System.out.println("length : " + obj.length);
		System.out.println("width : " + obj.width);
		obj.areaofCircle();
		obj.areaofrectangle();
		System.out.println("------------------------");
		OverloadingConsDemo obj2 = new OverloadingConsDemo(12.5f, 75, 100);
		System.out.println("radius : " + obj2.radius);
		System.out.println("length : " + obj2.length);
		System.out.println("width : " + obj2.width);
		obj2.areaofCircle();
		obj2.areaofrectangle();
		System.out.println("------------------------");
		OverloadingConsDemo obj3 = new OverloadingConsDemo(67.5f, 175, 1000);
		System.out.println("radius : " + obj3.radius);
		System.out.println("length : " + obj3.length);
		System.out.println("width : " + obj3.width);
		obj3.areaofCircle();
		obj3.areaofrectangle();
		System.out.println("------------------------");
		OverloadingConsDemo obj4 = new OverloadingConsDemo();
		System.out.println("radius : " + obj4.radius);
		System.out.println("length : " + obj4.length);
		System.out.println("width : " + obj4.width);
		obj4.areaofCircle();
		obj4.areaofrectangle();
		System.out.println("------------------------");
		OverloadingConsDemo obj5 = new OverloadingConsDemo(50, 100);
		System.out.println("radius : " + obj5.radius);
		System.out.println("length : " + obj5.length);
		System.out.println("width : " + obj5.width);
		obj5.areaofCircle();
		obj5.areaofrectangle();
		System.out.println("------------------------");
		OverloadingConsDemo obj6 = new OverloadingConsDemo(10.75f);
		System.out.println("radius : " + obj6.radius);
		System.out.println("length : " + obj6.length);
		System.out.println("width : " + obj6.width);
		obj6.areaofCircle();
		obj6.areaofrectangle();
	}

}
