import java.util.Scanner;

public class NextYear
{
    // Fill in the main method
    // This is almost the full solution - it has some errors.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = in.next();   
        System.out.print("What age are you: ");    // Note that the Scanner method, next(), reads in a word.
        int age = in.nextInt();
        int res = age + 1;

        System.out.println("Hello " + name + ", next year you will be " + res + ".");
    }
}