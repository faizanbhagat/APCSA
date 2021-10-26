import java.util.Scanner;
import java.util.Random;

public class APSCA3_14 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	System.out.print ("Choose 1 for rock, 2 for paper, 3 for scissors, 0 to quit: ");
	int userSelection = scan.nextInt();
	int computerSelection = rand.nextInt(3) + 1;
	int tieCount = 0;
	int lossCount = 0;
	int winCount = 0;
	
	while (userSelection != 0) {
	if (userSelection == computerSelection) {
		tieCount++;
		System.out.println("You have tied!\n");
	}
	else if (userSelection == 1 && computerSelection ==2) {
		lossCount++;
		System.out.println ("The computer's paper beats your rock!\n");
	}
	else if (userSelection == 2 && computerSelection == 1) {
		winCount++;
		System.out.println ("Your paper beats the computer's rock!\n");
	}
	else if (userSelection == 1 && computerSelection == 3) {
		winCount++;
		System.out.println ("Your rock beats the computer's scissors\n");
	}
	else if (userSelection == 2 && computerSelection == 3) {
		lossCount++;
		System.out.println ("The computer's scissors beats your paper!\n");
	}
	else if (userSelection == 3 && computerSelection == 1) {
		lossCount++;
		System.out.println("The computer's rock beats your scissors\n");
	}
	else if (userSelection == 3 && computerSelection == 2) {
		System.out.println("Your scissors beat the computer's paper\n");
	}
	System.out.print ("Choose 1 for rock, 2 for paper, 3 for scissors, 0 to quit: ");
	userSelection = scan.nextInt();
	}
	
	System.out.println ("You finished with " + winCount + " wins, " + tieCount + " ties, and " + lossCount + " losses!");
	System.exit(0);
	}

}
