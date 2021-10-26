import java.util.Scanner;
import java.lang.*;

public class APCSA_Mailing_Address {

	public static void main(String[] args) {
		String firstName;
		String lastName;
		String streetAddress;
		String city;
		String state;
		String zipCode;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your first name:");
		firstName = in.nextLine();
		System.out.print("Enter your last name:");
		lastName = in.nextLine();
		System.out.print("Enter your street address:");
		streetAddress = in.nextLine();
		System.out.print("Enter your city:");
		city = in.nextLine();
		System.out.print("Enter your state:");
		state = in.nextLine();
		System.out.print("Enter your Zip Code:");
		zipCode = in.nextLine();
		
		System.out.println("Your Mailing Address is: \n\n" + firstName + " " + lastName + "\n" + streetAddress + "\n" + city + ", " + state + " " + zipCode);

		
	}

}
