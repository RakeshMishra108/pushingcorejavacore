package example.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioSimpleExample {//Add one more method that reads the cartoons data from file
	//Use FileChannel and ByteBuffer
	private static void fileWriteExample() throws IOException {
		String filePath = "./src/resources/entertainment/cartoons.txt";
		Path fileLocation = Paths.get(filePath);
		
		String cartoonsData = "Micky and Donald\nTom and Jerry\nDoraemon";
		//Obtain byte array from String
		byte[] cartoonsInfo = cartoonsData.getBytes();
		//Write the data into file
		Files.write(fileLocation, cartoonsInfo);
		System.out.println("Data written to file");
	}
	private static void fileExample() throws IOException {
		String filePath = "./src/resources/entertainment/cartoons.txt";
		Path fileLocation = Paths.get(filePath);
		boolean available = Files.exists(fileLocation);
		//System.out.println(available);
		if(available)
			System.out.println("File exists");
		else {
			Path createdPath = Files.createFile(fileLocation);
			System.out.println("File created at: " + createdPath);
		}
			
	}
	private static void directoryExample() throws IOException {
		String filePath = "./src/resources/entertainment";
		Path dirPath = Paths.get(filePath);
		boolean available = Files.exists(dirPath);
		//System.out.println(available);
		if(available)
			System.out.println("Directory exists.");
		else {
			//Create that directory
			Path createdPath = Files.createDirectory(dirPath);
			System.out.println("Directory created at: " + createdPath);
		}
	}

	public static void main(String[] args) {
			try {
				//directoryExample();
				//fileExample();
				fileWriteExample();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
