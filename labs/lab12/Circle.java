/* Adam Mellan */
/* CSC 220     */
/* Lab 12      */

public class Circle extends Point {
	// Instance variables
	private double radius;

	// Constructor
	public Circle(int newX, int newY, double newRadius) {
		super(newX,  newY);
		this.radius = newRadius;
	}

	// Radius mutator
	public void setRadius(double newRadius) {
		if (newRadius > 0) {
			this.radius = newRadius;
		} else {
			System.out.println("ERROR: Radius MUST be a POSITIVE number");
		}
	}

	// Radius accessor
	public double getRadius() {
		return this.radius;
	}

	public String toString() {
		return "CIRCLE:\n"+"("+this.getX()+", "+this.getY()+")"+"\nRadius: "+this.radius+"\nArea: "+(Math.PI * Math.pow(this.radius, 2));
	}
}