package fIleIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {

	public static void main(String[] args) throws IOException {
		try {
			FileReader f=new FileReader("F:\\Cdac\\U Tube Videos For Techinicals (Simple language)\\JAVA\\First.txt");
		    
			try {
				int i;
				while((i=f.read())!= -1) {
					System.out.print((char)i);
//				 
				}
			}
			finally {
				f.close();
				System.out.println("File closed....");
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("Exception Handeled....");
			e.printStackTrace();
		}
		

	}

}
