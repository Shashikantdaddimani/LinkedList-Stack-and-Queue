package com.java.stackandqueue;

/**
 * Class to create Stack with different methods
 * 
 */
public class Stack {
	/*
	 * creating the LinkedList class object
	 */
	LinkedList list = new LinkedList();

	public void push(Object data) {
		list.addLast(data);
	}

	public void display() {
		list.display();
	}

	/*
	 * Program execution starts from main method
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the LinkedList Stack and Queue Program");
		Stack stack = new Stack();
		stack.push(56);
		stack.display();
		stack.push(30);
		stack.display();
		stack.push(70);
		stack.display();
	}

}
