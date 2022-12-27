package example.interfaces;

public interface CurrencyConverter {
	float DOLLAR_TO_RUPEE = 80.45f;
	float POUND_TO_RUPEE = 103.45f;
	float doConvert(float amount);
	
	static void info() {
		System.out.println("This converter is used for handling Forex operations");
	}
	default void help() {
		System.out.println("Use DTR for Dollar to Rupee");
		System.out.println("Use RTP for Rupee to Pound");
	}
}
