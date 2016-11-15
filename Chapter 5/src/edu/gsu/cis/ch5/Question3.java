package edu.gsu.cis.ch5;
import java.util.Scanner;
// testing
//testing2
public class Question3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter a number");

		int a = input.nextInt();

		// calling method
		// value of a needs to be returned

		

		boolean result = isPalindrome(a);
		if(result == true)
		System.out.println("Palindrome");
		else
		System.out.println("Not Palindrome");

	}

	public static boolean isPalindrome(int number){
		if(number == reverse(number))
		return true;
		else
		return false;
	}

	public static int reverse(int number) {
		int temp = 0;
		int reversedNumber = 0;
		while (number > 0) {
			temp = number % 10;
			number = number / 10;
			reversedNumber = reversedNumber * 10 + temp;
		}
		return reversedNumber;

	}

}
