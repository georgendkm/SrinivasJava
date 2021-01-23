package classwork.oops.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputsStreamFileCreation {

	public static void main(String[] args) throws Exception {
		
		//createFile();
		copyFile();
	}
	
	
	public static void createFile() throws Exception {
		FileOutputStream out= new FileOutputStream("NewByteFile.txt");
		try {
			String str = "This is my byte stream file\n";
			out.write(str.getBytes());
			String str2 = "This is my second line";
			out.write(str2.getBytes());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
		System.out.println("File created");
	}
	
	public static void copyFile() throws Exception {
		FileInputStream in = new FileInputStream("NewByteFile.txt");
		FileOutputStream out= new FileOutputStream("CopiedByteFile.txt");
		try {
			int b = in.read();
			while(b!=-1){ // -1 returns when reach end of file
				out.write(b);
				b = in.read();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			in.close();
			out.close();
		}
		System.out.println("File copied");
		
	}

}
