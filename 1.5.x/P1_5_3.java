// The "P1_5_3" class.

/*
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
 *
 */

import java.awt.*;
import hsa.Console;
import java.io.*;
public class P1_5_3
{
    static Console c;           // The output console

    static String dataFromFile[];
    public static void main (String[] args) throws IOException
    {
	c = new Console (25, 90);
	while (true)
	{
	    c.println ("Pick an option:\n1 - Add to database      2 - View database");
	    int choice = c.readInt ();

	    if (choice == 1)
	    {
		c.print ("Enter name (15 characters max): "); //17 actual spaces available
		String name = c.readLine ();
		while (true)
		{
		    if (name.length() <= 15)
		    {
			break;
		    }
		    else
		    {
			c.print ("Entered name doesn't match requirements (15 characters max): ");
			name = c.readLine ();
		    }
		}
		
		c.print ("Enter address (47 characters max): "); //49 actual spaces available
		String address = c.readLine ();
		while (true)
		{
		    if (address.length() <= 47)
		    {
			break;
		    }
		    else
		    {
			c.print ("Entered address doesn't match requirements (47 characters max): ");
			address = c.readLine ();
		    }
		}
		
		c.print ("Enter phone number (20 characters max): "); //20 actual spaces available
		String phone = c.readLine ();
		while (true)
		{
		    if (phone.length() <= 20)
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
		bw.close ();

		c.clear ();
		c.println ("Successfully added new entry.\n");
	    }
	    else if (choice == 2)
	    {
		c.clear ();
		c.print ("Name:            Address:                                         Phone:\n");
		BufferedReader br = new BufferedReader (new FileReader (new File ("database")));
		String line = "";
		while ((line = br.readLine ()) != null)
		{
		    c.println (line);
		}
		c.println ();
		br.close ();
	    }
	}
    }

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
