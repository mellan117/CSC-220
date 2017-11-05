public class Demo {
	public static void main(String[] args) {
		// Init new Rectangle object "r"
		Rectangle r = new Rectangle(5.0, 10.0);

		// Test getter methods and toString
		System.out.println();
		System.out.println("RECTANGLE");
		System.out.println();
		System.out.println("Width: "+r.getWidth());
		System.out.println("Height: "+r.getHeight());
		System.out.println("Surface Area: "+r.computeSurfaceArea());
		System.out.println();
		System.out.println(r);

		// Test setter methods
		r.setWidth(2.0);
		r.setHeight(4.0);

		// Retest getter methods and toString
		System.out.println();
		System.out.println();
		System.out.println("RECTANGULAR PRISM");
		System.out.println();
		System.out.println("New Width: "+r.getWidth());
		System.out.println("New Height: "+r.getHeight());
		System.out.println("New Surface Area: "+r.computeSurfaceArea());

		// Init new RectPrism object "rp"
		RectPrism rp = new RectPrism(5.0, 10.0, 15.0);

		// Test getter methods and toString
		System.out.println();
		System.out.println("Width: "+rp.getWidth());
		System.out.println("Height: "+rp.getHeight());
		System.out.println("Depth: "+rp.getDepth());
		System.out.println("Surface Area: "+rp.computeSurfaceArea());
		System.out.println("Volume: "+rp.computeVolume());
		System.out.println();
		System.out.println(rp);

		// Test setter methods
		rp.setWidth(2.0);
		rp.setHeight(4.0);
		rp.setDepth(6.0);

		// Retest getter methods and toString
		System.out.println();
		System.out.println("New Width: "+rp.getWidth());
		System.out.println("New Height: "+rp.getHeight());
		System.out.println("New Depth: "+rp.getDepth());
		System.out.println("New Surface Area: "+rp.computeSurfaceArea());
		System.out.println("New Volume: "+rp.computeVolume());
	}
}