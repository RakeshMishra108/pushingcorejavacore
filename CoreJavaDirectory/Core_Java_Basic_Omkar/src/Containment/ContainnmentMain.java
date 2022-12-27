package Containment;

public class ContainnmentMain {

	public static void main(String[] args) {
		Car simpleCar = new Car();//Car constructor initiated //This car does not have music system
		Engine premiumEngine = new Engine("2600 CC","Diesel");//Engine Constructor for new Engine
		MusicSystem premiumMusicSystem = new MusicSystem("Sony","Dolby with Woofers");//MusicSystem Constructor for new Music system
		Car premiumCar = new Car("Toyota","Innova ZL",2600000,premiumEngine,premiumMusicSystem);//Car constructor to create new Car having new Enginne and new Music System
		
		System.out.println("Make of Simple Car : "+simpleCar.getMake());
		//simpleCar.getPower(); - > //Gives error because getPower() is method of Engine class and not Car class
		//To retrieve power of Engine, first retrieve Engine and the get the power
		//Composite containment
		//First Way
		//Explicit reference Technique : //Get the Engine associated with simpleCar
		Engine simpleEngine = simpleCar.getEngineDetails();
		//Get the power associated with simpleEngine
		String simplePower = simpleEngine.getPower();
		System.out.println("Power of simple engine from simple car is : "+simplePower);
		
		//Second way
		//Object graph navigation : 
		simplePower = simpleCar.getEngineDetails().getPower();//no. of object increases performance decreases//may or may not work in aggregation type containment (weak)
		System.out.println("Power of simple engine from simple car is : "+simplePower);
		
		//Aggregate Containment
		//Displaying SoundEffect of the music system available inn Premium Car
		//First method
		MusicSystem premiumSystem = premiumCar.getMusicSystemDetails();
		String premiumsoundEffect = premiumSystem.getSoundEffect();
		System.out.println("Sounfd Effect of Premium Car is : "+premiumsoundEffect);
		
		//Second method
		premiumsoundEffect = premiumCar.getMusicSystemDetails().getSoundEffect();
		System.out.println("Sounfd Effect of Premium Car is : "+premiumsoundEffect);
		
		//Second method for soundEffect of simple car aggregate containment (Weak)
		//String simplesoundEffect = simpleCar.getMusicSystemDetails().getSoundEffect();
		//System.out.println("Sounfd Effect of Simple Car is : "+simplesoundEffect);//Gives Error null pointer exception
		
		//First method for soundEffect of simple car having no MusicSystem
		MusicSystem simpleSystem = simpleCar.getMusicSystemDetails();
		System.out.println("SimpleSystem ==> "+simpleSystem);
		if(simpleSystem != null) {
			String simplesoundEffect = simpleSystem.getSoundEffect();
			System.out.println("Sounfd Effect of Simple Car is : "+simplesoundEffect);
		}		


	}

}
