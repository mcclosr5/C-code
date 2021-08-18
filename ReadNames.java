import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNames
{
    public static void main(String [] args) throws FileNotFoundException
    {
    	try
    	{
       		if(args.length == 0)
        	{
        		System.out.print("Usage: java ReadNames <filename>");
        		System.exit(1);
       		}
       		String filename = args[0];
        	Scanner in = new Scanner(new File(args[0]));
        	int fileLen = in.nextInt();
        	String [] names = new String[fileLen];

        	for(int i = 0; i < fileLen; i++)
        	{
        		names[fileLen - 1 - i] = in.next();
        	}
        	System.out.println("The names in reverse order are:");
        	for(int i = 0; i < fileLen; i ++)
        	{
        		System.out.print(names[i] + " ");
        	}
       		System.out.println();
       	}
    		catch (FileNotFoundException | ArrayIndexOutOfBoundsException  e)
    		{
        		String output = String.format("Usage: java ReadNames %n", filename);
     
        		System.out.println(output);
    		}
    }		
}