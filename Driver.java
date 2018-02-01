import edu.princeton.cs.introcs.StdDraw;

/*
 * Author: Cole Polyak
 * Driver.java
 * 23 January 2018
 * 
 * Driver.java
 * 
 * This class exercises the UnStdDraw.java class.
 */

public class Driver {

	public static void main(String[] args) {
		
		// Canvas initialization
		StdDraw.setCanvasSize(1500, 1500);
		StdDraw.setXscale(0, 200);
		StdDraw.setYscale(0, 200);
		
		// First Ngon
		StdDraw.setPenColor(UnStdDraw.DENIM_BLUE);
		UnStdDraw.filledRegularNgon(35, 35, 30, 7);

		// Spiral
		StdDraw.setPenColor(UnStdDraw.DARK_SALMON_INJUSTICE);
		StdDraw.setPenRadius(0.05);
		UnStdDraw.spiral(90, 90, 50, 5, 5);
		
		// Second Ngon
		StdDraw.setPenColor(UnStdDraw.DEHYDRATION);
		UnStdDraw.filledRegularNgon(150, 150, 32, 15);
		
		// Third Ngon
		StdDraw.setPenColor(UnStdDraw.AGED_MOUSTACHE_GREY);
		UnStdDraw.filledRegularNgon(50, 150, 12, 5);
		
		// Outputting static counter metholds.
		System.out.println("NGon Count: " + UnStdDraw.getNgonCount());
		System.out.println("Spiral Count: " + UnStdDraw.getSpiralCount());
	}

}
