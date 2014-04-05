// The "P1_2_3" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.2.3 
Create a method that will return a string of characters:
String repeat(char c, int n) should return return n characters c. For example, 
repeat('x',10) would return; "xxxxxxxxxx"
Use a for loop first, and test it. 
*/
import java.awt.*;
import hsa.Console;
import java.util.*;

public class P1_2_3
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.print ("Enter a single character: ");
	char character = c.readChar ();

	c.print ("How many times do you want to repeat the character?: ");
	int num = c.readInt ();

	c.print (repeat (character, num));
    } // main method

    public static String repeat (char c, int n)
    {
	String ch = "";
	for (int x = 0 ; x < n ; x++)
	{
	    ch += c;
	}
	return ch;
    }
} // P1_2_3 class
