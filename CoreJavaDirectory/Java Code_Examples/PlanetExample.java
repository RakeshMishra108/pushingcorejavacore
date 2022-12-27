
public class PlanetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating the object
		Planet firstPlanet = new Planet();
		Planet secondPlanet = new Planet();
		firstPlanet.assignValues("Uranus", 5);
		secondPlanet.assignValues("Jupiter", 16);
		
		System.out.println("First Details: " + firstPlanet.getValues());
		
		String secondDetails = secondPlanet.getValues();
		System.out.println("Second Details: " + secondDetails);
		
		secondPlanet.printValues();
		//Assigning the values
		/*firstPlanet.name = "Earth";//Strings are to be surrounded in " "
		firstPlanet.moons = 1;
		
		secondPlanet.name = "Mars";
		secondPlanet.moons = 2;
		
		//Fetching and Printing values
		System.out.println("Name of first planet: " + firstPlanet.name);
		System.out.println("Moons of first planet: " + firstPlanet.moons);
		*/
		//Remaining code to print second planet values

	}

}
