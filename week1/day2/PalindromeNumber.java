package week1.day2;

import java.util.Iterator;

public class PalindromeNumber {

	public static void main(String[] args) {
		int input=121; //is a Palindrome number
		//int input=12345; //is not a Palindrome number
		int originalInput=input;
		int output=0;
		for (; input>0; input=input/10) {
			int rem=input%10;
			output=(output*10)+rem;
			
		}
		if (originalInput==output) {
			System.out.println(originalInput + "is a Palindrome.");
			
		} else {
			System.out.println(originalInput + "is not a Palindrome.");

		}
		
		}

	}


