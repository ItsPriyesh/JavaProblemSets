// The "P1_3_7" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.3.7
Modify the program above to print only the results of the top 10 cities by
population. Use the bubble sort method.

*/
import java.awt.*;
import hsa.Console;
import java.io.*;
import java.util.*;
import java.text.*;

public class P1_3_7
{
    static Console c;           // The output console
    static double[] pop97;
    static double[] pop01;

    static double[] expPopArray;

    public static void main (String[] args)
    {
	c = new Console (28, 80);

	String cities[] = {"Toronto", "Montréal", "Ottawa-Hull", "Calgary", "Edmonton", "Calgary", "Québec", "Winnipeg", "Hamilton", "London", "Kitchener",
	    "St. Catharines-Niagara", "Halifax", "Victoria", "Windsor", "Oshawa", "Saskatoon", "Regina", "St. John's", "Chicoutimi-Jonquière",
	    "Sudbury", "Sherbrooke", "Trois-Rivières", "Thunder Bay", "Saint John"};

	c.print ("Enter a year greater than 2000: ");
	int year = c.readInt ();
	int yearDiff = year - 1997;
	expPopArray = new double [25];
	c.clear ();
	c.println ("Top ten expected populations for the year " + year + " are (in thousands): \n");

	for (int i = 0 ; i < 25 ; i++)
	{
	    try
	    { //Read text file and store into two arrays (double)
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

	    //Declare the variables asked for in the question
	    double diff = pop01 [i] - pop97 [i];
	    double pop = pop97 [i];
	    double factor = Math.pow (1.0 + diff / pop, 1 / 4.0);
	    double expPop = (pop * (Math.pow (factor, yearDiff)));

	    //Put the expected population values into an array so that they can easily be sorted later
	    expPopArray [i] = expPop;

	}

	//Bubble sorting algorithm for expected population array
	double temp = 0;
	for (int i = 0 ; i < expPopArray.length ; i++)
	{
	    for (int j = 1 ; j < (expPopArray.length - i) ; j++)
	    {
		if (expPopArray [j - 1] < expPopArray [j])
		{
		    temp = expPopArray [j - 1];
		    expPopArray [j - 1] = expPopArray [j];
		    expPopArray [j] = temp;
		}
	    }
	}

	//Print out top 10 population values
	DecimalFormat df = new DecimalFormat ("0.0");
	for (int i = 0 ; i < 10 ; i++)
	{
	    c.println ((i+1) + ". " + cities [i] + ": " + df.format (expPopArray [i]));
	}
	// Place your program here.  'c' is the output console
    } // main method
} // P1_3_7 class
