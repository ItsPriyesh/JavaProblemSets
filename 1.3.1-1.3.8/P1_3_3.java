// The "P1_3_3" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.3.3
Write a program that lets you enter the day and month number, and that will
calculate the day of the year. Initialize an array with the total number of days in
each of the 12 months of 2002. If for example you enter the numbers 5 and 2,
representing February 5, your program should return the number 36.

*/
import java.awt.*;
import hsa.Console;

public class P1_3_3
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	int month[] = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

	c.print ("Enter number of month (1-12): ");
	int monthNum = c.readInt ();
	c.print ("Enter day of month (1-31):");
	int dayNum = c.readInt ();

	if (dayNum < 1 || dayNum > 31 || monthNum < 1 || monthNum > 12)
	{
	    c.println ("0");
	}
	else
	{
	    c.println ("\n"+months [monthNum - 1] + ", " + dayNum + " is the " + (month [monthNum - 1] + dayNum) + " day of the year.");
	}
	// Place your program here.  'c' is the output console
    } // main method
} // P1_3_3 class
