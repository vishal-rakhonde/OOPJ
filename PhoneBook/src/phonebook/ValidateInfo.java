package phonebook;


import java.time.LocalDate;
import java.util.HashSet;

public class ValidateInfo {
	
	
	public static Customer ValidateInputs(String name,String email, String date,int mobno,HashSet<Customer>cust)
	{
		LocalDate d1=LocalDate.parse(date);
	return new Customer(name, email, d1, mobno);	
	}
	
	
	public static LocalDate parsedate(String date)
	{
		return LocalDate.parse(date);
	}

}
