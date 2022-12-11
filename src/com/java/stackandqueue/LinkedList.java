package com.java.stackandqueue;

/**
 * Class to create LinkedList with different methods
 *
 */
public class LinkedList {
	Node head;
	/*
	 * Without LinkedList node can't exists so thats why  inside LinkedList  Class we created Node class
	 */
	class Node {
		Object data;
		Node ref;

		Node(Object data) {
			this.data = data;
		}
	}
	/*
	 * Method Name:addFirst
	 * Logic for adding Data to the first like 
	 * 70
     * 30=>70
     * 56=>30=>70
	 */
	public void addFirstNode(Object data) {
		Node newNode = new Node(data);
		newNode.ref = head;
		head = newNode;
	}
	/*Method Name:addLast
	 * Logic for adding data for Last like
	 * 56
	 * 56=>30
     * 56=>30=>70
	 */

	public void addLast(Object data) {
		Node newNode = new Node(data);
		Node temp = head;
		if (head == null)
			head = newNode;
		else if (head.ref == null)
			head.ref = newNode;
		else {
			while (temp.ref != null) {
				temp = temp.ref;
			}
			temp.ref = newNode;
		}
	}
	/*
	 * Method Name=deleteFirst
	 * Logic for deleting the first element
	 */
	public void deleteFirst()
	{
		head = head.ref;
	}
	/*
	 * Logic for displaying the added elements
	 */
	public void display() {
		if (head==null) {
			System.out.println("List is empty");
		}
			
			Node temp=head;
			while(temp != null) {
				if(temp.ref != null)
					System.out.print(temp.data+"=>");
				else
					System.out.println(temp.data);
			   temp =temp.ref;
		}
	}
}
