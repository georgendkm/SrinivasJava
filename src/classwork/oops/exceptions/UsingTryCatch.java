package classwork.oops.exceptions;

import classwork.oops.OverloadingConsDemo;

public class UsingTryCatch {

	public static void main(String[] args) {


		int a = 20;
		int b = 2;
		try {
			System.out.println(a/b);
		} catch(ArithmeticException e) {
			//e.printStackTrace();
		}
		
		int[] arr = { 34, 78, 96, 55 };
		try {
			System.out.println(arr[3]);
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
		}
		System.out.println("after exception handling");
		
		
		try {
			System.out.println(a/b);
			System.out.println("after div zero");
			System.out.println(arr[5]);
		}catch(ArithmeticException e) {
			System.out.println("caught arithmetc exe");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught AIOB");
		}

		try {
			System.out.println(a/b);
			System.out.println("after div zero");
			System.out.println(arr[5]);
		}catch(RuntimeException e) {
			System.out.println("caught runtime exe");
		}
		
		try {
			System.out.println(a/b);
			System.out.println("after div zero");
			System.out.println(arr[5]);
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println("caught exception exe");
		}
		
		OverloadingConsDemo obj = null;
		obj.areaofCircle();
		
	}
	
	
	public void meymethod() {
		try {
	
			//code lines
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
