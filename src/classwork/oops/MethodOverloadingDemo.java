package classwork.oops;

public class MethodOverloadingDemo {
	
	int side = 25;

	public void area(float radius) {
		double a = Math.PI * radius * radius;
		System.out.println("Area of circle (float) : " + a);
	}
	public void area(int radius) {
		double a = Math.PI * radius * radius;
		System.out.println("Area of circle (int) : " + a);
	}
	
	public void area() {
		int a = side * side;
		System.out.println("Area of sqaure : " + a);
	}
	
	public int area(int l, int w) {
		int  a = l * w;
		return a;
		
	}
	
	public float area(float side1, float side2, float side3) {
		float a = (side1 + side2 + side3) / 2;
		return a;
	}
	
	public void login(String username, String pwd) {
		
	}
	
	public void login(String username, String pwd, String secCode) {
		
	}

	public static void main(String[] args) {
		
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.area();
		obj.area(9);
		obj.area(9.67f);
		int area = obj.area(9, 10);
		System.out.println("Area of rectangle : " + area);
		float a = obj.area(9.5f, 10f, 12.5f);
		System.out.println("Area of triangle : " + a);
		
	}

}
