public class Pair<T,V>
{
	private T a;
	private V b;
	public Pair(T a, V b)
	{
		this.a = a;
		this.b = b;
	}
	public String toString()
	{
		return this.a +" "+ this.b;
	}
}