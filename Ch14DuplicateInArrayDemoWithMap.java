//Write a program in Java to find duplicates in array using HashMap. Say, input array is : {3,10,14,12,2,46,2,11,12,10,35,1,2}.

import java.util.*;
public class Ch14DuplicateInArrayDemoWithMap{

     public static void main(String []args){
         
         int[] inputArr = {3,10,14,12,2,46,2,11,12,10,35,1,2};
         Ch14DuplicateInArrayDemoWithMap.findDuplicateValueFromArrayUsingMap(inputArr);
         
     }
     
     public static void findDuplicateValueFromArrayUsingMap(int[] inputArr){
         
         Map<Integer,Integer> map = new HashMap<>();
           
         for(int arr1 : inputArr){
           
             if(!map.containsKey(arr1)){
                 map.put(arr1, 1);
             }
             else{
                 map.put(arr1, map.get(arr1)+1);
             }
         }
         for (Integer arr1 : map.keySet()){
             if(map.get(arr1)>1){
                 System.out.println("Duplicate elements are : " + arr1);
             }
         }
     }
}
