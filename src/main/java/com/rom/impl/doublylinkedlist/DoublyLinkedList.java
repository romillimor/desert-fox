package com.rom.impl.doublylinkedlist;

public class DoublyLinkedList {

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
			newNode.prev = pointer;
			pointer.next = newNode;
		}
	}

	public void addAtIndex(int index, int data) {

		Node newNode = new Node(data);
		Node pointer = head;
		int counter = 0;
		if (index > this.size() - 1 || index < 0)
			System.out.println("Invalid Index!");
		else if (index == 0) {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		} else {
			while (counter < index) {
				pointer = pointer.next;
				counter++;
			}
			newNode.prev = pointer.prev;
			newNode.next = pointer;
			pointer.prev.next = newNode;
			pointer.prev = newNode;

		}

	}

	public int size() {
		Node pointer = head;
		int count = 1;
		if (head == null)
			count = 0;
		else if (head.next == null)
			count = 1;
		else {
			while (pointer.next != null) {
				pointer = pointer.next;
				count++;
			}
		}
		return count;

	}

	public boolean isEmpty() {

		if (head == null)
			return true;
		else
			return false;

	}

	public void delete() {
		Node pointer = head;
		if (head == null)
			System.out.println("List is empty!");
		else if (head.next == null)
			head = null;
		else {
			while (pointer.next.next != null) {
				pointer = pointer.next;
			}
			pointer.next.prev = null;
			pointer.next = null;

		}
	}

	public void print() {
		Node pointer = head;
		String temp = Integer.toString(head.data);
		while (pointer.next != null) {
			pointer = pointer.next;
			temp = temp + " <--> " + pointer.data;
		}
		System.out.println(temp);

	}
}
