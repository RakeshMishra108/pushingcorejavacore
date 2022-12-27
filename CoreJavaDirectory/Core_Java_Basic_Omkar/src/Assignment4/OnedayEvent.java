package Assignment4;

public class OnedayEvent extends Event {
	private int hours;;
	private int ratePerHour;
	private int extraHours;
	
	
	//Constructors
	public OnedayEvent() {
		// TODO Auto-generated constructor stub
	}

	public OnedayEvent(int hours, int ratePerHour, int extraHours) {
		super();
		this.hours = hours;
		this.ratePerHour = ratePerHour;
		this.extraHours = extraHours;
	}

	public OnedayEvent(int eventId, String eventName, float basefare) {
		super(eventId, eventName, basefare);
		// TODO Auto-generated constructor stub
	}

	public OnedayEvent(int eventId, String eventName, float basefare, int hours, int ratePerHour, int extraHours) {
		super(eventId, eventName, basefare);
		this.hours = hours;
		this.ratePerHour = ratePerHour;
		this.extraHours = extraHours;
	}
	
	//Callback method
	@Override
	public String toString() {
		return "OnedayEvent [hours=" + hours + ", ratePerHour=" + ratePerHour + ", extraHours=" + extraHours + "]";
	}

	//Getters and setters
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(int ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public int getExtraHours() {
		return extraHours;
	}

	public void setExtraHours(int extraHours) {
		this.extraHours = extraHours;
	}
	
	@Override
	public float getTotalFare() {
		float fare = (hours * ratePerHour) + (extraHours * 500) + super.getTotalFare();
		return fare;
	}

}
