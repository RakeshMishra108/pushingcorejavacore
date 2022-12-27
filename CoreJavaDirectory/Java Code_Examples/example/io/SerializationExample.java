package example.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		String filePath = "./src/resources/book.txt";
		try(FileOutputStream fout = new FileOutputStream(filePath);
				ObjectOutputStream out = new ObjectOutputStream(fout)){
			//Creating a Book object
			Book currentBook = new Book("Let us C", 475);
			//Serializing the Book object
			out.writeObject(currentBook);
			System.out.println("Book object has been serialized...");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
