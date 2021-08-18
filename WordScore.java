public class WordScore
{
	String w;
	int score;

	public WordScore(String s)
	{
		this.w = s;
	}

	public int score(String s)
	{
		String [] l = s.split(" ");
		for(int i = 0;i<l.length;i++)
		{
			if(l[i].equals(this.w))
			{
				return Integer.parseInt(s.substring(1, 2));
			}
		}

	    return -1;
	}
}