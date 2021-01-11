//Convert an Integer number into Roman numerals. Given limit up to '3999'.

package com.aadi.codingChallenges;

import java.util.Scanner;

public class Ch05ConverIntegerToRomanNumerals {
	
	public String intToRoman(int num) {	
	String[] units = 
		new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	String[] tens = 
		new String[] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	String[] hundreds = 
		new String[] {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	String[] thousand = 
		new String[] {"", "M", "MM", "MMM"};
		
		return thousand[num/1000] + 
				hundreds[(num%1000)/100] + 
				tens[(num%100)/10] + 
				units[num%10] ;		
	}
	
	public static void main(String[] args) {
		
		Ch05ConverIntegerToRomanNumerals roman = new Ch05ConverIntegerToRomanNumerals();
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer number to convert it into Roman: ");
		int num = input.nextInt();
		
		if(num>0 && num<4000)
			System.out.println(roman.intToRoman(num));
		else
			System.out.println("Kindly enter digit between 1 to 3999.");
	
	}
	
}