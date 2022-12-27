package exceptionHandeling;

import java.io.*;

public class ThirdException {
//	File f=new File("./F:/Cdac/NotePad/lc.txt");

			try {
				if(f.createNewFile()) {
					System.out.println("File is careated");
				}
				else {
					System.out.println("File already exist");
				}
			}
	catch( Exception e){
		System.out.println("File check kr nahi to dusra program bana");
	}
}}
