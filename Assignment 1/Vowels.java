/* 5)Write a program that takes a character as input and determines whether it’s a vowel or a
consonant using if-else. */
import java.util.Scanner;
class Vowels{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			System.out.println(ch+" is a vowel.");
		}
		
		else
			System.out.println(ch+" is not a vowel.");
	}
}
		

		
		