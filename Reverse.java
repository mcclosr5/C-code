import java.util.Scanner;

public class Reverse
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        int [] nums = new int[num];
        System.out.print("Enter " + num + " numbers: ");
        // Read in the numbers
        for(int i = 0; i < num; i ++)
        {
            int num1 = in.nextInt();
            nums[i] = num1;
        }
        
        // reverse the numbers

        System.out.print("The numbers reversed are:");
        // print them out
        for(int j = num - 1; j >= 0; j --)
        {
        	System.out.print(" " + nums[j]);
        }
        // Use System.out.print(" " + num[i]); and finish with a newline.
        System.out.println();
    }
}