
public class OnlineTraining extends Training {
	private String trainingSoftware;//Zoom, MS Teams etc
	private String meetingLink;
	public OnlineTraining() {
		System.out.println("Inside OnlineTraining: no-arg");
	}
	public OnlineTraining(String trainingId, String moduleName, int participantCount, String trainingSoftware,
			String meetingLink) {
		super(trainingId, moduleName, participantCount);
		this.trainingSoftware = trainingSoftware;
	
		this.meetingLink = meetingLink;
	}
	public String getTrainingSoftware() {
		return trainingSoftware;
	}
	public void setTrainingSoftware(String trainingSoftware) {
		this.trainingSoftware = trainingSoftware;
	}
	public String getMeetingLink() {
		return meetingLink;
	}
	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}
	

}
