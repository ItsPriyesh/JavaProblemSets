// The "P1_2_12" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.2.12 
An equation of the form ax3 + bx2 + cx + d = 0 always has at least one solution. 
And if t is one approximation, then is a better one.
Use recursion to create the method realRoot() for finding a root for the 
equation ax3 + bx2 + cx + d = 0

*/
import java.awt.*;
import hsa.Console;

public class P1_2_12
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	c.print ("Enter 'a' value: ");
	double aVal = c.readDouble ();

	c.print ("Enter 'b' value: ");
	double bVal = c.readDouble ();

	c.print ("Enter 'c' value: ");
	double cVal = c.readDouble ();

	c.print ("Enter 'd' value: ");
	double dVal = c.readDouble ();

	c.print ("\nThe equation you entered was: " + aVal + "x\u00B3 + " + bVal + "x\u00B2 + " + cVal + "x + " + dVal);
	c.print ("\nA root of this equation is: "+  realRoot (aVal, bVal, cVal, dVal, 1));
	// Place your program here.  'c' is the output console
    } // main method


    public static double realRoot (double a, double b, double c, double d, double t)
    {
	double eq1 = a * (t * t * t) + b * (t * t) + c * t + d;
	double eq2 = ((2 * a * (t * t * t)) + (b * (t * t)) - d) / ((3 * a * (t * t)) + (2 * b * t) + c);

	if (eq1 == 0) {
	    return t;
	}
	else {
	    return realRoot (a, b, c, d, eq2);
	}
    }
} // P1_2_12 class
