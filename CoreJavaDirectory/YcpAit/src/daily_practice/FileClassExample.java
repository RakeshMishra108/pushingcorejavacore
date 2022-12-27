package daily_practice;

import java.io.File;

public class FileClassExample {

	public static void main(String[] args) {
		String filePath="./c/Users";
		
		File currentFile=new File(filePath);
		boolean available=currentFile.exists();
		
		if(available)
			System.out.println( "The file : "+filePath+" available");
		else
			System.out.println("The file"+ filePath+" not available");
		
		boolean isFile=currentFile.isFile();
		
		if(isFile)
			System.out.println("It is aa File");
		
	    File anotherFile= new File(filePath);
	    isFile=anotherFile.isFile();
		if(isFile)
		System.out.println("It is another file");
			
		
	}

}
