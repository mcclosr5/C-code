public class Movie
{
  public static final int CHILDRENS = 2;
  public static final int REGULAR = 0;
  public static final int NEW_RELEASE = 1;
  private String _title;
  private int _priceCode;
  
  public Movie(String title, int priceCode)
  {
 	  _title = title;
 	  _priceCode = priceCode;
  }

  public int getPriceCode()
  {
 	  return _priceCode;
  }
  public void setPriceCode(int arg)
  {
 	  _priceCode = arg;
  }
  public String getTitle ()
  {
 	  return _title;
  };
  public double getCharge(int _daysRented)
  {
  	double result = 0;
  	switch (getPriceCode())
  	{
  		case Movie.REGULAR:
  			result+=2;
  			if(_daysRented > 2)
  			{
  				result += (_daysRented - 2)* 1.5;
  			}
  			break;
  		case Movie.NEW_RELEASE:
  			result += _daysRented * 3;
  			break;
  		case Movie.CHILDRENS:
  			result += 1.5;
  			if(_daysRented > 3)
  			{
  				result += (_daysRented -3) * 1.5;
  			}
  			break;
  	}
  return result;
  }
  public int getFrequentRenterPoints(int _daysRented)
  {
  	int p = 1;
  	if((getPriceCode()==NEW_RELEASE)&& _daysRented > 1)
  	{
  		p++;
  	}
  	return p;
  }
} 