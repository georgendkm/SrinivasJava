package classwork;

public class VariableTypes {
	
	int legs = 6; // Instance variable, (objects)
	int tail ; 
	
	static String barksound = "Bow..bow"; // static or class variables

	public  static void main(String[] args) { // parameter or argument (Local variable)
		
		String name = "John"; //  local variable
		
		VariableTypes obj = new VariableTypes();
		obj.legs = 4;
		obj.tail = 2;
		
		VariableTypes obj2 = new VariableTypes();
		obj2.legs = 6;
		obj2.tail = 1;
		
		System.out.println(args);
		System.out.println(barksound);
	}
	
	public void bark() {
		String name = "John";
		System.out.println(VariableTypes.barksound);
		barksound = "blab blab";
		System.out.println(legs);
		System.out.println(tail);
	}
	
	

}
