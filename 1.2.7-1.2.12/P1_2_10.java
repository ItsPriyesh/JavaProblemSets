// The "P1_2_10" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.2.10 
The cube root of a number can be found based on the observation, that:
if t is an approximation of the cube root of a, then is a better 
approximation. 
Create a method double betterCubeRoot(double a, double t). that will find the 
cube root of a accurate enough so that the difference between t3 and a is less 
than .0001. Use recursion. Then write the method double cubeRoot(double a) that 
makes use of the method with 1 the initial value for t. Write a program that 
will test values both positive and negative.

*/
import java.awt.*;
import hsa.Console;

public class P1_2_10
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	c.print ("Enter a number that you would like to find the cube root of: ");
	int num = c.readInt();
	c.print ("\nThe approxiamte cube root of " + num + " is " + cubeRoot (num));
	// Place your program here.  'c' is the output console
    } // main method


    public static double betterCubeRoot (double a, double t)
    {
	double tCubed = Math.pow (t, 3);
	double dif = Math.abs (tCubed - a);

	double eq = ((a / (t * t)) + 2 * t) / 3;
	
	if (dif < 0.001)
	{
	    return t;
	}
	else
	{            
	    return betterCubeRoot (a, eq) ;
	}
    }

    public static double cubeRoot (double a)
    {
	int t1 = 1;
	return betterCubeRoot(a,t1);
    }
    
} // P1_2_10 class
