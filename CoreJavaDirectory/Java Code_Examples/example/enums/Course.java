package example.enums;

public class Course {
	private String title;
	private String provider;
	private Mode trainingMode;
	public Course() {
		title = "Java Programming";
		provider = "Udemy";
		trainingMode = Mode.ONLINE;
	}
	public Course(String title, String provider, Mode trainingMode) {
		this.title = title;
		this.provider = provider;
		this.trainingMode = trainingMode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public Mode getTrainingMode() {
		return trainingMode;
	}
	public void setTrainingMode(Mode trainingMode) {
		this.trainingMode = trainingMode;
	}
	@Override
	public String toString() {
		return "Course [title=" + title + ", provider=" + provider + ", trainingMode=" + trainingMode + "]";
	}

}
