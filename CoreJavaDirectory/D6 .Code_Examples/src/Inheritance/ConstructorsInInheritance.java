package Inheritance;

public class ConstructorsInInheritance {

	public static void main(String[] args) {
		OfflineTraining offline = new OfflineTraining();//first constructor of parent class is invoked the offlinetraining constructor is invoked
		OnlineTraining online = new OnlineTraining();//first constructor of parent class is invoked the onlinetraining constructor is invoked
		
		OfflineTraining offline2 = new OfflineTraining("Tr01","java",115,"Mumbai","YCP");
		OnlineTraining online2 = new OnlineTraining("Tr02","PHP",120,"mumbai","YCP");
	}

}
