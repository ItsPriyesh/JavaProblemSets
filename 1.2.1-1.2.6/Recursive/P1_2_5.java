// The "P1_2_5" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.2.5 
Create the method String expand( String word) that will insert minus signs 
between letters. For example, expand ("automobile") to: "a-u-t-o-m-o-b-i-l-e"
Single letter words are clearly not affected by expand. Use recursion.

*/
import java.awt.*;
import hsa.Console;

public class P1_2_5
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	c.print ("Enter a word: ");
	String word = c.readString ();

	c.print (expand (word));
	// Place your program here.  'c' is the output console
    } // main method


    public static String expand (String word)
    {
	if (word.length () <= 1)
	{
	    return word;
	}
	else
	{
	    return word.substring (0, 1) + "-" + expand (word.substring (1));
	}
    }
} // P1_2_5 class
