/*
 * Program to find second highest number in a given integer Array.
 * Say, given array is : {9458, 19575, 5682, 0, -1305, 1942, 9010}, then output should be: 9558
 */

package test;

public class Ch09SecondHighest {
	
	static int secondHighest(int[] input) {
		
		int firstHighest, secondHighest;
		
		if(input[0] > input[1]) {                 // checking first two numbers which is second highest
			firstHighest = input[0];
			secondHighest = input[1];
		}
		else {
		    firstHighest = input[1];
		    secondHighest = input[0];
		}
		
		for (int i=2; i<input.length; i++) {      //checking from 3rd element onwards of input[]
			
			if(input[i]>firstHighest) {
			secondHighest = firstHighest;
			firstHighest = input[i];
			}
			else if (input[i]<firstHighest && input[i]>secondHighest) {
				secondHighest = input[i];
			}
		}
		
		return secondHighest;
	}
	

	public static void main(String[] args) {
		System.out.println(secondHighest(new int[] {46, 52, 27, 85, 47, 41}));		              //52
		System.out.println(secondHighest(new int[] {9458, 19575, 5682, 0, -1305, 1942, 9010}));   //9458
		System.out.println(secondHighest(new int[] {69, 805, 7672, 0, -1295, -1791, 034}));       //805
	}

}
