package org.cdac.utils;

public class Entry {

	public static void main(String[] args) {
		LinkedList objLL = new LinkedList();
		objLL.add(80);
		objLL.add(70);
		objLL.add(60);
		objLL.add(50);
		objLL.add(40);
		objLL.add(30);
		
		StringBuffer listBuffer = objLL.displayList();
		System.out.println(listBuffer);
		
		System.out.println("****");

		System.out.println("First item "+objLL.getFirst());
		System.out.println("Next item "+objLL.getNext());
		System.out.println("****");

		System.out.println("Previous item "+objLL.getPrevious());
		System.out.println("Last item "+objLL.getLast());
	}

}
