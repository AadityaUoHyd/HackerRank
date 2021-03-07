/*

Number of occurance of letters in given String.

Input : Aaditya Bachchu Chatterjee

Output : 

a 5
d 1
i 1
t 3
y 1
b 1
c 3
h 3
u 1
e 3
r 1
j 1

*/

import java.util.*;

public class Ch12NumberOfOccurances{

     public static void main(String []args){
         
         String givenStr = "Aaditya Bachchu Chatterjee";
         
         char charArr[] = givenStr.toLowerCase().replaceAll("\\s", "").toCharArray();
         int size = charArr.length;
         
         Map<Character, Integer> map = new LinkedHashMap<>();
         
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
