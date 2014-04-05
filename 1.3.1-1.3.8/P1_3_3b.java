// The "P1_3_3b" class.
/*
Developer: Priyesh Patel
Teacher: Cuyugan
Course: ICS4U

Program Description: P1_3_3b
Write a program that lets you update the text file in 1.3.4 by adding the 1996
data to it and saving the new table in a new text file. You may obtain the 1996
data from

*/
import java.awt.*;
import hsa.Console;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
public class P1_3_3b
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
	    year = new double [13] [6];

	    double year1996[] = {551.8, 134.6, 909.3, 738.1, 7138.8, 10743.6, 1113.9, 990.2, 2696.8, 3724.5, 30.8, 39.7, 24.7};

	    String line = "";
	    for (int i = 0 ; i <= 12 ; i++)
	    {
		line = bfProvinces.readLine ();
		provinceList.add (line);

		for (int k = 0 ; k <= 4 ; k++)
		{
		    year [i] [k + 1] = Double.parseDouble ((line.substring ((k * 10 + 30), (k * 10 + 38))));
		}
		year [i] [0] = year1996 [i];
	    }
	    bfProvinces.close ();
	}
	catch (Exception e)
	{
	    c.print ("File not found. Ensure that populationByProvinces.txt is in the same directory as this Java file.");
	}

	String province[] = (String[]) provinceList.toArray (new String [provinceList.size ()]);   // cast arraylist into array

	try
	{
	    PrintWriter w = new PrintWriter (new FileWriter (new File("newPopulationByProvince.txt")));
	    for (int j = 0 ; j <= 12 ; j++)
	    {
		w.print ((province [j]).toString ().substring (0, 30));

		for (int k = 0 ; k <= 4 ; k++)
		{
		    w.print (year [j] [k] + " ");
		}
		w.println("");
	    }
	    w.close();
	    c.print ("New data including the year 1996 has successfully been written to:\n\nnewPopulationByProvince.txt\n\nThis file is located in the same directory as this java file.");
	}
	catch (IOException e)
	{
	    c.print ("Failed to write to file");
	}

	// Place your program here.  'c' is the output console
    } // main method
} // P1_3_3b class
