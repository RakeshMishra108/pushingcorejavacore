package Example.Interface;

public class CurrencyConvertorMain {

	public static void main(String[] args) {
		CurrencyConvertor convertor;//Interface type reference
		convertor = new DollarToRupeeConvertor();
		float usDollars = 10000;
		float indianRupees = convertor.doConvert(usDollars);
		
		System.out.println("US Dollars : "+usDollars+" = INR. : "+indianRupees);
		convertor = new RupeeToPoundConvertor();
		indianRupees = 5000000;
		
		float gbPounds = convertor.doConvert(indianRupees);
		System.out.println("INR : "+indianRupees+" = GBPounds : "+gbPounds);
	}

}
