// The "P1_2_9" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.2.9 
The greatest common divisor of (a and b) is the same as the greatest 
common divisor of (b and c) where c is the remainder, when a is divided by b. 
Since the remainder of any division is always smaller than the original divisor 
(i.e. c < b), by repeating the argument, the second term will eventually become 
so small it is zero:
gcd(a,b) = gcd(b,c) = ... gcd(d,0) where the greatest common divisor is d.
Write int gcd (int a, int b) that will find the greatest common divisor of a and b 
using recursion.

*/
import java.awt.*;
import hsa.Console;

public class P1_2_9
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	c.print ("Enter first number: ");
	int num1 = c.readInt ();

	c.print ("Enter second number: ");
	int num2 = c.readInt ();

	c.print ("The greatest common divisor of " + num1 + " and " + num2 + " is " + gcd (num1, num2));

	// Place your program here.  'c' is the output console
    } // main method


    public static int gcd (int a, int b)
    {

	if (a == 0 || b == 0)
	{
	    return a + b;
	}
	else
	{
	    int c = a % b;
	    return gcd (b, c);
	}
    }
} // P1_2_9 class
