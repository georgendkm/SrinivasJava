package exercises.oops;

public class TriangleChildAbstract extends ShapesPerimeterAbstract {
	int side1;
	int side2;
	int side3;
	
	TriangleChildAbstract(int s1, int s2, int s3){
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	@Override
	public void perimeter() {
		int res = side1 + side2 + side3;
		System.out.println("Perimeter of Triangle: " + res);
	}
	
	public static void main(String[] args) {
		
		TriangleChildAbstract tObj = new TriangleChildAbstract(15, 25, 25);
		tObj.perimeter();
		
		TriangleChildAbstract tObj2 = new TriangleChildAbstract(55, 67, 90);
		tObj2.perimeter();
	}


}
