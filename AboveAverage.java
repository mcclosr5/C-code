//
// Supplied code to help ensure there will be no output formatting issues.
//
import java.util.Scanner;

public class AboveAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        // Create an array
        double [] nums = new double[num];
        System.out.print("Enter " + num + " numbers: ");
        // Now read in the numbers
        double total = 0;
        for(int i = 0; i < num; i ++)
        {
            double num1 = in.nextDouble();
            total += num1;
            nums[i] = num1;

        }
        double avg = total / num;
        // Print out the numbers greater than the average
        System.out.println("The above average numbers are:");
        // You can use the following code to print out one number
        for(int j = 0; j < num; j ++)
        {
            if (nums[j] > avg)
            {
                System.out.print(" " + nums[j]); // You may want to put this in a loop.
            }
        }

        System.out.println(); // Should finish with a new line
    }
}