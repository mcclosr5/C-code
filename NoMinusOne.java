import java.util.Scanner;

public class NoMinusOne
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int l = num;
        System.out.println("Enter numbers: ");
       while(num != -1)
       {
        l = num;
        num = in.nextInt();
       }
        System.out.println("The penultimate number was: " + l);
    }
}