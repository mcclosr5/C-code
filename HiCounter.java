import java.util.Scanner;

public class HiCounter
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a phrase: ");
        // Read in the phrase (actually the whole line)
        String word = in.nextLine();

        // count how many times "hi" occurs.
        // YOUR CODE HERE
        String y = "hi";
        int count = 0;
        for(int i = 0; i < word.length() - 1; i ++)
        {
            String sub = word.substring(i, i + 2);
            if(sub.equals(y))
            {
                count ++;
            }
        }
        System.out.println(count);
    }
}