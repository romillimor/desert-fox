package com.rom.impl.linkedlist;

public class SinglyLinkedList {

	Node head;

	public void add(int data) {

		Node newNode = new Node(data);
		Node pointer = head;

		if (head == null) {
			head = newNode;
		} else {

			while (pointer.next != null) {
				pointer = pointer.next;
			}
			pointer.next = newNode;
			newNode.next = null;
		}
	}

	public void addInFront(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {

			newNode.next = head;
			head = newNode;
		}
	}

	public void delete() {
		Node pointer = head;
		if (head == null)
			System.out.println("LinkedList is already empty!");
		else if (head.next == null)
			head = null;
		else {
			while (pointer.next.next != null) {
				pointer = pointer.next;
			}
			pointer.next = null;
		}
	}

	public void addAtIndex(int index, int data) {
		Node pointer = head;
		Node newNode = new Node(data);
		if (head == null) head = newNode;
		else if (this.size() < index + 1)
			System.out.println("Invalid index!");
		else if (index == 0) {
			newNode.next = head.next;
			head = newNode;
		}
		else {
			int i = 0;
			while (i < index - 1) {
				pointer = pointer.next;
				i++;
			}
			newNode.next = pointer.next;
			pointer.next = newNode;

		}

	}

	public void deleteAtIndex(int index) {
		Node pointer = head;
		if (head == null) System.out.println("Node is already empty.");
		else if (this.size() < index + 1) System.out.println("Invalid index!");
		else if (index == 0) { 
			head = head.next;
		}
		else {
			int i = 0;
			while (i < index - 1) {
				pointer = pointer.next;
				i++;
			}
			pointer.next = pointer.next.next;
			
			
		}
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public int size() {
		int count = 0;
		Node pointer = head;
		if (head == null)
			count = 0;
		else if (head.next == null)
			count = 1;
		else {

			while (pointer != null) {
				pointer = pointer.next;
				count++;
			}
		}

		return count;
	}

	public void print() {
		Node pointer = head;
		String temp = Integer.toString(head.data);
		while (pointer.next != null) {
			pointer = pointer.next;
			temp = temp + " --> " + pointer.data;
		}
		System.out.println(temp);

	}

}
