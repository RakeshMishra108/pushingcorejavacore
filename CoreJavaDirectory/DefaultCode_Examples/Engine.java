
public class Engine {
	private String power;
	private String type;
	public Engine() {
		// TODO Auto-generated constructor stub
		power = "1200 CC";
		type = "Petrol";
	}
	public Engine(String power, String type) {
		this.power = power;
		this.type = type;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
