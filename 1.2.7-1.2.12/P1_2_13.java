// The "P1_2_13" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.2.13 
Write a program that will print out the solution of how to move the disk in the
"Towers of Hanoi" problem from one pole to another, using recursion, given
the number of disks to start:

*/
import java.awt.*;
import hsa.Console;

public class P1_2_13
{
    static Console c;           // The output console

    static int stepNum;
    public static void main (String[] args)
    {
	c = new Console ();
	c.print ("Enter number of disc: ");
	int discs = c.readInt ();

	c.clear();
	c.println (" Instructions for Towers of Hanoi with " + discs + " discs:\n");        
	c.println (" ---------------------------------------------------- ");
	c.println (" |  Step:  |   Move disk from:   |   Move disk to:  | ");
	c.println (" ---------------------------------------------------- ");
	
	discMove (discs, 1, 3, 2);
	// Place your program here.  'c' is the output console
    } // main method


    public static void discMove (int discNum, int source, int dest, int spare)
    {        
	if (discNum == 1)
	{
	    stepNum++;
	    c.println (" |    " + (stepNum) + "    |       Tower " + source + "       |      Tower " + dest + "     |");
	    c.println (" ---------------------------------------------------- ");
	}
	else
	{
	    discMove (discNum - 1, source, spare, dest);
	    discMove (1, source, dest, spare);
	    discMove (discNum - 1, spare, dest, source);
	}
    }
} // P1_2_13 class

