package Assignment5;
import java.util.Scanner;
public class ShirtMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the no. shirts : ");
		size = sc.nextInt();
		Shirt sh[] = new Shirt[size];
		for(int i=0;i<size;i++) {
			sh[i] = new Shirt();
		}
		for(int i=0;i<size;i++) {
			sh[i].setBrandName();
			sh[i].setColor();
			sh[i].setType();
		}
		ShirtCollection.setShirts(sh);
		
		System.out.println("What type of shirt do you want : ");
		String typ = sc.next();
		if(ShirtCollection.getShirtCount(typ) == 0)
			System.out.println(typ+" of shirts are not available");
		else
			System.out.println("We have "+ShirtCollection.getShirtCount(typ)+" "+typ+" of Shirts");
		
		System.out.println("");
		
	}

}
