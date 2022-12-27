package example.collections;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {
		Properties winProps = new Properties();
		String filePath = "./src/resources/window.properties";
		try(FileInputStream fin = new FileInputStream(filePath)){
			//Loading the properties from file referred by 'fin' into 'winProps'
			winProps.load(fin);
			//Fetching the property names
			 Enumeration propNames = winProps.propertyNames();
			 while(propNames.hasMoreElements()) {
				 Object obj = propNames.nextElement();
				 String propName = (String)obj;
				 String propValue = winProps.getProperty(propName);
				 System.out.println("Property Name: " + propName + ", Property Value: " + propValue);
			 }
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
