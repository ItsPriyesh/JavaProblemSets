// The "P1_2_6" class.
import java.awt.*;
import hsa.Console;

public class P1_2_6
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	
	c.print ("Enter a word: ");
	String word = c.readString ();

	c.println (reverseAndExpand (word));
    } // main method

    public static String reverseAndExpand (String word)
    {
	String rev = "";
	int stringLength = word.length ();
	
	for (int count = word.length () - 1 ; count >= 0 ; count--)
	{
	    rev += word.charAt (count);
	}

	if (rev.length () <= 1)
	{
	    return rev;
	}
	else
	{
	    return rev.substring (0, 1) + "-" + reverseAndExpand (rev.substring (1));
	}
    }

} // P1_2_6 class
