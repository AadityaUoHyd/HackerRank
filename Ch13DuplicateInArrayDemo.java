// Write a program in Java to find duplicates in array using HashSet. Say, input array is : {3,10,14,12,2,46,2,11,12,10,35,1,2}.

import java.util.*;
public class Ch13DuplicateInArrayDemo {

     public static void main(String []args){
         
         int[] inputArr = {3,10,14,12,2,46,2,11,12,10,35,1,2};
         Ch13DuplicateInArrayDemo.findDuplicateValueFromArrayUsingHashSet(inputArr);
         
     }
     
     public static void findDuplicateValueFromArrayUsingHashSet(int[] inputArr){
         
         Set<Integer> hashSet = new HashSet<>();
         
         
         for(int arr1 : inputArr){
           
             if(!hashSet.add(arr1)){
                System.out.println("Duplicate elements are : "+arr1);
             }
         }
     }
}
