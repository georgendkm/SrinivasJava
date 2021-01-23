package classwork.oops;

public class ShapeMethodsDemo {
	
	float radius = 9.5f;
	int side = 10;

	
	public void areaOfcircle() { // Method without return and parameters
		double area = Math.PI * radius * radius;
		System.out.println("area of circle : " + area);
	}
	
	public int areaofSquare() { // Method with return value and no parameters
		int area = side * side;
		return area;
	}
	
	public void areaofRectangle(int length, int width) { //Method without return value and with parameters
		
		int area = length * width;
		System.out.println("area of rectangle : " + area);
		
	}
	
	public double circlePerimeter(float r) { // Method with return value and parameters
		double p = 2 * Math.PI * r;
		return p;	
	}
	
	
	

	public static void main(String[] args) {
		ShapeMethodsDemo obj = new ShapeMethodsDemo();
		System.out.println("radius : " + obj.radius);
		System.out.println("side : " + obj.side);
		obj.areaOfcircle();
		int sa = obj.areaofSquare();
		System.out.println("Area of square : " + sa);
		obj.areaofRectangle(89, 90);
		int a = 30;
		int b = 25;
		obj.areaofRectangle(a,b);
		obj.areaofRectangle(34,56);
		double cp = obj.circlePerimeter(obj.radius);
		System.out.println("perimter of square : " + cp);
		cp = obj.circlePerimeter(11.75f);
		System.out.println("perimter of square : " + cp);
	}

}
