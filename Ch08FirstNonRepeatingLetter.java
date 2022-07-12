package com.aadi.codingChallenges;
// Find all anagrams in a String. Given a String s, and a non-empty String p, find all the start indices of p's anagrams in s. 
// Strings consists of lower case English letters only and the length of both Strings s and p will not be larger than 20,100.

//Example Input:-         s: "cbaebabacd"            p:"abc"
//Output : [0,6]

//Explaination : The substring with start index 0 is 'cba' is anagram of p. The substring with start index 6 is 'bac' is anagram of p too.

//Example Input:-         s: "abab"                  p:"ab"
//Output : [0,1,2]


import java.util.*;

public class Ch17FindAllAnagramsInString{

    public List<Integer> findAllAnagrams(String s, String p){
        
        List<Integer> result = new ArrayList<>();
        
        if(s.length() == 0 || s == null){
            return result;
        }
        
        int[] char_counts = new int[26];
        for(char c : p.toCharArray()){
            char_counts[c-'a']++;
        }
        
        int left = 0;
        int right = 0;
        int count = p.length();
        
        while(right < s.length()){
            
            if(char_counts[s.charAt(right++)-'a']-- >= 1){
                count--;
            }
            
            if(count == 0) {
                result.add(left);
            }
            
            if(right-left==p.length() && char_counts[s.charAt(left++)-'a']++ >= 0){
                count++;
            }
            
        }
        
        return result;
        
    }

     public static void main(String []args){
        Ch17FindAllAnagramsInString f = new Ch17FindAllAnagramsInString();
        System.out.println(f.findAllAnagrams("cbaebabacd", "abc"));
        System.out.println(f.findAllAnagrams("abab", "ab"));
     }
}
