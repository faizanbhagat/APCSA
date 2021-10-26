import java.util.Scanner;


public class APCSA3_2 {

public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter the year: ");
		int year = scan.nextInt();
		
		if (year < 1582) {
			System.out.println ("This year is before the Gregorian calendar was adopted! Try a year less that 1582.");	
		}
		
		
		if (year % 4 == 0) {
		if (year % 100 == 0 && year % 400 ==0) {
			System.out.println(year + " is a leap year!");
		}
		else if (year % 100 != 0) {
			System.out.println(year + " is a leap year!");
		}
		else {System.out.println(year + " is not a leap year!");}

		}
		else {System.out.println(year + " is not a leap year!");}

		
}
}