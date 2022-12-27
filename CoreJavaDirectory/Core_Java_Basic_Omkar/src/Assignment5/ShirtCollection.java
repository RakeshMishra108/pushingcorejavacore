package Assignment5;

public class ShirtCollection extends Shirt {
	public static Shirt shirts[];
	
	//Constructors
	public ShirtCollection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getters and setters
	public static Shirt[] getShirts() {
		return shirts;
	}

	public static void setShirts(Shirt[] shirts) {
		ShirtCollection.shirts = shirts;
	}
	
	
	//methods
	public static int getShirtCount(String type) {
		int count = 0;
		for(int i=0;i<shirts.length;i++) {
			System.out.println(shirts[i].getType());
			if(shirts[i].getType().equals(type))
				count ++;
		}
		return count;
	}
	
	public static boolean isSHirtAvailable(Shirt shirt) {
		
		
		return true;
	}


}
