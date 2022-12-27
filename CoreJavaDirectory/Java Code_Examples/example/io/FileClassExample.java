package example.io;

import java.io.File;

public class FileClassExample {

	public static void main(String[] args) {
		String filePath = "./src/resources/technologies.txt";
		String anotherFilePath = "./src/resources";
		//Creating a File object based upon the path
		File currentFile = new File(filePath);
		File anotherFile = new File(anotherFilePath);
		boolean available = currentFile.exists();
		if(available)
			System.out.println("The file: " + filePath + " is available.")	;
		else
			System.out.println("The file: " + filePath + " is not available.");
		
		boolean isFile = currentFile.isFile();
		if(isFile)
			System.out.println("It is a file");
		
		 isFile = anotherFile.isFile();//anotherFile refers to a path which is Directory and not a file
			if(isFile)
				System.out.println("It is another file");
		

	}

}
