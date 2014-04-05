// The "P1_3_4" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: 1.3.4
See: http://www.statcan.ca/english/Pgdb/demo02.htm
and use it to create a text file with 6 columns. Space the data in such a way,
that provinces start at position 0, the 1997, 1998, 1999, 2000 and 2001 data
respectively at positions 30, 40, 50, 60 and 70. Remove the commas from the
numbers.

Write a program that will read the data into 2 arrays: String province[13] and
double year[13][5]. Then print the data on the screen.

*/

import java.awt.*;
import hsa.Console;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class P1_3_4
{
    static Console c;           // The output console

    static ArrayList provinceList;

    static String[] province;
    static double[] [] year;
    
    public static void main (String[] args)
    {
	c = new Console ();

	try
	{
	    BufferedReader bfProvinces = new BufferedReader (new FileReader (new File ("populationByProvinces.txt")));
	    provinceList = new ArrayList ();
	    year = new double [13] [5];
	    String line = "";
	    for (int i = 0 ; i <= 12 ; i++)
	    {
		line = bfProvinces.readLine ();
		provinceList.add (line);

		for (int k = 0 ; k <= 4 ; k++)
		{
		    year [i] [k] = Double.parseDouble ((line.substring ((k * 10 + 30), (k * 10 + 38))));
		}
	    }
	    bfProvinces.close ();
	}
	catch (Exception e)
	{
	    c.print ("File not found. Ensure that populationByProvinces.txt is in the same directory as this Java file.");
	}

	String province[] = (String[]) provinceList.toArray (new String [provinceList.size ()]);   // cast arraylist into array

	for (int j = 0 ; j <= 12 ; j++)
	{
	    c.print ((province [j]).toString ().substring (0, 30));
	    
	    for (int k = 0; k <=4; k++){
		c.print (year[j][k] + "   ");
	    }
	    c.println ("");
	}
	// Place your program here.  'c' is the output console
    } // main method
} // P1_3_4 class
