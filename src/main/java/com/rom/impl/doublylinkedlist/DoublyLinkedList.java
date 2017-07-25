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

}
