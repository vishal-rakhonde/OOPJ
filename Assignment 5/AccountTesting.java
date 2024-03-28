package in.cdac.kh;

import java.util.Scanner;

public class AccountTesting {
	
	Scanner sc=new Scanner(System.in);
	
	public  Account createAcoount()
	{
		System.out.println("Enter Your Name : ");
		
		String name=sc.nextLine();
	    int acc=AccountTesting.generateUniqueAccountNumber();	
	    System.out.println(" Account No Is : "+acc);
	    double bal=0;
	    Account user=new Account(name,acc,bal);
		System.out.println(" Account Created Successfully !!!");
		return user;
	}
	
	private static int generateUniqueAccountNumber() {
		// TODO Auto-generated method stub
		int no=2403700+(int)(Math.random()*100);
		return no;
	}

	public static void main(String[] args)
	{
		AccountTesting obj=new AccountTesting();
		Account user=null ;
		Scanner sc=new Scanner(System.in);
		int no=0;
		double bal=0;
      
        int choice=0;
        do {
        	System.out.println(" =================================");
            System.out.println("   Enter Choice : ");
            System.out.println("0. To Exit :");
            System.out.println("1. To Create Account : ");
            System.out.println("2. Deposit Money : ");
            System.out.println("3. Withdraw Money : ");
            System.out.println("4. Display Balance : ");
            System.out.println("5. Display Account Holder : ");
          choice =sc.nextInt();	
           
           switch(choice)
           {
           case 1:
        	user= obj.createAcoount();
        	 break;
           case 2:
        	   System.out.println("Enter user's account no :  ");
        	   no=sc.nextInt();
               System.out.println("Enter amount to deposit : ");
               bal=sc.nextInt();
        	   user.deposit(no, bal);
        	   break;
           case 3:
        	   System.out.println("Enter user's account no :  ");
        	   no=sc.nextInt();
               System.out.println("Enter amount to withdraw : ");
               bal=sc.nextInt();
        	   user.withdraw(no, bal);
        	   break;
           case 4:
        	   System.out.println("Enter user's account no :  ");
        	   no=sc.nextInt();
        	   user.displayBalance(no);
        	   break;
           case 5:
        	   System.out.println("Enter user's account no :  ");
        	   no=sc.nextInt();
        	   user.accountHolderInfo(no);
        	   break;
           default :
        	   System.out.println("Please Enter choice from 0-5 ");
        		   
           
        	   
        	   
           }
           
           
        }while(choice!=0);
        
 	   System.out.println("=======================");
        
        
	}

}
