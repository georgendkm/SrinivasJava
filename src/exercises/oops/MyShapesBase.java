package exercises.oops;

public class MyShapesBase {
	
	
	protected void perimeterOfRectangle(int l, int w) {
		int res = 2 * (l + w);
		System.out.println("Perimeter of Rectangle : "+ res);
		
	}
	
	protected void perimeterOfSquare(int s) {
		int res = 4 * s;
		System.out.println("Perimeter of Square : "+ res);
		
	}
	
}
