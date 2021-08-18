import java.util.Scanner;

public class Bigger
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		if (n1 > n2)
		{
			System.out.println(n1 + " is the biggest.");
		}
		else
		{
			System.out.println(n2 + " is the biggest.");
		}
	}
}