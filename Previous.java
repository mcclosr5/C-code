import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Previous
{
    public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);
    	List<Integer> nums  =new arrayList<Integer>();
    	int num = in.nextInt();
    	System.out.println("Enter some numbers (-1 to end");
    	System.out.println("Previous: ");
    	while(num != -1)
    	{
    		for(n in nums)
    		{
    			if(n == num)
    			{
    				System.out.println(n);
    				break;
    			}
    		}
    		nums.add(n);
    		num = in.nextInt();
    	}
    	
    }
}