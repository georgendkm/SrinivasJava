package classwork.oops.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CharStreamFileDemo {

	public static void main(String[] args) throws Exception {
	
		createCharFile();
		copyCharFile();
	}
	
	public static void createCharFile() throws Exception{
		FileWriter out = new FileWriter("NewCharFile.txt");
		try {
			String s1 = "This is my char file\n";
			String s2 = " this my second line \n End of file";
			out.write(s1);
			out.write(s2);
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			out.close();
		}
		System.out.println("File created");
	}
	
	public static void copyCharFile() throws Exception{
		FileReader in = new FileReader("NewCharFile.txt");
		FileWriter out = new FileWriter("CopiedCharFile.txt");
		try {
			int b = in.read();
			while(b!=-1) { // returns -1 when reach end of file
				out.write(b);
				b= in.read();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			out.close();
		}
		System.out.println("File copied");
	}

}
