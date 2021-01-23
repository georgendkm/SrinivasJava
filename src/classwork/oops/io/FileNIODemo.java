package classwork.oops.io;

import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNIODemo {

	public static void main(String[] args) throws Exception {
		
		Path myfile = Paths.get("D:\\SeleniumTraining\\9PMBatch\\JavaBasics\\MyNewNioFile.txt");
		Files.createFile(myfile);
		
		System.out.println("File exists : " + Files.exists(myfile));
		Files.write(myfile, "Hello world".getBytes());
		
		
		System.out.println("get filename : " + myfile.getFileName());
		System.out.println("get parent : " + myfile.getParent());
		System.out.println("get root : " + myfile.getRoot());
		
		Path destFile = Paths.get("D:\\SeleniumTraining\\9PMBatch\\JavaBasics\\CopiedNioFile.txt");
		
		Files.copy(myfile, destFile, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Is directory : " +Files.isDirectory(myfile));
		System.out.println("size : " +Files.size(myfile));
		Files.delete(destFile);
		
		Path destMove = Paths.get("D:\\SeleniumTraining\\9PMBatch\\JavaBasics\\mynewdirectory\\MovedNioFile.txt");
		
		Files.move(myfile, destMove, StandardCopyOption.REPLACE_EXISTING);
		
		
		Path renameObj = Paths.get("D:\\SeleniumTraining\\9PMBatch\\JavaBasics\\mynewdirectory\\RenamedNioFile.txt");
		Files.move(destMove, renameObj, StandardCopyOption.REPLACE_EXISTING);
		
		
		Path mydir = Paths.get("D:\\SeleniumTraining\\9PMBatch\\JavaBasics\\nio");
		Files.createDirectory(mydir);
		System.out.println(" is directory : " + Files.isDirectory(mydir));
		Path mydirs = Paths.get("D:\\SeleniumTraining\\9PMBatch\\JavaBasics\\nio\\folder1\\folder2");
		Files.createDirectories(mydirs);
		
		Path renamedir = Paths.get("D:\\SeleniumTraining\\9PMBatch\\JavaBasics\\\nio\\folder1\\renamedfolder");
		Files.move(mydirs, renamedir, StandardCopyOption.REPLACE_EXISTING);
		
	}

}
