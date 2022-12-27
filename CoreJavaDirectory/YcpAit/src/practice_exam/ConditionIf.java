package practice_exam;

import java.util.Scanner;

public class ConditionIf {

	public static void main(String[] args) {
//		int pwd,usr;                           //When we need to initialize variable?
		String usr,pwd;
		System.out.println("Enter User name and Passwprd : ");
        Scanner sc=new Scanner(System.in);
        
        usr=sc.nextLine();
        pwd=sc.nextLine();
        
//		String pappu = null ;
		if(usr.equals("pappu")) {	
//			String pa = null;
			if(pwd.equals("ramukaka")) {
        		System.out.println("Welcome to Home_Page");
        	}
        	else {
        		System.out.println("Invalid Password");
        	}
        }
		else
			System.out.println("Invalid Username");
	}

}
