// The "P1_3_6" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.3.6
Let diff be the increase in population between 1997 and 2001 (in case of
decrease, diff would be a negative number). Let pop be the population in
1997. Define factor as: factor = (1+ diff/pop)^1/4
Then one can calculate the expected population by repeatedly multiplying the
1997 population figure by factor.
For example, the estimated population in 2007 is:
pop ´ factor^10
Write a program that will let you enter a year > 2000 and that will print out a list
of all 25 metropolitan areas and the expected population at that time.

*/
import java.awt.*;
import hsa.Console;
import java.io.*;
import java.util.*;
import java.text.*;

public class P1_3_6
{
    static Console c;           // The output console
    static double[] pop97;
    static double[] pop01;

    public static void main (String[] args)
    {
	c = new Console (28, 80);

	String cities[] = {"Toronto", "Montréal", "Ottawa-Hull", "Calgary", "Edmonton", "Calgary", "Québec", "Winnipeg", "Hamilton", "London", "Kitchener",
	    "St. Catharines-Niagara", "Halifax", "Victoria", "Windsor", "Oshawa", "Saskatoon", "Regina", "St. John's", "Chicoutimi-Jonquière",
	    "Sudbury", "Sherbrooke", "Trois-Rivières", "Thunder Bay", "Saint John"};

	c.print ("Enter a year greater than 2000: ");
	int year = c.readInt ();
	int yearDiff = year - 1997;

	c.clear ();
	c.println ("Expected populations for the year " + year + " are (in thousands): \n");

	for (int i = 0 ; i < 25 ; i++)
	{
	    try
	    {
		BufferedReader br = new BufferedReader (new FileReader (new File ("popCities97to01.txt")));
		pop97 = new double [25];
		pop01 = new double [25];

		String line = "";
		for (int j = 0 ; j <= 24 ; j++)
		{
		    line = br.readLine ();
		    pop97 [j] = Double.parseDouble (line.substring (0, 9));
		    pop01 [j] = Double.parseDouble (line.substring (12, 21));
		}
		br.close ();

	    }
	    catch (IOException e)
	    {
		c.print ("File not found.");
	    }

	    double diff = pop01 [i] - pop97 [i];
	    double pop = pop97 [i];
	    double factor = Math.pow (1.0 + diff / pop, 1 / 4.0);
	    double expPop = (pop * (Math.pow (factor, yearDiff)));
	    
	    DecimalFormat df = new DecimalFormat ("0.0");
	    
	    c.print (cities [i] + ": " + df.format (expPop) + "\n");
	}
	// Place your program here.  'c' is the output console
    } // main method
} // P1_3_6 class
