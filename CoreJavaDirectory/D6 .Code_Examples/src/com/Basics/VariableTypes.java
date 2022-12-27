package com.Basics;

public class VariableTypes {
	int x;//Instance Variable
	static int y;//Class Variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z=10;//Local Variable//needs to be initialized //default values is not created for local variable
		//printing variables
		
		System.out.println("x : "+new VariableTypes().x);//creating object for instance variable
		System.out.println("y : "+y);//direct use of class variable due to same class
		
		System.out.println("z : "+z);//
		
	}

}
