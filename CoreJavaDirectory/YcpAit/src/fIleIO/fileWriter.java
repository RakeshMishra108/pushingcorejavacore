 package fIleIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

	public static void main(String[] args) {
		try {
//			File f1=new File("F:\\Cdac\\U Tube Videos For Techinicals (Simple language)\\JAVA\\First.txt");
			FileWriter f1=new FileWriter("F:\\Cdac\\U Tube Videos For Techinicals (Simple language)\\JAVA\\First.txt");
	
		    try {
			     f1.write("Step1:Create File , S2: use write(); , S3 : use close() in finally block ");
//			     f1.write("Checking is the Data Overwritten or Mention Next to previous message");
			     System.out.println("Data were mentioned in file");
		        }
		    finally {
		    	f1.close();
		    	System.out.println("File Colsed ");
		    }
		}
		catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Exception Handeled ");
		}	

	}

}
