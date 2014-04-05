// The "P1_2_7" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.2.7 
Create a method String compact(String line), that will eliminate all the spaces 
from line. For example, compact("this is a test ") would return: 
"thisisatest". Use recursion


*/
import java.awt.*;
import hsa.Console;
import java.lang.*;
import java.io.*;

public class P1_2_7
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.println ("Enter a sentence containing spaces: ");
	String sentence = c.readLine();

	c.print (compact (sentence));
	// Place your program here.  'c' is the output console
    } // main method


    public static String compact (String line)
    {

	for (int x = 0 ; x < line.length () ; x++)
	{
	    if (line.charAt (x) == ' ')
	    {
		String newLine = line.substring (0, x) + line.substring (x+1);
		return compact (newLine);
	    }
	}
	return line;
    }
} // P1_2_7 class
