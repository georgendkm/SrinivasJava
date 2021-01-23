package classwork.oops;

import classwork.oops.inheritance.HomePageBase;

public class Dog {
	
	
	int legs=4; // State 
	int tail=1;
	String color;
	
	static int b = 7;
	
	public void bark() {  //Behavior
		System.out.println("bow..bow...bow..");
		System.out.println(legs);
		System.out.println(tail);
		System.out.println(color);
	}
	
	public void sleep() {  //Behavior
		System.out.println("zzz......zzzzz.......");
	}
	
	
	public static void main(String[] args) {
		
		Dog jimmy = new Dog();
		jimmy.legs = 5;
		jimmy.tail = 0;
		jimmy.color = "White";
		System.out.println(jimmy.legs);
		System.out.println(jimmy.tail);
		System.out.println(jimmy.color);
		jimmy.bark();
		jimmy.sleep();
		
		System.out.println("-----------------------");
		System.out.println(b);
		Dog rummy = new Dog();
		rummy.color= "black";
		System.out.println(rummy.legs);
		System.out.println(rummy.tail);
		System.out.println(rummy.color);
		rummy.bark();
		rummy.sleep();
		
	}

}
