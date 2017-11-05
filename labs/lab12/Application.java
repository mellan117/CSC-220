/* Adam Mellan */
/* CSC 220     */
/* Lab 12      */

import java.util.*;

public class Application {
	public static void main(String[] args) {
		// Init variables
		Scanner scan = new Scanner(System.in);
		ArrayList<Point> shapes = new ArrayList<Point>();

		for (int i=1; i<=3; i++) {
			int x, y;
			double radius, height;

			System.out.println();
			System.out.print("Enter X Coordinate: ");
			x = scan.nextInt();

			System.out.print("Enter Y Coordinate: ");
			y = scan.nextInt();

			System.out.print("Enter Radius in degrees: ");
			radius = scan.nextDouble();

			System.out.print("Enter Height: ");
			height = scan.nextDouble();

			Point pt = new Point(x,y);
			shapes.add(pt);

			Point cir = new Circle(x,y,radius);
			shapes.add(cir);

			Point cyl = new Cylinder(x,y,radius,height);
			shapes.add(cyl);
		}
		System.out.println();

		for (Point x : shapes) {
			System.out.println(x);
			System.out.println();
		}
	}
}