package assignment_4_rahul_sir;

public class OnedayEvent extends Event {
	
	
	int hours;
	int ratePerHour;
	int extraHours;


	public OnedayEvent(int eventId, String eventName, float baseFare,int hours,int ratePerHour,int extraHours) {
		
		this.hours=hours;
		this.ratePerHour=ratePerHour;
		this.extraHours=extraHours;
		
	}

	public OnedayEvent() {
	
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(int ratePerHour) {s
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
		int amountPerHr=ratePerHour*hours;
		int extraAmountPerhour=500;
		 extraAmountPerhour=(int) ((extraAmountPerhour*extraHours)+amountPerHr+(getBaseFare()));
		return extraAmountPerhour;
	}
		
// Override a method float getTotalFare() in all 3 classes
	
}
