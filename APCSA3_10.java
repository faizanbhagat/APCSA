import java.util.Random;
import java.util.Scanner;

public class APCSA3_10 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int randomNumber = rand.nextInt(100) + 1;
		System.out.print("Enter your guess (-1 to quit): ");
		int guessedNumber = scan.nextInt();
		
		
		while (guessedNumber != randomNumber) {
			if (guessedNumber > randomNumber && guessedNumber > 0) {
				System.out.println("Too high, try a lower number!\n");
			} else if (guessedNumber < randomNumber && guessedNumber > 0) {
				System.out.println("Too low, try a higher number!\n");
			} else if (guessedNumber < 0) {
				System.exit(0);
			}
			System.out.print("Enter another guess (-1 to quit): ");
			guessedNumber = scan.nextInt();
		}
		
		
		System.out.println("You have guessed the number! It was " + randomNumber);
	}

}
