package example.io;

import java.io.RandomAccessFile;

public class RandomAccessFileExample {

	public static void main(String[] args) {
		String filePath = "./src/resources/technologies.txt";
		try(RandomAccessFile rf = new RandomAccessFile(filePath, "r")){// 'r' indicates 'read' mode
			//Obtaining the file size
			long size = rf.length();
			//Obtaining the mid position
			long midPosition = size / 2;
			//Placing the file pointer at the mid position
			rf.seek(midPosition);
			//Start reading
			while(true) {
				int data = rf.read();
				if(data == -1)
					break;
				char ch = (char)data;
				System.out.print(ch);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
