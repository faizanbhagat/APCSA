
public class APCSA2_7 {

	public static void main(String[] args) {
		int secondsValue = 10000;
		int secondsValue1 = secondsValue;
		int secondsRemainder;
		final int HOUR_CONVERSION = 3600;
		final int MINUTE_CONVERSION = 60;
		int hourValue;
		int minuteValue;
		int finalSecondsValue;
		hourValue = secondsValue / HOUR_CONVERSION;
		secondsRemainder = secondsValue1 % HOUR_CONVERSION;
		minuteValue = secondsRemainder / MINUTE_CONVERSION;
		finalSecondsValue = minuteValue % MINUTE_CONVERSION;
		System.out.println (secondsValue + " seconds is equal to " + hourValue + " hours, " + minuteValue + " minutes, and " + finalSecondsValue + " seconds.");
}
}