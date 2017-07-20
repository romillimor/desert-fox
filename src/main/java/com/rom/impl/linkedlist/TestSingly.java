package com.rom.impl.linkedlist;

public class TestSingly {

	
	public static SinglyLinkedList createNewLinkedList(int[] input) {
		
		SinglyLinkedList List = new SinglyLinkedList();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.addInFront(0);
		List.add(5);
		List.addAtIndex(0, 44);
		List.addAtIndex(2,22);
		List.deleteAtIndex(0);
		return List;
	}
	
	
	public static void main(String[] args) {
		
		int[] p = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		SinglyLinkedList SList = createNewLinkedList(p);
		SList.print();
		System.out.println("Size of Linked List: " + SList.size());
		System.out.println("Is List Empty? " + SList.isEmpty());
		
	}
}
