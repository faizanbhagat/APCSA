import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String x = "";
		double y = 0;
		int z = 0;
	
		Crayon faizan = new Crayon (x,y,z);
		
		System.out.print("Enter color: ");
		x = scan.nextLine();
		faizan.setColor(x);
		System.out.println ("The color you selected is " + faizan.getColor());
		
		System.out.print("Enter length: ");
		y = scan.nextDouble();
		faizan.setLength(y);
		System.out.println ("The length you selected is " + faizan.getLength());
		
		System.out.print("Enter wax type: ");
		z = scan.nextInt();
		faizan.setWaxType(z);
		System.out.println ("The wax type you selected is " + faizan.getWaxType());

		System.out.println (faizan.toString());
	}

}
