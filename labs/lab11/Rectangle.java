/* Adam Mellan */
/* CSC 220     */
/* Lab 11      */

public class Rectangle {
	// Instance variables
	protected double width;
	protected double height;
	
	// Constructor
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}

	// Width mutator
	public void setWidth(double w) {
		this.width = w;
	}

	// Width accessor
	public double getWidth() {
		return this.width;
	}

	// Height mutator
	public void setHeight(double h) {
		this.height = h;
	}

	// Height accessor
	public double getHeight() {
		return this.height;
	}

	// Compute the surface area
	public double computeSurfaceArea() {
		return (this.width * this.height);
	}

	// Rectangle's toString method
	public String toString() {
		return ("To String:"+"\nWidth: "+this.width+" \nHeight: "+this.height+" \nSurface Area: "+this.computeSurfaceArea());
	}
}