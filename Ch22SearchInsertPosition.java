/*In this problem, we are given a sorted array and a target integer. We have to find its Search Insert Position.

If the target value is present in the array, return its index.
Return the index at which the target should be inserted so as to keep the order sorted(in non-decreasing manner).

#Example : 
Input: a[]={1, 3, 5, 7, 9}, Target = 8
Output : 4
*/
package com.aadi.codingChallenges;

public class Ch22SearchInsertPosition {
	
	public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
       for(int i = 0 ; i < n ; i++)
       {
           if(nums[i] >= target)
               return i;
       }
       return n;
   }
	
	public static void main(String[] args) {
        int nums[] = {1 , 3 , 5 , 7 , 9} , target = 8;
        System.out.println(searchInsert(nums, target));
    
	}

}
