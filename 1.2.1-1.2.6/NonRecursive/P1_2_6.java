// The "P1_2_6" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.2.6
Modify the method above by creating a method that will return the word 
backwards as well. For example, reverse("car") would return: "r-a-c". Use 
recursion

*/
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
	for (int x = 1 ; x < (stringLength - 1) * 2 ; x += 2)
	{
	    rev = new StringBuffer (rev).insert (x, "-").toString ();
	}
	return rev;
    }
} // P1_2_6 class
