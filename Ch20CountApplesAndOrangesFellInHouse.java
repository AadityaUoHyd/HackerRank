/*
 Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below, 
 determine the number of apples and oranges that land on Sam's house.

In the diagram below:

The red region denotes the house, where s is the start point, and t is the end point. The apple tree is to the left of the house, 
and the orange tree is to its right.
Assume the trees are located on a single point, where the apple tree is at point a, and the orange tree is at point b.
When a fruit falls from its tree, it lands d units of distance from its tree of origin along the x-axis. *A negative value of d
means the fruit fell d units to the tree's left, and a positive value of d means it falls d units to the tree's right.

Given the value of d for m apples and n oranges, determine how many apples and oranges will fall on Sam's house 
(i.e., in the inclusive range |s,t|)?
 */
package com.aadi.codingChallenges;

import java.util.*;

public class Ch20CountApplesAndOrangesFellInHouse {

	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

		Integer appleArray[] = new Integer[apples.size()];
		apples.toArray(appleArray); 

		Integer orangeArray[] = new Integer[oranges.size()];
		oranges.toArray(orangeArray); 

		long appleCount= 0;
		long orangeCount= 0;
		for(int i=0;i<appleArray.length;i++){
			if(a+appleArray[i]>=s && a+appleArray[i]<=t){
				appleCount++;
			}
		}
		for(int j=0;j<orangeArray.length;j++){
			if(b+orangeArray[j]>=s && b+orangeArray[j]<=t){
				orangeCount++;
			}
		}
		System.out.println(appleCount +"\n"+ orangeCount);

		/*List<Integer> ApplesLocation=new ArrayList<>();
		List<Integer> OrangesLocation=new ArrayList<>();

		ApplesLocation=apples.stream().map(x->x+a).collect(Collectors.toList());
		OrangesLocation=oranges.stream().map(x->x+b).collect(Collectors.toList());
		*/
		
		 //Alternative Solution-2		  
		/* ApplesLocation.retainAll(IntStream.range(s, t+1).boxed().collect(Collectors.toList()));
		OrangesLocation.retainAll(IntStream.range(s, t+1).boxed().x->x.contains(IntStream.range(s, t+1).boxed())).count();));
		System.out.println(ApplesLocation.size() +"\n"+ OrangesLocation.size());
		 */


		 //Alternative Solution-3 		  
		/* int appleCount=0,orangeCount=0;
		 for(int i=s; i<=t; i++) {
            if(ApplesLocation.contains(i)) {
        A        appleCount++;
            }
            if(OrangesLocation.contains(i)) {
                orangeCount++;
            }
        }
		System.out.println(appleCount +"\n"+ orangeCount);
		 */

	}

	public static void main(String[] args) {
		int s=7,t=10,a=4,b=12;
		
		List<Integer> apples=new ArrayList<>();
		List<Integer> oranges=new ArrayList<>();
		
		apples=Arrays.asList(2,3,-4);
		oranges=Arrays.asList(3,-2,-4);
		
		Ch20CountApplesAndOrangesFellInHouse.countApplesAndOranges(s,t,a,b,apples,oranges);
	}

}
