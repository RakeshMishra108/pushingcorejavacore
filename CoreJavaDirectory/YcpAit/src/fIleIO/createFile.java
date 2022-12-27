package fIleIO;

import java.io.File;
import java.io.IOException;

public class createFile {

	public static void main(String[] args) {
		
		File f=new File("F:\\Cdac\\U Tube Videos For Techinicals (Simple language)\\JAVA\\First.txt");
		try {
			if(f.createNewFile()) {
			  System.out.println("File is Created.......");
			}
			else {
				System.out.println("File is already Created .....");
			}
		} catch (IOException e) {
			System.out.println("Exception Handeled .....");
			e.printStackTrace();
		}
	}

}
