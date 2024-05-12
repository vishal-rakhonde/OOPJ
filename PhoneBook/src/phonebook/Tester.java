package phonebook;

import phonebook.Customer.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Tester {

	public static void main(String[] args) {
		
		
		
		
		
		try(Scanner sc=new Scanner(System.in))
		{
			
			
			/*HashSet does not use the comparator and compare methods.
			It uses the hashCode() and equals() methods to determine whether 
			an object should be added to the set or not. */
			HashSet<Customer> cust=new HashSet<>();
			boolean exit=false;
			
			while(!exit)
			{
				try {
					switch(sc.nextInt())
					{
					case 1:
						System.out.println("enter the name \nemail \ndob \nmobno");
						Customer customer=ValidateInfo.ValidateInputs(sc.next(), sc.next(), sc.next(), sc.nextInt(), cust);
						cust.add(customer);
						System.out.println("Information added succisfully");
						break;
					case 2:
						for(Customer c: cust)
							System.out.println(c);
						break;
					case 3:
						break;
					case 4:
						
						break;
					}
					
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
