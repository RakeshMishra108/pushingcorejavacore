package example.io;

import java.io.FileOutputStream;

public class FileOutputSteram_Using_Try_With_Resurses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String filePath="D://ESD/movie.txt";
		 
		 try(FileOutputStream fout= new FileOutputStream(filePath,true)){
			String movieData="Mr. India \n Speed\nPredator\nPk"; 
			byte data[]=movieData.getBytes();
			fout.write(data);
			System.out.println("Print written Data");
		 }
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }

	}

}
