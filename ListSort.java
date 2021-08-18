import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class ListSort
{

	public static void main(String[] args)
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
		Collections.sort(nums);
		System.out.print("Sorted: ");

		for(int n: nums)
		{
			System.out.print(n + " ");
		}

	}
}