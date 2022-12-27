
public class OfflineTraining extends Training {
	private String location; //City
	private String venue; //Training Room etc
	public OfflineTraining() {
		System.out.println("Inside OfflineTraining:no-arg");
	}
	
	public OfflineTraining(String trainingId, int participantCount, String moduleName, String location, String venue) {
		super(trainingId, participantCount, moduleName);
		//super();
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
