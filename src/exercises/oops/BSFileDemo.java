package exercises.oops;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BSFileDemo {
		public static void main(String[] args) throws IOException  {
			createNewFileFromInput();
	    }
	    
	    public static void createNewFileFromInput()  throws IOException{
	        FileOutputStream out = null;
	        System.out.println(System.getProperty("user.dir"));
	        Scanner scanner = new Scanner(System.in);
	      try {
	    	  String  ipString = "";
	    	   out = new FileOutputStream("MyByteExerciseFile.txt");
	    	   System.out.println("Enter File content - type 'end' to finish");
	    	   while(!ipString.equalsIgnoreCase("End")) {
	    		   //ipString = scanner.next();
	    		   ipString = scanner.nextLine();
	    		   out.write(ipString.getBytes());
	    		   out.write("\n".getBytes());
	    	   }
	        } finally {
	            if (out != null) {
	                out.close();
	            }
	        }
	        System.out.println("File Created");
	    }

	}

