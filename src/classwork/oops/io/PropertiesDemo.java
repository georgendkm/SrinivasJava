package classwork.oops.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties myprop = new Properties();
		FileInputStream in = new FileInputStream("D:\\SeleniumTraining\\9PMBatch\\JavaBasics\\Global.properties");
		myprop.load(in);
		System.out.println(myprop.getProperty("URL"));
		System.out.println(myprop.getProperty("browser"));
		System.out.println(myprop.getProperty("username"));
		System.out.println(myprop.getProperty("userpwd"));
		System.out.println(myprop.getProperty("user"));
	}

}
