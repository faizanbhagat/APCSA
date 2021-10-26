
public class Auto {
	double gallons = 0.0;
	double mpg;
	
	public Auto(double x) {
	mpg = x;
	}
	
	public void fillUp (double fillupAmount) {
	gallons = gallons + fillupAmount;
	}
	
	public void takeTrip (double numOfMilesDriven) {
	gallons = gallons - (numOfMilesDriven * (1/mpg));
	}
	
	public void reportFuel (double finalValue) {

	}
	
}
