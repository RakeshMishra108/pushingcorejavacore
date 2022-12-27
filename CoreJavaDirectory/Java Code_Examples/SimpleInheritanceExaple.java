
public class SimpleInheritanceExaple {

	public static void main(String[] args) {
		CricketPlayer crPlayer = new CricketPlayer();
		crPlayer.setName("MS Dhoni");
		crPlayer.setAge(40);
		crPlayer.setCountry("India");
		crPlayer.setRuns(14500);
		crPlayer.setBattingAvg(51.34f);
		
		System.out.println(crPlayer.getName() + " has scored " + crPlayer.getRuns() + " runs.");
		
		//Remaining code to get and print the values

	}

}
