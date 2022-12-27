package example.inner_classes;

import example.interfaces.CurrencyConverter;
import example.interfaces.TravelData;

public class AnonymousInnerClassExample {

	public static void main(String[] args) {
		TravelData data = new TravelData();
		data.setTravelCompany("Kesari");
		data.setDetails("Moving from Mumbai to Tokyo");
		data.setConverter(new CurrencyConverter() {
			
			@Override
			public float doConvert(float amount) {
				// TODO Auto-generated method stub
				return amount * 1.7f;
			}
		});
		System.out.println(data.makeCurrencyConversion(100000));
		
	}

}
