import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

/*
 * Author: Cole Polyak
 * UnStdDraw.java
 * 23 January 2018
 * 
 * 
 */

//"Any work of art quickly reveals itself to be a linked system of problems" -George Saunders

public class UnStdDraw {

	public static Color DENIM_BLUE = new Color(34, 67, 182);
	public static Color DARK_SALMON_INJUSTICE = new Color(233, 150, 122);
	public static Color AGED_MOUSTACHE_GREY = new Color(126, 126, 126);

	public static int ngonCount = 0;
	public static int spiralCount = 0;
	
	public static void filledRegularNgon(double centerX, double centerY, double radius, int n)
	{
		double changeX = Math.cos(((2.0*Math.PI)/(double)n))*radius;
		double changeY = Math.sin(((2.0*Math.PI)/(double)n))*radius;
		
		double[] xPoints = new double[n];
		double[] yPoints = new double[n];
		
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



