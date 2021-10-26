import java.util.Scanner;

public class APCSA3_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter string: ");
		String userString = scan.nextLine();
		
		int length = userString.length();
		int numberTimesDone = 0;
		
		while(numberTimesDone < length) {
		System.out.println(userString.charAt(numberTimesDone));
		numberTimesDone++;
		}
		
		
	}

}
