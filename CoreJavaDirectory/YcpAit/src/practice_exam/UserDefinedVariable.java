package practice_exam;

import java.util.Scanner;

public class UserDefinedVariable {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the values : ");
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		 
        System.out.println("Sum of given Number : "+c);
	}

}
