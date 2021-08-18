import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		List<Integer> nums = new ArrayList<Integer>();
		System.out.println("Enter numbers: ");
		int num = in.nextInt();
		while(num != -1)
		{
			nums.add(num);
			num = in.nextInt();
		}
		String odd = "Odd: ";
		String even = "Even: ";

		for(int n: nums)
		{
			if(n % 2 == 0)
			{
				even += n + " ";
			}
			else
			{
				odd += n + " ";
			}
		}
		System.out.println(odd + "\n" + even);
	}
}