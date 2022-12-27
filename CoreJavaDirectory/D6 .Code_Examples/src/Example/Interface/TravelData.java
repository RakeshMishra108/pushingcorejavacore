package Example.Interface;

public class TravelData {
	private String travelCompany;
	private String details;
	private int days;
	private CurrencyConvertor convertor;
	//constructors
	public TravelData() {
		//By default DollarToRupee convertor will be used
		travelCompany = "Venna World";
		details = "Coming back from New York to Mumbai";
		days = 10;
		convertor = new DollarToRupeeConvertor();
	}
	public TravelData(String travelCompany, String details, int days, CurrencyConvertor convertor) {
		super();
		this.travelCompany = travelCompany;
		this.details = details;
		this.days = days;
		this.convertor = convertor;
	}
	
	//getters and setters
	public String getTravelCompany() {
		return travelCompany;
	}
	public void setTravelCompany(String travelCompany) {
		this.travelCompany = travelCompany;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public CurrencyConvertor getConvertor() {
		return convertor;
	}
	public void setConvertor(CurrencyConvertor convertor) {
		this.convertor = convertor;
	}
	
	//methods
	public float makeCurrencyConversion(float amount) {
		float convertedAmount = convertor.doConvert(amount);
		return convertedAmount;
	}

}
