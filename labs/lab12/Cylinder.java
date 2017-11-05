/* Adam Mellan */
/* CSC 220     */
/* Lab 12      */

public class Cylinder extends Circle {
	// Instance variables
	private double height;

	// Constructor
	public Cylinder(int newX, int newY, double newRadius, double newHeight) {
		super(newX, newY, newRadius);
		this.height = newHeight;
	}

	// Height mutator
	public void setHeight(double newHeight) {
		this.height = newHeight;
	}

	// Height accessor
	public double getHeight() {
		return this.height;
	}

	public String toString() {
		return "CYLINDER\n"+"("+this.getX()+", "+this.getY()+")"+"\nRadius: "+this.getRadius()+"\nHeight: "+this.height+"\nVolume: "+(Math.PI * Math.pow(this.getRadius(), 2) * this.height);
	}
}