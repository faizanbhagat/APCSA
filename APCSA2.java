public class APCSA2 {

	public static void main(String[] args) {
		final int BASE = 32;
		final double CONVERSION = 5.0/9.0;
		
		double farenheitTemp = 32;
		double celsiusTemp;
		
		celsiusTemp = (farenheitTemp - BASE) * CONVERSION;
		System.out.println ("Farenheit Temperature : " + farenheitTemp);
		System.out.println ("Equivalent Celsius Temperature : " + celsiusTemp);

	}
}