package Example.Interface;

public interface CurrencyConvertor {
	float DOLLAR_TO_RUPEE = 80.45f;
	float POUND_TO_RUPEE = 103.45f;
	float doConvert(float amount);
	
	static void info() {//to make method definition valid in interface static is used,can also use default modifier 
		System.out.println("This convertor is used for handling Forex operations");
	}
	default void helpp() {
		System.out.println("Use DTR for Dollar to rupee");
		System.out.println("Use for rupee to dollar");
	}
}
