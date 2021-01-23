package classwork.oops.inheritance;

public class ShapeChild extends ShapeBase{

	int length = 10;
	int width = 20;
	
	public void areaR() {
		System.out.println("area of Rectangle : " + (length * width));
	}
	
	public static void main(String[] args) {
		
		ShapeChild obj = new ShapeChild();
		System.out.println(obj.radius);
		obj.areaR();
		obj.area();
	}

}
