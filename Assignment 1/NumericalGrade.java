/* 1)Write a program that takes a numerical grade as input and outputs the corresponding letter
grade using if-else statements.*/
import java.util.Scanner;
class  NumericalGrade{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your numerical grade");
		int no=sc.nextInt();
		if(no>=80 && no<=100){
			System.out.println("You got grade A+ ");
		}
		else if (no>=60 && no<80){
			System.out.println("You got grade A");
		}
		else if (no>50 && no<60){
			System.out.println("You got grade B");
		}
		else if (no>40 && no<50){
			System.out.println("You got grade c");
		}
		else if (no>0 && no<40){
			System.out.println("You failed.");
		}
		else{
			System.out.println("Enter valid number.");
		}
	}
}

			