import java.util.ArrayList;
import java.util.List;
public class Test
{
    public static String [] makeThreesome(String word)
    {
    	String [] threes;
    	for(int i =0;i < word.length(); i++)
    	{
    		int j = i + 2;
    		threes.add(word.substring(i, j));
    	}
    	return threes;
        // Your code here
    }
}