package innerClass;

import Example.Interface.CurrencyConvertor;
import Example.Interface.TravelData;

public class AnonymousInnerclassExample {

	public static void main(String[] args) {
		TravelData data = new TravelData();
		data.setTravelCompany("kesari");
		data.setDetails("Moving from mumbai to tokyo");
		
		data.setConvertor(new CurrencyConvertor() {
			
			@Override
			public float doConvert(float amountInRupees) {
				float amountInYen = amountInRupees/1.7f;
				return amountInYen;
			}
		});
		
		System.out.println(" Rupees to Yen : "+data.makeCurrencyConversion(1000000));
	}

}
