//Convert Roman numerals to Integer numbers. limit up to 3999.

package com.aadi.codingChallenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ch04ConvertRomanToInteger {

	public int romanToInt(String s) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('M', 1000);
		
		int result = 0;
		
		for(int i=0; i < s.length(); i++) {
			if(i>0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))) {
				result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i-1));			
			}	else {
				result += map.get(s.charAt(i));
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Ch04ConvertRomanToInteger rti = new Ch04ConvertRomanToInteger();
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Roman numeral between 1 to 3999 : ");
		String str = input.nextLine();

		System.out.println(rti.romanToInt(str.toUpperCase()));
		
	}
	
}