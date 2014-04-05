// The "P1_3_8" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.3.8
Modify the program to print four columns of 10: the first two columns are the
top ten cities by population in 2001 with their population at that time, and the
second set of two columns are the top ten cities by population in the requested
year with their population at that time.

*/
import java.awt.*;
import hsa.Console;
import java.io.*;
import java.util.*;
import java.text.*;

public class P1_3_8
{
    static Console c;           // The output console
    static double[] pop97;
    static double[] pop01;

    static double[] expPopArray;
    
    public static void main (String[] args)
    {
	c = new Console ();

	//These are spaced so that there is the same number of chars in each position
	String cities[] = {"Toronto                ", "Montréal               ", "Ottawa-Hull            ", "Calgary                ", "Edmonton               ", "Calgary                ", "Québec                 ", "Winnipeg               ", "Hamilton               ", "London                 ", "Kitchener              ",
	    "St. Catharines-Niagara ", "Halifax                ", "Victoria               ", "Windsor                ", "Oshawa                 ", "Saskatoon              ", "Regina                 ", "St. John's             ", "Chicoutimi-Jonquière   ",
	    "Sudbury                ", "Sherbrooke             ", "Trois-Rivières         ", "Thunder Bay            ", "Saint John             "};

	c.print ("Enter a year greater than 2000: ");
	int year = c.readInt ();
	int yearDiff = year - 1997;
	expPopArray = new double [25];
	c.clear ();

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

	//Bubble sorting algorithm for 2001 population array
	double temp = 0;
	for (int i = 0 ; i < pop01.length ; i++)
	{
	    for (int j = 1 ; j < (pop01.length - i) ; j++)
	    {
		if (pop01 [j - 1] < pop01 [j])
		{
		    temp = pop01 [j - 1];
		    pop01 [j - 1] = pop01 [j];
		    pop01 [j] = temp;
		}
	    }
	}

	//Bubble sorting algorithm for expected population array
	double temp2 = 0;
	for (int i = 0 ; i < expPopArray.length ; i++)
	{
	    for (int j = 1 ; j < (expPopArray.length - i) ; j++)
	    {
		if (expPopArray [j - 1] < expPopArray [j])
		{
		    temp2 = expPopArray [j - 1];
		    expPopArray [j - 1] = expPopArray [j];
		    expPopArray [j] = temp2;
		}
	    }
	}
	
	//Print out top 10 population values in 2001, and top ten in users future year
	DecimalFormat df = new DecimalFormat ("0.0");

	c.println (" City         |  Population in 2001  |    City    | Expected Population in " + year );
	for (int i = 0 ; i < 10 ; i++)
	{
	    c.println (cities [i] + "" + df.format (pop01 [i])+ "           "  + cities [i] + "  " + df.format (expPopArray [i]));
	} 
	// Place your program here.  'c' is the output console
    } // main method
} // P1_3_8 class
