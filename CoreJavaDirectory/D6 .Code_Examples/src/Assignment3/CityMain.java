package Assignment3;
import java.util.Scanner;
public class CityMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the number of cities : ");
		size = sc.nextInt();
		City[] city = new City[size];
		for(int i=0;i<size;i++) {
			city[i] = new City();
		}
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Name of City : ");
			String name = sc.next();
			city[i].setName(name);
			System.out.println("Enter the population of City : ");
			int population = sc.nextInt();
			city[i].setPopulation(population);
		}
		sc.close();
//		city[0] = new City("Mumbai",12442373);
//		city[1] = new City("Delhi",11007835);
//		city[2] = new City("Kolkata",4486679);
//		city[3] = new City("Lucknow",2815601);
//		city[4] = new City("Thiruvananthapuram",752490);
		System.out.println("Cities --> Populations");
		for(City c:city) {
			System.out.println(c.getName()+" --> "+c.getPopulation());
		}
		System.out.println("Avg Population of cities is : "+CityProcessor.getAvgpopulation(city));
		System.out.println("Cities with population greater than 40 Lakhs are : ");
		String Bigcitynames[] = new String[city.length];
		Bigcitynames = CityProcessor.getBigCityNames(city);
		for(String Bignames:Bigcitynames) {
			if(Bignames != null) {
				System.out.println(Bignames);
			}
			
		}
	}

}
