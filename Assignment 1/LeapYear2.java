/* 2)Write a program that checks if a given year is a leap year or not using both if-else and
switch-case.*/
import java.util.Scanner;
class  LeapYear2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int year=sc.nextInt();
		int leap=year%4;
		switch(leap){
			case 0:
				System.out.println(year+" is leap year");
				break;
			case 1:
				System.out.println(year+" is not leap year");
				break;
		}
		
	}
}