package org.cdac.utils;

public class LinkedList {
	Node start;
	Node end;
	Node current;
	int maxCount;

	public void add(Object data) {
		Node tmpNode = new Node(data);
		
		if(start == null) {
			start = end = current = tmpNode;
		}
		else {
			end.next = tmpNode;
			tmpNode.previous = end;
			end = tmpNode;
		}
		maxCount++;
		
	}
	
	public StringBuffer getFirst() {
		StringBuffer listBuffer = new StringBuffer();
		if(start == null)
			return null;
		current = start;
		listBuffer.append(current.data);
		return listBuffer;
	}
	
	public Object getLast() {
		if(end == null)
			return null;
		current = end;
		return current.data;
	}
	
	public StringBuffer getNext() {
		StringBuffer listBuffer = new StringBuffer();
		if(current.next == null)
			return null;
		else {
			current = current.next;
			listBuffer.append(current.data);
			return listBuffer;
		}
	}
	
	public Object getPrevious() {
		if(current.previous == null)
			return null;
		else {
			current = current.previous;
			return current.data;
		}
	}
	
	public StringBuffer displayList() {
		StringBuffer listBuffer = new StringBuffer();
		if(start == null)
			System.out.println("nothing here");
		else {
			current = start;
			while(current!=null) {
				listBuffer.append(current.data);
				listBuffer.append("\n");
				current = current.next;
			}
		}
		return listBuffer;
	}
	
}
