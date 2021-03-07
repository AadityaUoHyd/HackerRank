//Number of occurance of letters in given String.

import java.util.*;

public class Ch12NumberOfOccurances{

     public static void main(String []args){
         
         String givenStr = "Aaditya";
         
         char charArr[] = givenStr.toCharArray();
         int size = charArr.length;
         
         Map<Character, Integer> map = new HashMap<>();
         
         int i=0;
         
         while(i != size){
             if(map.containsKey(charArr[i])==false){
                 map.put(charArr[i],1);
             }
             else
             {
                 int oldval = map.get(charArr[i]);
                 int newval = oldval + 1;
                 map.put(charArr[i], newval);
             }
             ++i;
         }
         Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
         for(Map.Entry<Character, Integer> data : hmap){
           System.out.println(data.getKey()+" "+data.getValue());
         }
     }
}
