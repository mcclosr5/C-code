import java.util.Scanner;
import java.lang.String;

public class VowelNumber
{
   public static void main(String [] args)
   {
      System.out.print("Enter a word :");
      String word = new Scanner(System.in).next();
      
      String vowelNumber = word;
      for(int i = 0; i < vowelNumber.length(); i++)
      {
      	vowelNumber.replace('a', '1');
      	vowelNumber.replace('e', '2');
      	vowelNumber.replace('i', '3');
      	vowelNumber.replace('o', '4');
      	vowelNumber.replace('u', '5');
      // Insert your code here
      }
      
      System.out.println("VowelNumbered is :" + vowelNumber + ":");
   }
}