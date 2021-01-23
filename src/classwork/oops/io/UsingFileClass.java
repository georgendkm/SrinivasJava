package classwork.oops.io;

import java.io.File;
import java.io.IOException;

public class UsingFileClass {

	public static void main(String[] args) throws Exception {
		
		File myFile= null;
		
		myFile = new File("NewFile.txt");
		System.out.println("Create new file :" + myFile.createNewFile());
		System.out.println("is file :  " + myFile.isFile());
		System.out.println("is directory :  " + myFile.isDirectory());
		System.out.println("exists :  " + myFile.exists());
		System.out.println("is absolute :  " + myFile.isAbsolute());
		System.out.println("get absolute path :  " + myFile.getAbsolutePath());
		System.out.println("get name :  " + myFile.getName());
		System.out.println("get parent :  " + myFile.getParent());
		System.out.println("get path :  " + myFile.getPath());
		System.out.println("length :  " + myFile.length());
		System.out.println("can read :  " + myFile.canRead());
		System.out.println("can write :  " + myFile.canWrite());
		//System.out.println("set readonly :  " + myFile.setReadOnly());
		System.out.println("can write after setting read only :  " + myFile.canWrite());
		System.out.println("Rename to : " +  myFile.renameTo(new File("RenmaedNewFile.txt")));
		File newFile = new File("RenmaedNewFile.txt");
		System.out.println("File delete : " + newFile.delete());
		System.out.println("File exists after delete : " + newFile.exists());
		
		System.out.println("-------------------------");
		File dir1 = new File("mynewdirectory");
		System.out.println("make directory :" +  dir1.mkdir());
		System.out.println("is file :  " + dir1.isFile());
		System.out.println("is directory :  " + dir1.isDirectory());
		System.out.println("exists :  " + dir1.exists());
		System.out.println("is absolute :  " + dir1.isAbsolute());
		System.out.println("get absolute path :  " + dir1.getAbsolutePath());
		System.out.println("get name :  " + dir1.getName());
		System.out.println("get parent :  " + dir1.getParent());
		System.out.println("get path :  " + dir1.getPath());
		File[] files = dir1.listFiles();
		for(File temp : files) {
			System.out.println(temp.getName());
		}
		
		String[] filenames = dir1.list();
		for(String temp : filenames) {
			System.out.println(temp);
		}
		
		System.out.println("rename :  " + dir1.renameTo(new File("renamedDirectory")));
		
		File multiDir = new File("folder1\\folder2\\foldeer3");
		System.out.println("make directories :" +  multiDir.mkdirs());
	}

}
