package classwork.oops;

public class ConstructorDemo {
	float radius;
	int length;
	int width;
	
	ConstructorDemo(){  // Default constructor
		System.out.println("Constructor called");
	}
	
	ConstructorDemo(float r, int l, int w){
		radius = r;
		length = l;
		width = w;
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
		
		ConstructorDemo obj = new ConstructorDemo(9.75f, 25, 50);
		System.out.println("radius : " + obj.radius);
		System.out.println("length : " + obj.length);
		System.out.println("width : " + obj.width);	
		obj.areaofCircle();
		obj.areaofrectangle();
		System.out.println("------------------------");
		ConstructorDemo obj2 = new ConstructorDemo(12.5f, 75, 100);
		System.out.println("radius : " + obj2.radius);
		System.out.println("length : " + obj2.length);
		System.out.println("width : " + obj2.width);
		obj2.areaofCircle();
		obj2.areaofrectangle();
		System.out.println("------------------------");
		ConstructorDemo obj3 = new ConstructorDemo(67.5f, 175, 1000);
		System.out.println("radius : " + obj3.radius);
		System.out.println("length : " + obj3.length);
		System.out.println("width : " + obj3.width);
		obj3.areaofCircle();
		obj3.areaofrectangle();
	}

}
