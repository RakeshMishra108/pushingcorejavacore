package daily_practice;

import java.io.FileInputStream;

public class FileReadUsingByteArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath="./c/Users";
		File currentFile=new File(filePath);
		
		if(currentFile.exist()) {
			try(FileInputStream fin=new String filePath(currentFile)){
				//Obtaining File Size
				long size = currentFile.length();
				int dimension = (int)size;
				byte data[]=new byte[dimension];
				fin.read(data);
				String fileInfo= new String(data);
				ex.printStackTrace();
				
			}
			
			catch(Exception ex) {
				ex.printStackTrace();
			}
			else
				System.out.println(" file");
		}

	}

}
