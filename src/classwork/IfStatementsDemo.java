package classwork;

public class IfStatementsDemo {

	public static void main(String[] args) {
		
		int a = 5;
		
		if(a%2==0) { // simple if 
			System.out.println(" Even number");
		}
		
		// if-else
		if(a%2==0) {
			System.out.println(" Even number");
		} else {
			System.out.println(" odd number");
		}
		
		// if - else if ladder
		if(a==1) {
			System.out.println("one");
		}else if(a==2) {
			System.out.println("two");
		}else if(a==3) {
			System.out.println("three");
		}else if(a==4) {
			System.out.println("four");
		}else if(a==5) {
			System.out.println("five");
		} else {
			System.out.println("invalid");
		}
		
		// nested if
		
		if ((a%2 == 0) || (a!=0)) {
			System.out.println("Even number");
		} else {
			if((a==0)  && ( a > 1)){
				System.out.println("it is zero");
			} else {
				System.out.println("odd number");
			}
		}
		
	}

}
