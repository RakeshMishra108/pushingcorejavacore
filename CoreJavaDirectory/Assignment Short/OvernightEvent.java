package Ass4;
// this comment is for gitrepository only comment
public class OvernightEvent extends Assignment4 {
	private int days;
	private int rateperday;
	private int roomcount;
	private int fareperroom;

	public OvernightEvent(int eventId, String eventname, float basefare ,int days,int rateperday,int roomcount,int fareperroom) {
		
		super(eventId, eventname, basefare);
		this.days=days;
		this.rateperday=rateperday;
		this.roomcount=roomcount;
		this.fareperroom=fareperroom;
		
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getRateperday() {
		return rateperday;
	}

	public void setRateperday(int rateperday) {
		this.rateperday = rateperday;
	}

	public int getRoomcount() {
		return roomcount;
	}

	public void setRoomcount(int roomcount) {
		this.roomcount = roomcount;
	}

	public int getFareperroom() {
		return fareperroom;
	}

	public void setFareperroom(int fareperroom) {
		this.fareperroom = fareperroom;
	}
	
	@Override
	public float gettotalfare() {
		
		float dayrate=days*rateperday;
		float nightrate=(days-1)*fareperroom;
		float totalroom=roomcount*nightrate;
		float total=dayrate+totalroom+(getBasefare());
		return total;
		
	}

	
}
