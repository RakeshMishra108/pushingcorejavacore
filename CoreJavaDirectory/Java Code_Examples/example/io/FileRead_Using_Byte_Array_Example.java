package example.io;

import java.io.File;
import java.io.FileInputStream;

public class FileRead_Using_Byte_Array_Example {

	public static void main(String[] args) {
		String filePath = "./src/resources/technologies.txt";
		File currentFile = new File(filePath);
		if(currentFile.exists()) {
			try(FileInputStream fin = new FileInputStream(currentFile)){
				//Obtaining file size
				long size = currentFile.length();
				//Declaring a byte array with dimention according to the size
				int dimension = (int)size;
				byte data[] = new byte[dimension];
				//Transferring the contents of the file into this byte array
				fin.read(data);
				
				//Converting the byte array into String
				String fileInfo = new String(data);
				System.out.println(fileInfo);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		else
			System.out.println("File does not exist.");

	}

}
