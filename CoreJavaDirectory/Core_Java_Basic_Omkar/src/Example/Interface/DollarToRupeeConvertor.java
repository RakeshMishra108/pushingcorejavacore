package Example.Interface;

public class DollarToRupeeConvertor implements CurrencyConvertor {

	@Override
	public float doConvert(float amountInDollars) {
		float amountInRupees = amountInDollars * DOLLAR_TO_RUPEE;
		return amountInRupees;
	}

}
