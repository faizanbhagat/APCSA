

public class APCSA2_8 {

	public static void main(String[] args) {
		double x1 = 10;
		double y1 = 5;
		double x2 = 8;
		double y2 = 7;
		double distance;
		double xDifference = x2-x1;
		double yDifference = y2-y1;
		double xDifferenceSquared = Math.pow(xDifference,2);
		double yDifferenceSquared = Math.pow(yDifference, 2);
		double sumDifferences = xDifferenceSquared + yDifferenceSquared;
		distance = Math.sqrt(sumDifferences);		
		System.out.println ("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance);
	}

}
