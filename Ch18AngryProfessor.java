/*
A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, 
the professor decides to cancel class if fewer than some number of students are present when class starts. 
Arrival times go from on time (arrivalTime<=0) to arrived late (arrivalTime>0).

Given the arrival time of each student and a threshold number of attendees, determine if the class is cancelled.

#Example :
n=5,k=3
a=[-2,-1,0,1,2]

The first 3 students arrived on. The last 2 were late. The threshold is 3 students, so class will go on. Return "NO",
as class not cancelled, in case class got cancelled then you're suppose to return "YES".

 */
package com.aadi.codingChallenges;

import java.util.*;

public class Ch18AngryProfessor {

	public static String angryProfessor(int k, List<Integer> a) {

		int count=0;
		
		for(Integer i : a) {
			if(i<=0) {
				count++;
			}
		}
		if(count >= k) {
			return "NO";
		}else {
			return "YES";
		}
		
	}


	public static void main(String[] args) {
		int k=3;
		List<Integer> a=new ArrayList<>();
		a=Arrays.asList(-1,-3,4,2);
		System.out.println(angryProfessor(k, a));
	}

}
