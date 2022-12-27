package Ass4;

public class onedayevent extends Assignment4 {
	
  private int hours;
   private int rateperhours;
	private int extrahours;

	public onedayevent(int eventId, String eventname, float basefare,int hours,int rateperhours,int extrahours) {
		super(eventId, eventname, basefare);
		this.hours=hours;
	this.rateperhours=rateperhours;
	this.extrahours=extrahours;
		
		
		
	}
	@Override
	public float gettotalfare() {
		
		float h=hours*rateperhours;
		float Extra=500*extrahours;
		float oneday=Extra+h;
		return oneday;
	}

	

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRateperhours() {
		return rateperhours;
	}

	public void setRateperhours(int rateperhours) {
		this.rateperhours = rateperhours;
	}

	public int getExtrahours() {
		return extrahours;
	}

	public void setExtrahours(int extrahours) {
		this.extrahours = extrahours;
	}
	

}
