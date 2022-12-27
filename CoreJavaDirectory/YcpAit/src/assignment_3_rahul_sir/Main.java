package assignment_3_rahul_sir;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	    Scanner re= new Scanner(System.in);
	    System.out.println("Enter Name of City: ");
	    String name = re.nextLine();  
	    System.out.println("Name Ckecked by user : "+name);
		
//	    if (true) {
//	    City c1=new City();
//        c1.setName("Aagra");
//		c1.setPopulation(53000);
		City c2=new City("Pune",100000);  //City(String name, int population)
		City c3=new City("Hydrabad",10000);  //City(String name, int population)
		City c4=new City("Raigadh",39000);  //City(String name, int population)
//		System.out.println("Cities "+c1.getName());
//		
//		
//		
//	    }
	    
	    City[] cityinfo = new City[4];
		cityinfo[0] = new City("Mumbai", 40000);
		cityinfo[1] = c2;
		cityinfo[2] = c3;
		cityinfo[3] = c4;
		
		
		CityProcessor.checkCity(cityinfo, name);
}
}