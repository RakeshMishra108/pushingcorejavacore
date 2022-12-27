package assignment_4_rahul_sir;

public class OvernightEvent extends Event {
	
	int days;
	int ratePerDay;
	int roomCount ;
	int farePerRoom;
	
	public OvernightEvent(int eventId, String eventName, float baseFare,int days,int ratePerDay,int roomCount,int farePerRoom) {
	
		this.days=days;
		this.ratePerDay=ratePerDay;
		this.roomCount=roomCount ;
		this.farePerRoom=farePerRoom;
	}

	public OvernightEvent() {
	
	}

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

	@Override
	public float getTotalFare() {
	int rate= days * ratePerDay ;
	int fair= roomCount * farePerRoom;
	int nightRate = 3*fair;
	int nightfair = rate + fair;
	 baseFare=getBaseFare()+ nightfair;
	return baseFare;
	}
	
	
	
	
	
	
}
