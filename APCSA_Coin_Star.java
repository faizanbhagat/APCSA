import java.util.Scanner;
import java.lang.*;

public class APCSA_Coin_Star {

	public static void main(String[] args) {
		int centsAmount;
		int tensAmount;
		int dollarsAmount;
		int quartersAmount;
		int dimesAmount;
		int nickelsAmount;
		int penniesAmount;
		
		final int TENS_CONVERSION = 1000;
		final int DOLLARS_CONVERSION = 100;
		final int QUARTERS_CONVERSION = 25;
		final int DIMES_CONVERSION = 10;
		final int NICKELS_CONVERSION = 5;
		final int PENNIES_CONVERSION = 1;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter an amount of change in cents: ");
		centsAmount = scan.nextInt();		
		tensAmount = centsAmount / TENS_CONVERSION;
		centsAmount = centsAmount % TENS_CONVERSION;
		dollarsAmount = centsAmount / DOLLARS_CONVERSION;
		centsAmount = centsAmount % DOLLARS_CONVERSION;
		quartersAmount = centsAmount / QUARTERS_CONVERSION;
		centsAmount = centsAmount % QUARTERS_CONVERSION;
		dimesAmount = centsAmount / DIMES_CONVERSION;
		centsAmount = centsAmount % DIMES_CONVERSION;
		nickelsAmount = centsAmount / NICKELS_CONVERSION;
		centsAmount = centsAmount % NICKELS_CONVERSION;
		penniesAmount = centsAmount;
		
		System.out.println ("\nYour change will be the following: \n");
		System.out.println ("Tens: " + tensAmount);
		System.out.println ("Dollars: " + dollarsAmount);
		System.out.println ("Quarters: " + quartersAmount);
		System.out.println ("Dimes: " + dimesAmount);
		System.out.println ("Nickels: " + nickelsAmount);
		System.out.println ("Pennies: " + penniesAmount);

		

	}
}
