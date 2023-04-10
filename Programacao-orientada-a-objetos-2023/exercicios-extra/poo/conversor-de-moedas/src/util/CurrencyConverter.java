package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double dollarToReal(double amount, double dollar) {
		return amount * dollar * (1.0 + IOF);
		
	}
}
