package com.rom.impl.doublylinkedlist;

public class ImplDoubly {

	public static void main(String[] args) {

		DoublyLinkedList dList = new DoublyLinkedList();
		dList.add(56);
		dList.add(22);
		dList.add(12);
		dList.print();
		dList.addAtIndex(0, 550);
		dList.print();
		System.out.println(dList.size() + " " + " " + dList.isEmpty());

	}

}
