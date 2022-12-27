package Inheritance;

public class OfflineTraining extends Training {
	private String location;
	private String venue;
	public OfflineTraining() {
		System.out.println("Inside OfflineTraining : no-arg");
	}
	public OfflineTraining(String trainingID, String moduleName, int participantCount, String location, String venue) {
		super(trainingID, moduleName, participantCount);//fetch constructor from parent class having fields similar to the mentioned
		System.out.println("Inside offlineTraining parameter Constructor ");
		this.location = location;
		this.venue = venue;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	
}
