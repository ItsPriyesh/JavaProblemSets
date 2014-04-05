// The "P1_2_8" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.2.8 
Create a method int count(String line, char c) that will count the number of 
occurrences of the character c. 
For example count("this is a test ",'s') will return 3, and
count("this is a test ",'x') will return 0. Use recursion.

*/
import java.awt.*;
import hsa.Console;
import java.io.*;

public class P1_2_8
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	c.print ("Enter a word or sentence: ");
	String word = c.readLine ();

	c.print ("Enter a letter or character to find: ");
	char chr = c.readChar ();

	c.println ("");
	c.print ("The character '"+chr + "' was found " + count (word, chr) + " times.");

	// Place your program here.  'c' is the output console
    } // main method


    public static int count (String line, char c)
    {
	int charOccurences = 0;
	
	for (int x = 0 ; x < line.length () ; x++)
	{
	    if (line.charAt (x) == c)
	    {
		charOccurences++;
		line = line.substring (0, x) + line.substring (x + 1);
		return charOccurences + count (line, c);
	    }

	}
	return charOccurences;
    }
} // P1_2_8 class
