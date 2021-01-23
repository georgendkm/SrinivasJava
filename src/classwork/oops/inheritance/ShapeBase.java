package classwork.oops.inheritance;

public class ShapeBase {
	
	float radius = 5.78f;
	
	public void area() {
		double a = Math.PI * radius * radius;
		System.out.println("area of circle : " + a);
	}
	
	

	public static void main(String[] args) {
		
		ShapeBase obj = new ShapeBase();
		obj.area();
	}

}
