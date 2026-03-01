package util07;

public class CurrencyConverter {
		public static final double IOF = 0.06;

		public static double dollarToReal(double arrount, double dollarPrice) {
			return arrount * dollarPrice * (1.0 + IOF);
		}

	}

