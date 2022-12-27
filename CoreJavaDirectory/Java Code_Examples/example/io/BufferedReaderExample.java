package example.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderExample {

	public static void main(String[] args) {
		String filePath = "./src/resources/persons.txt";
		try(FileReader fr = new FileReader(filePath);
				BufferedReader br = new BufferedReader(fr)){
			//Reading the contents line by line
			while(true) {
				String line = br.readLine();
				//Check for EOF
				if(line == null)
					break;
				//Dividing the 'line' into 2 parts: name and profession
				 String values[] = line.split("=");
				 String personName = values[0];
				 String profession = values[1];
				 System.out.println("Name is " + personName + " is a " + profession);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
