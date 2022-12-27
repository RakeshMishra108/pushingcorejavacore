
public class Training {
	private String trainingId;
	private String moduleName;
	private int participantCount;
	public Training() {
		System.out.println("Inside Training: no-arg");
	}
	public Training(String trainingId, String moduleName, int participantCount) {
		System.out.println("Inside Training (String, String, int)");
		this.trainingId = trainingId;
		this.moduleName = moduleName;
		this.participantCount = participantCount;
	}
	
	public Training(String trainingId, int participantCount, String moduleName) {
		System.out.println("Inside Training (String, int, String)");
		this.trainingId = trainingId;
		this.participantCount = participantCount;
		this.moduleName = moduleName;
	}
	public String getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
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
