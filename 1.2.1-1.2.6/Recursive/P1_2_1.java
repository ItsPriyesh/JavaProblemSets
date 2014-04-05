// The "P1_2_1" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.2.1 
Create a method that will return the factorial for any integer, zero or greater: 
long factorial (long n). Use a counted loop. Then write a program that will test 
the method by letting you enter any integer. Your testing program should 
repeat asking for input, until a negative number is entered.
(Note that only numbers <=20 will give you valid answers)
*/
import java.awt.*;
import hsa.Console;

public class P1_2_1
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int original;

	do
	{
	    c.print ("Enter a number between between 0 and 20: ");
	    original = c.readInt ();
	    c.clear ();

	    if (original < 0)
	    {
		break;
	    }
	    else if (original > 20)
	    {
		c.print ("Enter a number between between 0 and 20: ");
		original = c.readInt ();
		c.clear ();
	    }

	    c.println ("The factorial of " + original + " is " + factorial (original));
	}
	while (original <= 20 || original >= 0);
	System.exit (0);

	// Place your program here.  'c' is the output console
    } // main method


    public static long factorial (long n)
    {
	if (n<=1){
	   return 1;
	}
	else {
	return n * factorial (n-1);
	}
    }
} // P1_2_1 class

