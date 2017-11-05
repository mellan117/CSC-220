/* Adam Mellan */
/* CSC 220     */
/* Lab 11      */

public class RectPrism extends Rectangle {
	// Instance variables
	private double depth;

	// Constructor
	public RectPrism(double w, double h, double d) {
		super(w, h);
		this.depth = d;
	}

	// Depth mutator
	public void setDepth(double d) {
		this.depth = d;
	}

	// Depth accessor
	public double getDepth() {
		return this.depth;
	}

	// Compute the surface area
	public double computeSurfaceArea() {
		return (2 * ((this.depth * this.width) + (this.depth * this.height) + (this.width * this.height)));
	}

	// Compute volume
	public double computeVolume() {
		return (this.width * this.height * this.depth);
	}

	// RectPrism's toString method
	public String toString() {
		return (""+super.toString()+" \nDepth: "+this.depth+"\nVolume: "+this.computeVolume());
	}
}