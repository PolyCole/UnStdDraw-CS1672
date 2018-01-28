import edu.princeton.cs.introcs.StdDraw;

/*
 * Author: Cole Polyak
 * Driver.java
 * 23 January 2018
 * 
 * 
 */

public class Driver {

	public static void main(String[] args) {
		
		//Example of how a hexagon would be created around .5, .5
		double[] x = {0.6, 0.55, .45, .4, .45, .55};
		double[] y = {.5, .586603, .586603, .5, .413397, .413397};
		
		StdDraw.setPenColor(UnStdDraw.DARK_SALMON_INJUSTICE);
		//StdDraw.filledPolygon(x, y);
		
		//UnStdDraw.filledRegularNgon(0.5, 0.5, 0.25, 10);
		
		UnStdDraw.spiral(0.5, 0.5, 0.5, 4, 10);
		
		System.out.println("NGon Count: " + UnStdDraw.getNgonCount());
	}

}
