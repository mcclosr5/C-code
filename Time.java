public class Time
{
	private String hr;
	private String min;

   // Private variables
	public Time(String time)
	{
		this.hr = time.substring(0,2);
		this.min = time.substring(2,4);
	}
   // Constructor (with a String parameter)
   // isLater(Time otherTime) // boolean method to compare two times
	public boolean isLater(Time t2)
	{
		if(Integer.parseInt(this.hr) > Integer.parseInt(t2.hr))
		{
			return true;
		}
		else if(Integer.parseInt(this.hr) < Integer.parseInt(t2.hr))
		{
			return false;
		}
		if(Integer.parseInt(this.min) > Integer.parseInt(t2.min))
		{
			return true;
		}
		else if(Integer.parseInt(this.min) < Integer.parseInt(t2.min))
		{
			return false;
		}
		return false;

	}
   // String toString() // return a String representation of the time (hh:mm)
	public String toString()
	{
		return this.hr + ":" + this.min;
	}
}