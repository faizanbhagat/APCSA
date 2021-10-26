
public class APCSA2_6 {

	public static void main(String[] args) {
		int minuteValue = 28;
		int hourValue = 1;
		int secondsValue = 42;
		int finalSecondsValue;
		final int MINUTE_CONVERSION = 60;
		final int HOUR_CONVERSION = 3600;
		finalSecondsValue = (minuteValue * MINUTE_CONVERSION) + (hourValue * HOUR_CONVERSION) + secondsValue;
		System.out.println (hourValue + " hours, " + minuteValue + " minutes, " + secondsValue + " seconds is equal to " + finalSecondsValue + " seconds");

	}

}
