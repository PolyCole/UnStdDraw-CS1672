import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

/*
 * Author: Cole Polyak
 * UnStdDraw.java
 * 23 January 2018
 * 
 * UnStdDraw.java
 * 
 * This class creates two additional methods for StdDraw as well as four new colors.
 */



public class UnStdDraw {

	// Custom Colors
	public static Color DENIM_BLUE = new Color(34, 67, 182);
	public static Color DARK_SALMON_INJUSTICE = new Color(233, 150, 122);
	public static Color AGED_MOUSTACHE_GREY = new Color(126, 126, 126);
	public static Color DEHYDRATION = new Color(204, 169, 19);

	// Static counts.
	public static int ngonCount = 0;
	public static int spiralCount = 0;
	
	// Regular Ngon
	public static void filledRegularNgon(double centerX, double centerY, double radius, int n)
	{
		// Decides what step each angle should be based on numSides.
		double angle = (2*Math.PI)/(double)n;
		
		// Varies angle.
		double cur = angle;
	
		// Creates two arrays for our x and y points.
		double[] xPoints = new double[n];
		double[] yPoints = new double[n];
		
		// Populates arrays.
		for(int i = 0; i < n; ++i)
		{
			// Uses trig to determine coordinates.
			xPoints[i] = centerX + Math.cos(cur)*radius;
			yPoints[i] = centerY + Math.sin(cur)*radius;
			
			// Increments angle.
			cur += angle;
		}
		
		StdDraw.filledPolygon(xPoints, yPoints);
		
		// Increments static count.
		++ngonCount;
	}
	
	
	// I took spin rate to mean number of rings since a spin rate of 1 is a straight line.
	public static void spiral( double centerX, double centerY, double maxRadius, double spinRate, double numSegments)
	{
		// Determines total number of segments needed.
		double totalSegments = (double)numSegments*spinRate;
		
		// Increments radius instead of angle.
		double radiusAddition = maxRadius / (double)totalSegments;
		double currentRadius = 0;

		// Primary points for lines.
		double oldX = centerX;
		double oldY = centerY;

		// Iterates over total number of sections needed.
		for (int i = 0; i <= totalSegments; i++)
		{
			// Calculates new point locations.
			double newX = centerX + Math.cos((2*i*Math.PI)/(double)numSegments) * currentRadius;
			double newY = centerY + Math.sin((2*i*Math.PI)/(double)numSegments) * currentRadius;

			StdDraw.line(oldX, oldY, newX, newY);
			
			// Increments radius.
			currentRadius += radiusAddition;

			// Sets current values to previous values.
			oldX = newX;
			oldY = newY;
		}

		// Increments static count.
		++spiralCount;
	}
	
	//Getters
	public static int getNgonCount()
	{
		return ngonCount;
	}
	
	public static int getSpiralCount()
	{
		return spiralCount;
	}
	
}



