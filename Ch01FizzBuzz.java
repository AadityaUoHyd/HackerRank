/* #FizzBuzz-Problem
 * 
 * WAP that prints each number from 1 to 100 on a new line.
 * For each multiple of 3, print "Fizz" instead of that number.
 * For each multiple of 5, print "Buzz" instead of that number.
 * For numbers which are multiple of both 3 and 5, print "FizzBuzz" instead of that number.
 * 
 */

package com.aadi.codingChallenges;

public class Ch01FizzBuzz {

	public static void main(String[] args) {
		printFizzBuzz(100);
	}
	
	public static void printFizzBuzz (int n) {
		
		for (int i=1; i<n; i++) {
			if(i%3==0) {
				System.out.println("Fizz");	
			}
			else if(i%5==0){
				System.out.println("Buzz");	
			}
			else if((i%3==0) && (i%5==0)){
				System.out.println("FizzBuzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
	
}