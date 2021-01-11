//Stack-Implementation in Java
package com.aadi.codingChallenges;

public class Ch06StackImplementation {
	
	private int array[];
	private int top;
	private static int capacity;
	
	Ch06StackImplementation(int capacity){
		this.array=new int[capacity];
		Ch06StackImplementation.capacity=capacity;
		this.top=-1;
	}
	
	// Utility function to add an element item in the stack
	public void push(int item) {
		if (isFull()) {
			throw new RuntimeException("Stack is full");
		}
		array[++top]=item;
	}
	
	// Utility function to pop top element from the stack
	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return array[top--];
	}
	
	// Utility function to return top element in a stack
	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return array[top];
	}
	
	// Utility function to check if the stack is empty or not
	public boolean isEmpty() {
		return top == -1;
	}
	
	// Utility function to check if the stack is full or not
	public boolean isFull() {
		return top == capacity -1;
	}
	
	// Utility function to return the size of the stack
	public int size(){
			return top + 1;
	}
	
	public static void main (String[] args) {
		Ch06StackImplementation stack = new Ch06StackImplementation(3);

		stack.push(1);		// Inserting 1 in the stack
		stack.push(2);		// Inserting 2 in the stack

		stack.pop();		// removing the top 2
		stack.pop();		// removing the top 1

		stack.push(3);		// Inserting 3 in the stack

		System.out.println("Top element is: " + stack.peek());
		System.out.println("Stack size is " + stack.size());

		stack.pop();		// removing the top 3

		// check if stack is empty
		if (stack.isEmpty())
			System.out.println("Stack Is Empty");
		else
			System.out.println("Stack Is Not Empty");
	}
		
}