/* #TWO-SUM-PROBLEM
 * 
 * Given an array of integers, return indices of two numbers such that they add up to specific target. 
 * You may assume that each input would have exactly one solution,and you may not use the same element twice.
 * 
 * Example : 
 * 
 * Given num = [2,3,7,4,8,-5],   target=9
 * Because num[0] + num[2] = 2 + 7 = 9
 * return [0, 2]
 * 
 */

package com.aadi.codingChallenges;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Ch02TwoSum {

	private static Scanner input;

	public static void main(String[] args) {
		
		int[] numbers = new int[] {2,3,7,4,8,-5};
		input = new Scanner(System. in);
		System.out.println("To verify if any sum of two numbers from array are equal to input number, Kindly input a target number : ");
		int target = input.nextInt();
		int[] result = getTwoSum(numbers, target);
		System.out.println(result[1] + " " + result[0]);
	}
	
	public static int[] getTwoSum(int[] numbers, int target) {
		Map<Integer, Integer> visitedNumbers = new HashMap<>();
		for(int i=0; i<numbers.length; i++) {
			int delta = target-numbers[i];          //7=9-num2(0)
			if(visitedNumbers.containsKey(delta)) {
				return new int[] {i, visitedNumbers.get(delta)};
				
			}
			visitedNumbers.put(numbers[i], i);
		}
		return new int[] {-1, -1};    //Handling condition, if entered target number not satisfies any two number sum from array.
	}
}