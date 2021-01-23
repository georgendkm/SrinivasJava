package classwork.oops;

//import classwork.HelloWorld;
//import classwork.AcMDemo;
import classwork.*;// import all classes and interfaces of the package

import static java.lang.Math.PI;

public class PackageDemo {

	public static void main(String[] args) {
		
		HelloWorld obj = new HelloWorld();
		obj.printHelloWorld();
		
		AcMDemo obj3 = new AcMDemo();
		
		classwork.HelloWorld obj2 = new classwork.HelloWorld(); //Fully qualified
		obj2.printHello();
		
		double a = PI * 3.15;
		
	}

}
