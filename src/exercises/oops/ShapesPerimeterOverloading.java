package exercises.oops;

public class ShapesPerimeterOverloading {
	
	public int perimeter(int side) { //Sqaure
		return 4 * side;
	}
	
	public int perimeter(int length, int width) { //Rectangle
		return 2 * (length + width);
	}
	
	public int perimeter(int side1, int side2, int  side3) { //Triangle
		return side1 + side2 + side3;
	}
	
	public float perimeter(float radius) { //Circle
		return  (float) (2 * Math.PI * radius);
	}
	
	public static void main(String[] args) {
	
		ShapesPerimeterOverloading sObj = new ShapesPerimeterOverloading();
		int res = sObj.perimeter(15);
		System.out.println(" Sqaure Perimeter : "+ res);
		System.out.println(" Rectangle Perimeter: "+ sObj.perimeter(15, 25));
		System.out.println(" Triangle Perimeter: "+ sObj.perimeter(15, 25, 35));
		System.out.println(" Circle Perimeter: "+ sObj.perimeter(35.0f));
	}
}
