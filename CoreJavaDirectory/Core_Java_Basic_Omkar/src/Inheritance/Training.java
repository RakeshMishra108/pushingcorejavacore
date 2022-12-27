package Inheritance;

public class Training {
	private String trainingID;
	private String moduleName;
	private int participantCount;
	public Training() {
		System.out.println("InsideTraining : no-arg");
	}
	public Training(String trainingID, String moduleName, int participantCount) {
		System.out.println("Inside Training(String,String,int)");
		this.trainingID = trainingID;
		this.moduleName = moduleName;
		this.participantCount = participantCount;
	}
	public Training(String trainingID, int participantCount, String moduleName) {
		System.out.println("Inside Training(String,int,String)");
		this.trainingID = trainingID;
		this.participantCount = participantCount;
		this.moduleName = moduleName;
	}
	public String getTrainingID() {
		return trainingID;
	}
	public void setTrainingID(String trainingID) {
		this.trainingID = trainingID;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getParticipantCount() {
		return participantCount;
	}
	public void setParticipantCount(int participantCount) {
		this.participantCount = participantCount;
	}
}
