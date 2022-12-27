package Ass4;

public class Assignment4 {
	
	int eventId;
	String eventname;
	float basefare;
	
	
	public Assignment4(int eventId, String eventname, float basefare) {
	
		this.eventId = eventId;
		this.eventname = eventname;
		this.basefare = basefare;
	}
	
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public float getBasefare() {
		return basefare;
	}
	public void setBasefare(float basefare) {
		this.basefare = basefare;
	}

	
	public float gettotalfare() {
		return basefare;
		
	}




}
