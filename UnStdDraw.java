import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

/*
 * Author: Cole Polyak
 * UnStdDraw.java
 * 23 January 2018
 * 
 * 
 */



public class UnStdDraw {

	public static Color DENIM_BLUE = new Color(34, 67, 182);
	public static Color DARK_SALMON_INJUSTICE = new Color(233, 150, 122);
	public static Color AGED_MOUSTACHE_GREY = new Color(126, 126, 126);

	public static int ngonCount = 0;
	public static int spiralCount = 0;
	
	public static void filledRegularNgon(double centerX, double centerY, double radius, int n)
	{
		double angle = (2*Math.PI)/(double)n;
		double cur = angle;
	
		double[] xPoints = new double[n];
		double[] yPoints = new double[n];
		
		for(int i = 0; i < n; ++i)
		{
			xPoints[i] = centerX + Math.cos(cur)*radius;
			yPoints[i] = centerY + Math.sin(cur)*radius;
			
			cur += angle;
		}
		
		StdDraw.filledPolygon(xPoints, yPoints);
		++ngonCount;
	}

	public static void spiral( double centerX, double centerY, double maxRadius, double spinRate, int numSegments)
	{
		//Method goes here.
		++spiralCount;
	}
	
	//Getters.
	public static int getNgonCount()
	{
		return ngonCount;
	}
	
	public static int getSpiral()
	{
		return spiralCount;
	}
	
}



