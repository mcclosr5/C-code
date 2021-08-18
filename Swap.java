public class Swap
{
	static <T> void swap(T [] s, int i, int j)
	{
		T tmp = s[i];
		s[i] = s[j];
		s[j] = tmp;
	}
}