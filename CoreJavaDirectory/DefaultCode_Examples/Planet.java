
public class Planet {
	private String name;//String is not a data type, it is a built-in Class in Java
	private int moons;
	
	public void printValues() {
		System.out.println("...Printing values...");
		System.out.println(name);
		System.out.println(moons);
	}
	public void assignValues(String planetName, int planetMoons) {
		name = planetName;
		moons = planetMoons;
	}
			//return-type method-name([parameters])
	public String getValues() {
		String details = "Name: " + name + ", Moons: " + moons;
		return details;
	}
}



