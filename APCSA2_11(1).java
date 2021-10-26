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

		System.out.print("Odometer Start:");
		startMiles = scan.nextFloat();
		System.out.print("Odometer End: ");
		endMiles = scan.nextFloat();
		System.out.print("Number of gallons available:");
		gallons = scan.nextFloat();
		totalMiles = endMiles - startMiles;
		milesPerGal = totalMiles / gallons;
		System.out.print("Miles per gallon of gas: " + milesPerGal);
	}

}
