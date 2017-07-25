package com.rom.impl.linkedlist;

public class TestSingly {

	

	
	public static void main(String[] args) {
		
		//int[] p = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		SinglyLinkedList SList = new SinglyLinkedList();
		SList.add(10);
		SList.add(20);
		SList.addAtIndex(2,500);
		//SList.addInFront(500);
		SList.print();
		System.out.println("Size of Linked List: " + SList.size());
		System.out.println("Is List Empty? " + SList.isEmpty());
		
	}
}
