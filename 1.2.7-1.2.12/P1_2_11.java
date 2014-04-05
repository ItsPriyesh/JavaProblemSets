// The "P1_2_11" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.2.11 
The 5th root of any number can similarly be found: It t is an approximation of 
the 5th root of a, then is a better approximation. Use recursion to 
create a method for finding the 5th root: double fifthRood(double a).

*/
import java.awt.*;
import hsa.Console;

public class P1_2_11
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	c.print ("Enter a number that you would like to find the fifth root of: ");
	int num = c.readInt();
	c.print ("\nThe approxiamte fifth root of " + num + " is " + fifthRoot (num, 1));
	
	// Place your program here.  'c' is the output console
    } // main method
    
    public static double fifthRoot (double a, double t)
    {
	double tFifth = Math.pow (t, 5);
	double dif = Math.abs (tFifth - a);

	double eq = ((a / (t * t * t * t)) + 4 * t) / 5;
	
	if (dif < 0.001)
	{
	    return t;
	}
	else
	{            
	    return fifthRoot (a, eq) ;
	}
    }
} // P1_2_11 class
