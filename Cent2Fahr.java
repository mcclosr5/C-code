import java.util.Scanner;

public class Cent2Fahr
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Find out how many inches (use a whole number for integers)
        double fahr = n * 1.8 + 32;
        // Print out the result
        System.out.println(n + " " + fahr);
    }
}