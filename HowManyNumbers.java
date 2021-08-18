import java.util.Scanner;

public class HowManyNumbers
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        System.out.println("Enter numbers: ");
       while(num != -1)
       {
        num = in.nextInt();
        count ++;
       }
       count = count -1;
        System.out.println(count + " numbers were entered.");
    }
}