package Assignment6;
public class BisleriBottleMain {

	public static void main(String[] args) {
		BisleriPack[] bb = new BisleriPack[3];
		bb[0] = new BisleriPack(20,new SmallBottle());
		bb[1] = new BisleriPack(10,new MediumBottle());
		bb[2] = new BisleriPack(20,new LargeBottle());
		System.out.println("Pack 1 --> ");
		
	}

}
