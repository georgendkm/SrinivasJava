package exercises.oops;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileMergeUsingCharSteams {

	public static void main(String[] args) throws Exception {

	        FileReader inputfile1 = null;
	        FileReader inputfile2 = null;
	        FileWriter outputStream = null;
	        
	        try {
	        	inputfile1 = new FileReader("NewCharFile.txt");
	        	inputfile2 = new FileReader("CopiedCharFile.txt");
	        	
	            outputStream = new FileWriter("FileMerge.txt");
	            
	            int c = inputfile1.read();
	            while(c!=-1) {
	            	outputStream.write(c);
	            	c = inputfile1.read();
	            }
	            outputStream.write("\n");
	            c = inputfile2.read();
	            while(c!=-1) {
	            	outputStream.write(c);
	            	c= inputfile2.read();
	            }

	        } finally {
	        	
	            if (inputfile1 != null) {
	            	inputfile1.close();
	            }
	            if (inputfile2 != null) {
	            	inputfile2.close();
	            }
	            if (outputStream != null) {
	                outputStream.close();
	            }
	        }
	        System.out.println("File merged");
		}

	}