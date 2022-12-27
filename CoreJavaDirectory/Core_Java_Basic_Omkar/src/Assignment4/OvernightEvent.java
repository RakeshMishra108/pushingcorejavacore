package Assignment4;

public class OvernightEvent extends Event {
	private int days;
	private int ratePerDay;
	private int roomCount;
	private int farePerRoom;
	
	//Constructors
	public OvernightEvent() {
		// TODO Auto-generated constructor stub
	}

	public OvernightEvent(int days, int ratePerDay, int roomCount, int farePerRoom) {
		super();
		this.days = days;
		this.ratePerDay = ratePerDay;
		this.roomCount = roomCount;
		this.farePerRoom = farePerRoom;
	}

	public OvernightEvent(int eventId, String eventName, float basefare, int days, int ratePerDay, int roomCount,
			int farePerRoom) {
		super(eventId, eventName, basefare);
		this.days = days;
		this.ratePerDay = ratePerDay;
		this.roomCount = roomCount;
		this.farePerRoom = farePerRoom;
	}

	public OvernightEvent(int eventId, String eventName, float basefare) {
		super(eventId, eventName, basefare);
		// TODO Auto-generated constructor stub
	}

	//Callback method
	@Override
	public String toString() {
		return "OvernightEvent [days=" + days + ", ratePerDay=" + ratePerDay + ", roomCount=" + roomCount
				+ ", farePerRoom=" + farePerRoom + "]";
	}

	//getters and setters
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getRatePerDay() {
		return ratePerDay;
	}

	public void setRatePerDay(int ratePerDay) {
		this.ratePerDay = ratePerDay;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public int getFarePerRoom() {
		return farePerRoom;
	}

	public void setFarePerRoom(int farePerRoom) {
		this.farePerRoom = farePerRoom;
	}
	
	
	//method
	@Override
	public float getTotalFare() {
		if(days == 1) {
			float fare = (days * ratePerDay)+((days) * roomCount * farePerRoom) + super.getTotalFare();
			return fare;
		}
		else {
			float fare = (days * ratePerDay)+((days-1) * roomCount * farePerRoom) + super.getTotalFare();
			return fare;
		}
		
	}
	

}
