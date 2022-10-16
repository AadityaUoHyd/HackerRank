/*
There is a sequence of words in CamelCase as a string of letters, 's', having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lower-case.
For each of the subsequent words, the first letter is upper-case and rest of the letters are lower-case.
Given s, determine the number of words in s.

Example : s = oneTwoThree;

There are 3 words in the string: 'one', 'Two', 'Three'. 
*/
package com.aadi.codingChallenges;

public class Ch55FindCamelCase {
	
	public static int camelcase(String s) {
        if(s.isEmpty()) {
            return 0;
        }        
        int words = 1;       
        for(char letter : s.toCharArray()) {
            if(letter < 91 && letter > 64 ) {
                words++;
            }
        }
        return words;
    }
	
	public static void main(String[] args) {
		String s ="oneTwoThree";
		System.out.println(camelcase(s));
	}
}
