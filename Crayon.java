public class Crayon {
	private static String color;
	private double length; 
	private int waxType;
	
	public Crayon () {}
	
	public Crayon(String x, double y, int z) {
		color = x;
		length = y;
		waxType = z;
	}
	
	public Crayon (String x, double y) {
		color = x;
		length = y;
	}
	
	public void setColor (String colorPick) {
		color = colorPick;
	}
	
	public String getColor () {
	return color;
	}
	
	public void setLength (double length) {
		this.length = length;
	}
	
	public double getLength() {
	return length;
	}
	
	public void setWaxType(int waxNum) {
	waxType = waxNum;
	}
	
	public int getWaxType() {
	return waxType;
	}
	
	public String toString () {
	return "The color picked is " + color + ", the length is " + length + ", and the wax number is " + waxType;
	}
}

