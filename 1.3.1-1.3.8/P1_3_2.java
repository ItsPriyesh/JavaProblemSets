// The "P1_3_2" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.3.2
Modify the program above to convert numbers to names of months.

*/
import java.awt.*;
import hsa.Console;

public class P1_3_2
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int num;
	String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	String[] numString = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eight", "ninth", "tenth", "eleventh", "twelfth"};

	do
	{
	    c.print ("Enter a number from 1 - 12: ");
	    num = c.readInt ();

	    if (num < 1 || num > 12)
	    {
		c.clear ();
		c.println ("You entered an invalid number");
		break;
	    }
	    else if (num >= 1 || num <= 12)
	    {
		c.clear ();
		c.println ("The " + numString [num - 1] + " month of the year is " + months [num - 1] + "\n");

	    }
	    // Place your program here.  'c' is the output console
	}
	while (num <= 12 || num >= 1); // main method
    } // main method
} // P1_3_2 class
