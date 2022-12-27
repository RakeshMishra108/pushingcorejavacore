package example.io;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "./src/resources/movies.txt";
		try(FileOutputStream fout = new FileOutputStream(filePath, true)){
			String movieData = "\nTitanic\nEvil Dead";
			//Converting String into byte array because write() method accepts byte array and not String
			byte data[] = movieData.getBytes();//Returns a byte array
			fout.write(data);
			System.out.println("Data is written to the file successfully...");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
