package com.aadi.codingChallenges;
// Given a String find the first non-repeatable character in the String. 
// Example: If given input string is : "kkkkkooooovvvvuuupppqaaaajjjj"; Answer should be : q

import java.util.LinkedHashMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.io.*;
import static java.util.function.Function.identity;

public class Ch08FirstNonRepeatingLetter {
    
    
    static String readInput;
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("Kindly Enter your string.");
        InputStreamReader inputString=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(inputString);
        readInput= br.readLine();
        
        findFirstNonRepeatingLetter(System.out::println);
    }
    
    private static void findFirstNonRepeatingLetter(Consumer<Character> callback) {
        readInput.chars()
                .mapToObj(i -> Character.valueOf((char) i))
                .collect(Collectors.groupingBy(identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst().map(c -> {
            callback.accept(c);
            return c;
        });
    }
} 
