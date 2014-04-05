// The "P1_3_1" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.3.1
Write a program that lets your enter a number from 1 to 7 and that returns the
name of the day of the week. Your program should continue asking for week
numbers until you enter an invalid integer, at which time it stops. Use an array
which you initialize with the days of the week

*/

import java.awt.*;
import hsa.Console;

public class P1_3_1
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int num;
	String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	String[] numString = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh"};

	do
	{
	    c.print ("Enter a number from 1 - 7: ");
	    num = c.readInt ();

	    if (num < 1 || num > 7)
	    {
		c.clear();
		c.println ("You entered an invalid number");
		break;
	    }
	    else if (num >= 1 || num <= 7)
	    {
		c.clear();
		c.println ("The " + numString [num-1] + " day of the week is " + daysOfWeek [num - 1] + "\n");

	    }
	    // Place your program here.  'c' is the output console
	}
	while (num <= 7 || num >= 1); // main method
    } // P1_3_1 class
}

