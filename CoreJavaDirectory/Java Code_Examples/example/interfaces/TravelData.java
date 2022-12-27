package example.interfaces;

public class TravelData {
	private String travelCompany;
	private String details;
	private int days;
	private CurrencyConverter converter;
	public TravelData() {
		// By default DollarToRupee converter will be used
		travelCompany = "Veena World";
		details = "Coming back from New York to Mumbai";
		days = 10;
		converter = new DollarToRupeeConverter();
	}
	public TravelData(String travelCompany, String details, int days, CurrencyConverter converter) {
		this.travelCompany = travelCompany;
		this.details = details;
		this.days = days;
		this.converter = converter;
	}
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
	public CurrencyConverter getConverter() {
		return converter;
	}
	public void setConverter(CurrencyConverter converter) {
		this.converter = converter;
	}
	public float makeCurrencyConversion(float amount) {
		float convertedAmount = converter.doConvert(amount);
		return convertedAmount;
	}

}
