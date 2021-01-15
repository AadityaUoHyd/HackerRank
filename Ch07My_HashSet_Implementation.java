//HashSet Implementation
package com.aadi.codingChallenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ch07My_HashSet_Implementation {
	
	//private final int MAX_VALUE = 1000000;
	private final int ARRAY_SIZE = 100;
	private List<List<Integer>> parentList;
	
	public My_HashSet_Implementation() {
		parentList = new ArrayList<>(ARRAY_SIZE);
		for (int i=0; i < ARRAY_SIZE; i++) {
			parentList.add(null);
		}
	}
	
	public void add(int key) {
		int index = key % ARRAY_SIZE;
		List<Integer> childList = parentList.get(index);
		if (childList == null) {
			List<Integer> list = new LinkedList<>();
			list.add(key);
			parentList.set(index, list);
		}
		else if(!childList.contains(key)) {
			childList.add(key);
		}
	}
	
	public void remove(int key) {
		int index = key % ARRAY_SIZE;
		List<Integer> childList = parentList.get(index);
		if(childList != null) {
			childList.remove(Integer.valueOf(key));
		}
	}
	
	public boolean contains(int key) {
		int index = key % ARRAY_SIZE;
		List<Integer> childList = parentList.get(index);
		return (childList != null && childList.contains(key));
	}
	
	/*
	 public static void main(String[] args) {
		parentList.add(3);
	}
    */
	
}
