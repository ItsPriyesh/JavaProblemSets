// The "P1_5_3" class.
/*
 * Developer: Priyesh Patel
 * Teacher: Cuyugan
 * Course: ICS4U
 *
 * Program Description: 1.5.3
 *  Create a personal database of company names, addresses, and phone 
 *  numbers that are of particular interest to you to begin a resource list of 
 *  potential contacts in the computer industry.
 *
 *
 * Default Database Entries:
 *
 * Name:            Address:                                         Phone:
 * Google           1600 Amphitheatre Pkwy, Mountain View, CA        734-332-6501          
 * Microsoft        1 Microsoft Way, Redmond, WA                     877-970-3159          
 * Apple            1 Infinite Loop, Cupertino, CA                   800-263-3394          
 * Samsung          24 Giheung-Gu, Yongin-city, KR                   800-726-7864          
 * HTC              23 Hsing Hua Road, Taoyuan City, TW              866-449-8358          
 * Sony             7 Konan Minato-ku, Tokyo, JP                     239-768-7676          
 * Nokia            4 Keilalahdentie, Espoo, FI                      358-71-8008000        
 * Hewlett-Packard  3000 Hanover Street, Palo Alto, CA               650-857-1501        
 * Dell             2300 West Plano Parkway, Plano, TX               888-317-3768  
 *
 */

import java.awt.*;
import hsa.Console;
import java.io.*;
public class P1_5_3
{
    static Console c;

    static String dataFromFile[];
    public static void main (String[] args) throws IOException, InterruptedException
    {
	c = new Console (25, 90);
	while (true)
	{
	    c.println ("Welcome to Priyesh's Database Handler Application.\nPick an option:\n1 - Add to database      2 - View database      3 - Exit");
	    int choice = c.readInt ();

	    if (choice == 1) //Let user add entry to db
	    {
		c.print ("Enter name (15 characters max): "); //17 actual spaces available (save 2 spaces for sufficient padding)
		String name = c.readLine ();
		while (true)
		{//Error proof for too many chars
		    if (name.length () <= 15)
		    {
			break;
		    }
		    else
		    {
			c.print ("Entered name doesn't match requirements (15 characters max): ");
			name = c.readLine ();
		    }
		}

		c.print ("Enter address (47 characters max): "); //49 actual spaces available (save 2 spaces for sufficient padding)
		String address = c.readLine ();
		while (true)
		{//Error proof for too many chars
		    if (address.length () <= 47)
		    {
			break;
		    }
		    else
		    {
			c.print ("Entered address doesn't match requirements (47 characters max): ");
			address = c.readLine ();
		    }
		}

		c.print ("Enter phone number (20 characters max): "); //22 actual spaces available (save 2 spaces for sufficient padding)
		String phone = c.readLine ();
		while (true)
		{//Error proof for too many chars
		    if (phone.length () <= 20)
		    {
			break;
		    }
		    else
		    {
			c.print ("Entered phone number doesn't match requirements (20 characters max): ");
			phone = c.readLine ();
		    }
		}

		BufferedWriter bw = new BufferedWriter (new FileWriter ("database", true));

		bw.write ("\n" + addSpacing (name, 17) + addSpacing (address, 49) + addSpacing (phone, 20)); 
		//Write new entry to db, and call my method to properly space everything
		bw.close ();

		c.clear ();
		c.println ("Successfully added new entry.\n");
	    }

	    else if (choice == 2) //Display the db to the user
	    {
		c.clear ();
		c.print ("Name:            Address:                                         Phone:\n");
		BufferedReader br = new BufferedReader (new FileReader (new File ("database")));
		String line = "";
		while ((line = br.readLine ()) != null) //Keep reading the next line until its empty
		{
		    c.println (line);
		}
		c.println ();
		br.close ();
	    }
	    else if (choice == 3) //Exit the program (3 sec countdown timer)
	    {
		c.clear ();
		for (int x = 3 ; x >= 0 ; x--)
		{
		    c.clear ();
		    c.print ("Exiting in: " + x);
		    Thread.sleep (1000);
		}
		System.exit (0);
	    }
	    else // User proof invalid choice entry
	    {
		c.clear ();
		c.print ("Not a valid option. Choose again:\n");
	    }
	}
    }

    /*
    * This method has been created solely by Priyesh Patel, and
    * allows for adding the necessary spacing to a string. In
    * other words it appends the correct amount of spacing to an
    * inputted string so that it looks consistent throughout a
    * table. The method recieves an input of the string and the
    * number of spaces available in the given cell, and outputs
    * an updated string containing spaces at the end.
    *
    * Use of this method without permissions is not permitted.
    *
    */
    public static String addSpacing (String line, int availSpaces)
    {
	int lineLength = line.length ();
	int spacesToAdd = availSpaces - lineLength;
	for (int i = 0 ; i < spacesToAdd ; i++)
	{
	    line = line + " ";
	}
	return line;
    }
} // P1_5_3 class
