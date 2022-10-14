/*
A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget. 
Given price lists for keyboards and USB drives and a budget, find the cost to buy them. 
If it is not possible to buy both items, return -1.

#Example : b = 60; keyboards = [40, 50, 60];  drivers = [5, 8, 12];
The person can buy a 40 keyboard + 12 USB drive = 52, or a 50 keyboard + 8 USB drive = 58. 
Choose the latter as the more expensive option and return 58. 
*/
package com.aadi.codingChallenges;

public class Ch23ElectronicsShop {
	
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
	       int price=0;
	        int max=0;
	        
	        for(int i=0;i<keyboards.length;i++){
	            for(int j=0;j<drives.length;j++){
	                if(keyboards[i]+drives[j]<=b){
	                  if(max<keyboards[i]+drives[j]){
	                      max=keyboards[i]+drives[j];
	                  }  
	                }
	            }
	        }
	        price=(max==0?-1:max);
	       
	       return price;
	    }

	public static void main(String[] args) {
		int[] keyboards= {40,50,60};
		int[] drives= {5,8,12};
		int b=60;
		System.out.println(getMoneySpent(keyboards, drives, b));
	}

}
