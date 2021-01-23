package exercises;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		
		int[][] myarray = { { 11, 12, 13, 14, 15},
							{ 21, 22, 23, 24, 25}, 
							{ 31, 32, 33, 34, 35},
							{ 41, 42, 43, 44, 45}
						  };
		
		int sum = 0;
		
		for(int i=0; i < myarray.length; i++) {
			int rsum = 0;
			for(int j=0; j < myarray[i].length; j++) {
				rsum = rsum + myarray[i][j];
				//sum = sum + myarray[i][j];
				System.out.print(myarray[i][j] +"\t");
			}
			
			System.out.print("--> " + rsum);
			System.out.println();
			sum = sum + rsum;
		}
		System.out.println("Sum : " + sum);

	}

}
