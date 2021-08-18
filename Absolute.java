import java.util.Scanner;

public class Absolute
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		if (n < 0)
		{
			n = n + (n * -2);
		}
		System.out.println("The absolute value is " + n + ".");
	}
}