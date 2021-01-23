package exercises.oops;

public class SquareChildAbstarct extends ShapesPerimeterAbstract{
	int side;
	
	SquareChildAbstarct(int s){
		side = s;
		
	}

	@Override
	public void perimeter() {
		int res = 4 * side;
		System.out.println("perimter of Square: "+ res);
	}

	
	public static void main(String[] args) {
		SquareChildAbstarct sObj = new SquareChildAbstarct(27);
		sObj.perimeter();
	}








}
