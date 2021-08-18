import java.util.Scanner;

public class OneToNum
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        // Use a loop to print out the numbers
        // We will use i as the loop variable
        int i = 1; // Starting value
        for (i = 1; i <= num; i ++) // Keep looping as long as some condition is true
        {
            System.out.print(i + " ");
        }
       
        System.out.println(); // Finish with a new line.
    }
}