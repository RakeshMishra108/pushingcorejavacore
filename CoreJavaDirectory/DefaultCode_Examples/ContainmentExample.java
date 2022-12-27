
public class ContainmentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car simpleCar = new Car(); //This car does not have Music System because it is null
		
		Engine premiumEngine = new Engine("2600 CC", "Diesel");
		MusicSystem premiumMusicSystem = new MusicSystem("Sony", "Dolby with Woofers");
		Car premiumCar = 
				new Car("Toyota", "Innova ZL", 2600000, premiumEngine, premiumMusicSystem);
		
		System.out.println("Make of Simple Car: " + simpleCar.getMake());
		//simpleCar.getPower(); //Gives error because getPower() is undefined in Car
		
		//To retrieve power of an engine, first retrieve engine and then get the power
		
		//This can be done using 2 ways:
		
		//1. Explicit Reference Technique:
		//Get the Engine associated with simpleCar
		Engine simpleEngine = simpleCar.getEngineDetails();
		//Get the power associated with simpleEngine
		String simplePower = simpleEngine.getPower();
		
		System.out.println("Power of simple engine from simple car is " + simplePower);
		
		//2. Object graph navigation
		simplePower = simpleCar.getEngineDetails().getPower();
		System.out.println("Power of simple engine from simple car is " + simplePower);
		
		//Displaying sound effect of the music system available in Premium Car
		
		//1. Explicit Reference Technique
		MusicSystem premiumSystem = premiumCar.getMusicSystemDetails();
		String premiumSound = premiumSystem.getSoundEffect();
		System.out.println("Sound quality in premium car is " + premiumSound);
		
		//2. Object graph navigation
		premiumSound = premiumCar.getMusicSystemDetails().getSoundEffect();
		System.out.println("Sound quality in premium car is " + premiumSound);
		
		//Trying to print sound effect of music system available in simple car
		
		/*String simpleSound = simpleCar.getMusicSystemDetails().getSoundEffect();
		System.out.println("Sound quality in simple car is " + simpleSound);*/
		//The code in the above comment fires an exception. To avoid this use Explicit Reference Technique
		MusicSystem simpleSystem = simpleCar.getMusicSystemDetails();
		System.out.println("Simple System ===> " + simpleSystem);
		if(simpleSystem != null) {
			String simpleSound = simpleSystem.getSoundEffect();
			System.out.println("Sound quality in simple car is " + simpleSound);
		}

	}

}
