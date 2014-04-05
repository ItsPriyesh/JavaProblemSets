// The "P1_3_5" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.3.5
See: http://www.statcan.ca/english/Pgdb/People/Population/demo05.htm
and similar to the previous problem, prepare a text file and write a program
that will let you enter a single letter and then print the data for all cities starting
with that letter.

*/
import java.awt.*;
import hsa.Console;
import java.io.*;
import java.util.*;

public class P1_3_5
{
    static Console c;    // The output console

    static String[] dataFromFile;
    public static void main (String[] args)
    {
	c = new Console ();

	String cities[] = {"Toronto", "Montréal", "Ottawa-Hull", "Calgary", "Edmonton", "Calgary", "Québec", "Winnipeg", "Hamilton", "London", "Kitchener",
	    "St. Catharines-Niagara", "Halifax", "Victoria", "Windsor", "Oshawa", "Saskatoon", "Regina", "St. John's", "Chicoutimi-Jonquière",
	    "Sudbury", "Sherbrooke", "Trois-Rivières", "Thunder Bay", "Saint John"};

	c.print ("Enter the starting (single) letter of a city: ");

	char x = c.readChar ();

	c.clear ();
	c.println ("The cities starting with the letter '" + x + "' are: \n");
	c.println ("1997        1998        1999        2000        2001 ");
	c.println ("-----------------------------------------------------");

	int counter = 0;
	for (int i = 0 ; i < 25 ; i++)
	{
	    String firstLetter = cities [i].substring (0, 1);

	    if (firstLetter.equalsIgnoreCase (x + ""))
	    {
		c.print (cities [i] + "\n");

		try
		{
		    BufferedReader br = new BufferedReader (new FileReader (new File ("populationByCities.txt")));
		    dataFromFile = new String [25];
		    String line = "";
		    for (int j = 0 ; j <= 24 ; j++)
		    {
			line = br.readLine ();
			dataFromFile [j] = line;
		    }
		    br.close ();

		}
		catch (Exception e)
		{
		    c.print ("File not found.");
		}

		c.println (dataFromFile [i] + "\n");
	    }
	    else // iterate counter each time the users char is not found 
		counter++;
	}

	if (counter == 25) //if users char was not found 25 times (the whole array) tell them that
	{
	    c.clear ();
	    c.print ("No matches for cities starting with '" + x + "' were found.");
	}
	// Place your program here.  'c' is the output console
    } // main method
} // P1_3_5 class
