package Inheritance;
//IS A relationship
//Super-->Present-->Base
//Types : simple, multilevel,hierarchical
public class InheritanceMain {

	public static void main(String[] args) {
		CricketPlayer crPlayer = new CricketPlayer();
		crPlayer.setName("MS Dhoni");
		crPlayer.setAge(40);
		crPlayer.setCountry("India");
		crPlayer.setRuns(14500);
		crPlayer.setBattingAvg(51.34f);
		
		System.out.println(crPlayer.getName()+" "+crPlayer.getAge()+" "+crPlayer.getCountry()+" "+crPlayer.getRuns()+" "+crPlayer.getBattingAvg());
	}

}
