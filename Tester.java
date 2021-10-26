import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter name: ");
		String y = scan.nextLine();
		System.out.print("Enter the amount of money initially in the account: ");
		double x = scan.nextDouble();

		
		BankAccount faizan = new BankAccount (x, y);
		System.out.println("The " + y + " account balance is, $" + x);
		
		System.out.print("Enter the amount you would like to deposit: ");
		double depositAmount = scan.nextDouble();
		faizan.deposit(depositAmount);
		System.out.println("The " + y + " account balance is, $" + faizan.balance);
		
		System.out.print("Enter the amount you would like to withdraw: ");
		double withdrawalAmount = scan.nextDouble();
		faizan.withdrawal(withdrawalAmount);
		System.out.println("The " + y + " account balance is, $" + faizan.balance);

	}
}
