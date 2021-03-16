package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double dollarToReal(double dollarPrice, double amount) {
		return dollarPrice * amount * (1.0 + IOF);
	}
}
