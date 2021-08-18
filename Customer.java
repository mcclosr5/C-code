import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Customer
{
   private String _name;
   private List<Rental> _rentals = new ArrayList<Rental>(); 
 	
   public Customer (String name, List rentals)
   {
 	   _name = name;
       _rentals = rentals;
   };

   public void addRental(Rental arg)
   {
 	  _rentals.add(arg);
   }

   public String getName()
   {
 	  return _name;
   };
   public List<Rental> getRentals()
   {
 	  return _rentals;
   }

   public String toString()
   {
 	  return _name + ": " +  getRentals();
   }

   public int getTotal()
   {
   	  int thisAmount = 0;
   	  switch (each.getMovie().getPriceCode())
   	  {
   	  	case Movie.REGULAR:
   	  		thisAmount += 2;
   	  		if (each.getDaysRented() > 2)
   	  		{
   	  			thisAmount += (each.getDaysRented() - 2) * 1.5;
   	  		}
   	  		break;
   	  	case Movie.NEW_RELEASE:
   	  		thisAmount += each.getDaysRented() * 3;
   	  		break;
   	  	case Movie.CHILDRENS:
   	  		thisAmount += 1.5;
   	  		if (each.getDaysRented() > 3)
   	  		{
   	  			thisAmount += (each.getDaysRented() - 3) * 1.5;
   	  		}
   	  		break;
   	  }
   	  return thisAmount;
   }

   public String statement()
   {
       double totalAmount =0;
       int frequentRenterPoints=0;
       String result="";
       for (Rental rental:_rentals)
       {
           double currentAmount=0;
           currentAmount = getTotal(rental);
           frequentRenterPoints++;
           if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented()>1)
           	{frequentRenterPoints++;}
           result +="  "+ rental.getMovie().getTitle()+"  "+String.valueOf(currentAmount)+"\n";
           totalAmount +=currentAmount;
       }
       result += "Amount owed is " + String.valueOf(totalAmount) +"\n";
       result += "You earned " + String.valueOf(frequentRenterPoints)+" frequent renter points"+"\n";
       return result;
   }
}