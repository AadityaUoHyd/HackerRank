/*
 John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation moves the 
 last array element to the first position and shifts all remaining elements right one. To test Sherlock's abilities, 
 Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation a number of times then 
 determine the value of the element at a given position.

For each array, perform a number of right circular rotations and return the values of the elements at the given indices.

#Example : 
a=[3,4,5];   k=2;   queries=[1,2];

After two(k=2) rotation of [3,4,5] => [5,3,4] => [4,5,3]
Result should be => 5 and 3 as in queries they asked index 1 & 2.
*/
package com.aadi.codingChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ch21RotationOfArray {
	
	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
	    
		Integer arr[]=new Integer[a.size()];
		arr=a.toArray(arr);
		
		Integer query[]=new Integer[queries.size()];
		query=queries.toArray(query);
		
		k = k % arr.length;
	    Integer[] result = new Integer[query.length];
	    for (int i = 0; i < result.length; i++) {
	      result[i] = arr[(query[i] - k + arr.length) % arr.length];
	    }
	    List<Integer> list = Arrays.asList(result);
	    return list;
    }

	
	public static void main(String[] args) {
		List<Integer> array=new ArrayList<>();
		array=Arrays.asList(1,2,3);

		List<Integer> queries=new ArrayList<>();
		queries=Arrays.asList(0,1,2);

		int rotation=2;
		Ch29RotationOfArray.circularArrayRotation(array, rotation, queries).forEach(System.out::println);
	}

}
