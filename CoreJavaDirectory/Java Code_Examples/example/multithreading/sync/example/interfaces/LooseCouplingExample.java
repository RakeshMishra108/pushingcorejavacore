package example.multithreading.sync.example.interfaces;

public class LooseCouplingExample {

	public static void main(String[] args) {
		CurrencyConverter.info();//Invoking static method info()
		System.out.println("Just FYI, see the conversion rates: ");
		System.out.println("US Dollar to INR: " + CurrencyConverter.DOLLAR_TO_RUPEE);
		System.out.println("GBP to INR: " + CurrencyConverter.POUND_TO_RUPEE);
		
		TravelData data1 = new TravelData();
		System.out.println(data1.getTravelCompany());
		System.out.println(data1.getDetails());
		System.out.println(data1.makeCurrencyConversion(1000));
		//Here the default conversion is Dollar to Rupee
		
		//Making some changes into the travel data e.g. details, converter
		data1.setDetails("Now moving from Mumbai to London");
		data1.setConverter(new RupeeToPoundConverter());
		System.out.println(data1.makeCurrencyConversion(100000));

	}

}
