package assignment_4_rahul_sir;

public class Event {
	int eventId;
	String eventName;
	float baseFare;
	
	//Non-Parameterised Constructor And Parameterised Constructor
	public Event() {
	}
	
	public Event(int eventId, String eventName, float baseFare) {
		this.eventId = eventId;
		this.eventName = eventName;
		this.baseFare = baseFare;
	}
	
	//Getter & Setter
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public float getBaseFare() {
		return baseFare;
	}
	public void setBaseFare(float baseFare) {
		this.baseFare = baseFare;
	}
	
	//Method Which is going to be override
	public float getTotalFare() {
		return baseFare;
	}
	
}
