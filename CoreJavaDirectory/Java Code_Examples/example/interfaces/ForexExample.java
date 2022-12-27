package example.interfaces;

public class ForexExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConverter converter;
		
		converter = new DollarToRupeeConverter();
		float usDollars = 10000;
		float indianRupees = converter.doConvert(usDollars);
		System.out.println("US Dollars: " + usDollars + " = INR. : " + indianRupees);
		
		converter = new RupeeToPoundConverter();
		indianRupees = 5000000;
		float gbPounds = converter.doConvert(indianRupees);
		System.out.println("INR. : " + indianRupees + " = GB Pounds: " + gbPounds);

	}

}
