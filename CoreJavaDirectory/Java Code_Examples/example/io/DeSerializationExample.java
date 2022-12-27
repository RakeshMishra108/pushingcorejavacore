package example.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationExample {

	public static void main(String[] args) {
		String filePath = "./src/resources/book.txt";
		try(FileInputStream fin = new FileInputStream(filePath);
				ObjectInputStream in = new ObjectInputStream(fin)){
			//De-serializing the Book object
			Object deserializedObject = in.readObject();
			System.out.println(deserializedObject);
			
			//deserializedObject.getTitle(); //Gives error
			Book myBook = (Book)deserializedObject;
			String title = myBook.getTitle();
			int price = myBook.getPrice();
			System.out.println("Title is " + title + " and price is Rs. " + price);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
