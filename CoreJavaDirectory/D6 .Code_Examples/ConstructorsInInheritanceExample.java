
public class ConstructorsInInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OfflineTraining offline = new OfflineTraining();
		//OnlineTraining online = new OnlineTraining();
		
		OfflineTraining offline2 = new OfflineTraining("Tr01", 115, "Java", "Mumbai", "YCP");
		System.out.println(offline2.getVenue());
		System.out.println(offline2.getTrainingId());

	}

}
