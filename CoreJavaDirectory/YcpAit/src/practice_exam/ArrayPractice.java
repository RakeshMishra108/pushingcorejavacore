package practice_exam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		System.out.println("Enter the elements : ");
		int a[][]=new int[2][2];
		Scanner r=new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
		         a[i][j]=r.nextInt();
			}
		}
		System.out.println("Output Is :\n ");
//		Arrays.sort(a);
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
		        System.out.print(a[i][j]+" ");
			}
			System.out.println( );
		}

	}

}
