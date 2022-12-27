package practice_exam;

public class PracticeString {

	public static void main(String[] args) {
		String str="Ankit";
		String str1="Ankit";
		String str2=new String("Ankit");
		String str3=str.concat(" Kumar");
		
		if(str==str1) {
			System.out.println(" == Comparision is ok ,memory save at single place");	
		}
		else {
			System.out.println("memory is on different place");
		}
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Equals methos compare content");
		}
		else {
			System.out.println("Equals method not compare content");
		}
		System.out.println("After using duplicate : "+str3);
		
		if(str1==str2) {
			System.out.println("Memory location is same ");
		}
		else {
			System.out.println("memory location is different ");
		}
		
	}

}
