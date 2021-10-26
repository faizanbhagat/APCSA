import java.util.Scanner;

public class APCSA3_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print ("Enter a number: ");
		int number = scan.nextInt();
		int printingNumber = number;
		int sum = 0;
		
		if (number < 2) {System.out.println("Error, the number you entered is less than 2");}
		
		if (number % 2 == 0) {
		while (number >= 2) {
		sum = number + sum;
		number--;
		number--;
		}}
		
		if (number % 2 != 0) {
		number = number -1;
		while (number >= 2) {
		sum = number + sum;
		number--;
		number--;
		}
		System.out.println("The total sum of all the even numbers between 2 and " + printingNumber + " is " + sum);

		}
	}
	}