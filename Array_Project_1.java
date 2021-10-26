import java.util.Scanner;

public class Array_Project_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int number = 0;
		int[] mainArray = new int[61];
		
		while (number < 61 && number > -1) {
			System.out.println("Enter a number: ");
			number = scan.nextInt();
			if (number < 61 && number > -1) {
				mainArray[number] = mainArray[number] + 1; 
				}
		}
		for(int i = 0; i < mainArray.length; i++) {
			System.out.print("Num of " + i + ": ");
			System.out.println(mainArray[i]);
		}
			
	}
	
}

