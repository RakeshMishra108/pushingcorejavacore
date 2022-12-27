package example.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import example.collections.Laptop;

public class ReflectionExample {
	
	private static void printClassInfo(Object obj) {
		//This method will print the information of the class of which the object is received
		Class currentClass = obj.getClass();
		//Obtaining the name of the class
		String className = currentClass.getName();
		System.out.println("Class Name : = " + className);
		
		System.out.println("-------------Method Names----------------");
		//Obtaining methods of the class
		 Method[] allMethods  = currentClass.getDeclaredMethods();
		 for(Method method : allMethods) {
			 String methodName = method.getName();
			 System.out.println(methodName);
		 }
		 
		 System.out.println("-----------Field Names-------------");
		  Field[] allFields = currentClass.getDeclaredFields();
		  for(Field field : allFields) {
			  String fieldName = field.getName();
			  System.out.println(fieldName);
		  }
	}

	public static void main(String[] args) {
		printClassInfo(new Laptop());

	}

}
