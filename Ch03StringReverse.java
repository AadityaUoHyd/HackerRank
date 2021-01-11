/*
 * #Reverse a given string by two ways : 
 * 1. using inbuild reverse() method of StringBuilder class.
 * 2. Manually using for-loop.
 * 
 */

package com.aadi.codingChallenges;

import java.util.Scanner;

public class Ch03StringReverse {

	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.println("To reverse, Kindly enter a string: ");
		String str = input.nextLine();
		//System.out.println(reverseWithStringBuilder(str));
		System.out.println(reverseManually(str));		
	}
	
	public static String reverseWithStringBuilder(String str) {
		return new StringBuilder(str).reverse().toString();
		
	}
		public static String reverseManually(String str) {
			StringBuilder s = new StringBuilder();
			for (int i= str.length() - 1; i>=0; i--) {
				s.append(str.charAt(i));
			}
			return s.toString();					
		}
}