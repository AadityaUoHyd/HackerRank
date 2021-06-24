//Find given two strings are anagram or not.
//An anagram is a word or phrase formed by rearranging the letters of a different word or phrase.

import java.util.Arrays;

public class Anagram{
    
    public static void main(String[] args){
        
        String x= "It is Triangle";
        String y= "Is it Integral";
        
        char a[]= x.replace(" ","").toLowerCase().toCharArray();;
        char b[]= y.replace(" ","").toLowerCase().toCharArray();;
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        Boolean result = Arrays.equals(a,b);
        
        if(result == true){
            System.out.println(" Given strings are Anagram. ");
        }
        else
        {
            System.out.println(" Given strings are not an Anagram. ");
        }
        
    }
    
}
