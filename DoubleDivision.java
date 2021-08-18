import java.util.Scanner;

public class DoubleDivision
{
    // Fill in the main method
    public static void main(String [] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter two floating point numbers: ");
    double n1 = in.nextDouble();
    double n2 = in.nextDouble();
    
    double res = n1 / n2;
    System.out.println(n1 + " / " + n2 + " is " + res);
    }
}