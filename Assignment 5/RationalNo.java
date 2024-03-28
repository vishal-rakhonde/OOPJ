import java.util.Scanner;

public class RationalNo {
	private int numerator;
	private int denominator;

	public RationalNo(int numerator, int denominator) {
	super();
	this.numerator = numerator;
	this.denominator = denominator;
}

public static void main(String []args)
{
	RationalNo  no=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a  no : ");
	int a=sc.nextInt();
	System.out.println("enter a  sec no : ");
	int b=sc.nextInt();
	no=new RationalNo (a,b);
	System.out.println("enter a opeartion, + , - , / , * ");
	char ch=sc.next().charAt(0);
	
	switch(ch)
	{
	case '+':
		System.out.println("addition is : " +(no.numerator + no.denominator));
		break ;
	case '-':
		System.out.println("substarction is : " +(no.numerator - no.denominator));
		break ;
	case '*':
		System.out.println("addition is : " +(no.numerator * no.denominator));
		break ;
	case '/':
		System.out.println("addition is : " +(no.numerator / no.denominator));
		break ;
	default :
		System.out.println(" enter valid input");
		
		
	}
}

}
