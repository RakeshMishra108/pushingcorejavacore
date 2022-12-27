package Assignment4;

public class Event {
	private int eventId;
	private String eventName;
	private float baseFare;
	//Constructors
	public Event() {
		this.eventId = 0;
		this.eventName = "Noname";
		this.baseFare = 10000;
	}
	public Event(int eventId, String eventName, float baseFare) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.baseFare = baseFare;
	}

	//Callback method
	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", baseFare=" + baseFare + "]";
	}
	
	
	//getters and setters
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

	public float getbaseFare() {
		return baseFare;
	}

	public void setbaseFare(float baseFare) {
		this.baseFare = baseFare;
	}

	
	//method
	public float getTotalFare() {
		return baseFare;
	}
}
