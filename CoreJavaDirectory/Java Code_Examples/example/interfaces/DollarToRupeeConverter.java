package example.interfaces;

public class DollarToRupeeConverter implements CurrencyConverter{

	@Override
	public float doConvert(float amountInDollars) {
		help();//this.help();
		// TODO Auto-generated method stub
		float amountInRupees = amountInDollars * DOLLAR_TO_RUPEE;
		return amountInRupees;
	}

}
