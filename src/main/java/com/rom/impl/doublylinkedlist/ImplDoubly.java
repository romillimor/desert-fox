package com.rom.impl.doublylinkedlist;

public class ImplDoubly {

	public static void main(String[] args) {

		DoublyLinkedList dList = new DoublyLinkedList();
		dList.add(56);
		dList.add(22);
		dList.add(200);
		dList.add(12);
		dList.addAtIndex(2, 550);
		dList.print();
		dList.deleteAtIndex(0);
		dList.print();
		System.out.println(dList.size() + " " + " " + dList.isEmpty());

	}

}
