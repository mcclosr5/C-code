import java.util.*;
public class Word
{
	public static int howManyCorrect(String word, String guess)
	{
		int count = 0;
		char [] words = new char[word.length()];


		for(int x = 0; x < word.length(); x ++)
		{
			for(int j = 0; j < guess.length(); j++)
			{
				if(word.charAt(x) == guess.charAt(j))
				{
					count += 1;
				}
			}	
		}

	String str = new String(words);
	return count;
	}
}