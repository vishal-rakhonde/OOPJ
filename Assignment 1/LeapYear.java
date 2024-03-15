/* 2)Write a program that checks if a given year is a leap year or not using both if-else and
switch-case.*/
import java.util.Scanner;
class  LeapYear{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int year=sc.nextInt();
		if (year%4==0){
			System.out.println(year+" ia leap year.");
		}
		else
			System.out.println(year+" is not a leap year");
		
	}
}