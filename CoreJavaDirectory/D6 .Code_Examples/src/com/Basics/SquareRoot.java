package com.Basics;
import java.util.Scanner;  
public class SquareRoot {
	public static double sqroot(int num)   
	{  

	double temp;  
	double sqrt=num/2;  
	do   
	{  
	temp=sqrt;  
	sqrt=(temp+(num/temp))/2;  
	}   
	while((temp-sqrt)!= 0);  
	return sqrt;  
	}  
	public static void main(String[] args)    {   
			System.out.print("Enter the Under root number: ");  
			Scanner sc = new Scanner(System.in);  
			int n = sc.nextInt();  
			System.out.println("The square root of "+ n+ " is: "+sqroot(n));
			sc.close();
	}  
}  