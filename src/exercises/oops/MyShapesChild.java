package exercises.oops;

public class MyShapesChild extends MyShapesBase{

	
	public void perimeterOfTriangle(int s1, int s2, int s3 ) {
		int res = s1 + s2 + s3;
		System.out.println("Perimeter of Triangle : "+ res);
		
	}
	
	public void perimeterOfCircle(float r) {
		float res = (float) (2 * Math.PI * r);
		System.out.println("Perimeter of Circle : "+ res);
		
	}
	
	public static void main(String[] args) {
		MyShapesChild myObj = new MyShapesChild();
		myObj.perimeterOfRectangle(9, 12);
		myObj.perimeterOfSquare(14);
		myObj.perimeterOfTriangle(12, 13, 14);
		myObj.perimeterOfCircle(9.67f);

	}

}
