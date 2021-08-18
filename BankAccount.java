public class BankAccount
{
	private double balance;

    public BankAccount(double balance)
    {
        this.balance = balance;
    }
    public BankAccount()
    {
        this.balance = 0; 
    }
    public String toString()
    {
    	return "The balance is " + balance + ".";
    }

    public void setBalance(double newValue)
    {
    	balance = newValue;
    }

    public Double getBalance()
    {
    	return balance;
    }
}