package practice_exam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_OneD {

	public static void main(String[] args) {
		Array_OneD r=new Array_OneD();
		r.Array_Secondmethod();
		int A[]= {10,24,64,23,54};
		for(int b:A) {
			System.out.println("values entered : "+b);
		}
	}

	 void Array_Secondmethod() {
		int a[]=new int[5];
		System.out.println("Entet Values for Array : ");
		Scanner s=new Scanner(System.in);		
		
		for(int i=0;i<5;i++) {
			a[i]=s.nextInt();
		}
		
		Arrays.sort(a);
	    for(int c:a) {
		System.out.println(c);
	    }
	
	 }

}
