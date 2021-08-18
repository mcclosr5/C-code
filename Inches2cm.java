import java.util.Scanner;

public class Inches2cm
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a quantity in inches: ");
        int n = in.nextInt();
        // Find out how many inches (use a whole number for integers)
        double cent = n * 2.54;
        // Print out the result
        System.out.println(n + " inch is " + cent);
    }
}