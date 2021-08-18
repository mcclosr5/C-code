import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti1
{
    public static void main(String [] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(new File(args[1]));
        String w = "";
        String l;
        int count = 0;
        while(in.hasNext())
        {
        	l = in.next();
        	w = w + l;
        }

        int i = w.indexOf(args[0]);
        while (i >= 0)
        {
        	count ++;
        	i = w.indexOf(args[0], i + 1);
        }
        System.out.println(args[0] + " appears "+count+" times.");
    }
}