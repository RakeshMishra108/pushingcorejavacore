package practice_exam;

import java.util.Scanner;

public class LoopClass_ForLoop {

	public static void main(String[] args) {
		int num ;
		System.out.println("Enter any Number : ");
		
		Scanner r=new Scanner(System.in);
		num=r.nextInt();
		
		while(num>0){
		for(int i=1;i<=10;i++) {
			System.out.println(num*i);
		}
		System.out.println("Program Run Sucessfully");
		break;
		}

	}

}
