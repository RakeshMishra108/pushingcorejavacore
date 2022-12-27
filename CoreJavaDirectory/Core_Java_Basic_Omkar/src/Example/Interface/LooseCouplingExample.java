package Example.Interface;

public class LooseCouplingExample {
	public static void main(String[] args) {
		CurrencyConvertor.info();//invoking concrete method from interface
		System.out.println("Just FYI,see the converstion rate : ");
		System.out.println("US dollar to INR : "+CurrencyConvertor.DOLLAR_TO_RUPEE);
		TravelData data1 = new TravelData();
		System.out.println(data1.getTravelCompany());
		System.out.println(data1.getDetails());
		System.out.println(data1.makeCurrencyConversion(1000));
		//here the default conversion is Dollar to Rupee
		
		
		//making some changes into the travel data  e.g.details,convertor
		data1.setDetails("Now moving from Mumbai to London");
		data1.setConvertor(new RupeeToPoundConvertor());
		System.out.println(data1.makeCurrencyConversion(100000));
	}

}
