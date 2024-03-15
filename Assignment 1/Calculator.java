/*3)Implement a simple calculator program that takes two numbers and an operator (+, -, *, /) as
input and performs the operation using switch-case. */
import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number ");
		int num2=sc.nextInt();
		System.out.println("Enter the key for following operation\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
		int key=sc.nextInt();
	
		switch(key){
			default:
				System.out.println("Enter valid number");
				break;
			case 1:
				System.out.println("Addition :"+num1+num2);
				break;
			case 2:
				int sub=num1-num2;
				System.out.println("Substraction :"+sub);
				break;
			case 3:
				System.out.println("Multiplication :"+num1*num2);
				break;
			case 4:
				float div=(float)num1/num2;
				System.out.println("Division :"+div);
				break;
		}
	}
}