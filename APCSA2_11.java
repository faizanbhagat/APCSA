import java.util.Scanner;
import java.lang.*;

public class APCSA2_11 {

	public static void main(String[] args) {
		float startMiles;
		float endMiles;
		float totalMiles;
		float gallons;
		float milesPerGal;

		Scanner scan = new Scanner(System.in);

		System.out.print("Start of the odometer reading:");
		startMiles = scan.nextFloat();
		System.out.print("End of the odometer reading: ");
		endMiles = scan.nextFloat();
		System.out.print("Number of gallons available:");
		gallons = scan.nextFloat();
		totalMiles = endMiles - startMiles;
		milesPerGal = totalMiles / gallons;
		System.out.print("Miles per gallon of gas: " + milesPerGal);
	}

}
