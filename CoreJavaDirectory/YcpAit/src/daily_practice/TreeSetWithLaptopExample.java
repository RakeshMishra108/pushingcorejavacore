package daily_practice;

public class TreeSetWithLaptopExample {

	public static void main(String[] args) {
		
		Laptop laptop1=new Laptop();
		Laptop laptop2=new Laptop("S23","Lenevo",43000);
		Laptop laptop3=new Laptop("S22","Dell",50000);
		
		ShortedSet<Laptop>allLaptop=new TreeSet<Laptop>();
		
		allLaptop.add(lapop1);
		allLaptop.add(lapop2);
		allLaptop.add(lapop3);
		
		for(Laptop brand:allLaptops) {
			System.out.println(brand);
		}
		

	}

}
