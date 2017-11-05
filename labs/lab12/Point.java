/* Adam Mellan */
/* CSC 220     */
/* Lab 12      */

public class Point {
	// Instance variables
	private int x;
	private int y;

	// Constructor
	public Point(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}

	// X coordinate mutator
	public void setX(int newX) {
		this.x = newX;
	}

	// X coordinate accessor
	public int getX() {
		return this.x;
	}

	// Y coordinate mutator
	public void setY(int newY) {
		this.y = newY;
	}

	// Y coordinate accessor
	public int getY() {
		return this.y;
	}

	public String toString() {
		return "POINT:\n"+"("+this.x+", "+this.y+")";
	}
}