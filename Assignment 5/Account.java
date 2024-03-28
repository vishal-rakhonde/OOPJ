package in.cdac.kh;

public class Account {
	private String accountHolderName;
	private int acocuntNumber;
	private double balance;
	public Account(String accountHolderName, int acocuntNumber, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.acocuntNumber = acocuntNumber;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	
	public void deposit(int no,double bal)
	{
		if(acocuntNumber==no)
		{
			balance=balance+bal;
			//System.out.println(" --- "+balance);
			System.out.println(" Deposit Credeted Successfully !!!");
		}
		else
		{
			System.out.println(" Account No Is Not Valid !!! ");
		}
	}
	
	public void withdraw(int no,double bal)
	{
		
		if(acocuntNumber==no)
		{
			if(bal < balance)
			{
			balance=balance-bal;
			
			System.out.println("Withdrawn Amount : "+bal);
			System.out.println("Available Amount : "+balance);
			
			}
			else
			{
				System.out.println(" Balance is insufficient ");
			}
		}
		else
		{
			System.out.println(" Account No Is Not Valid !!! ");
		}
		
	}
	
	public void displayBalance(int no)
	{
		if(acocuntNumber==no)
		{
			System.out.println("Available Balance : "+balance);
		}
		else
		{
			System.out.println(" Account No Is Not Valid !!! ");
		}
		
	}
	
	public void accountHolderInfo(int no)
	{
		if(acocuntNumber==no)
		{
			System.out.println("Account Holder Name : "+accountHolderName);
			System.out.println("Account Holder No : "+acocuntNumber);
			System.out.println("Available Balance : "+balance);
		}
		else
		{
			System.out.println(" Account No Is Not Valid !!! ");
		}
		
	}
	
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAcocuntNumber() {
		return acocuntNumber;
	}
	public void setAcocuntNumber(int acocuntNumber) {
		this.acocuntNumber = acocuntNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
