package de.ostfalia.lounge;

public class Listen{
	private Node head = null;
	private Node tail = null;
	private int listCount;

	public boolean isEmpty() {
		return (head == null);
	}
	public void insert(int data) {
		if(head == null) {
			head = new Node(data);
			tail = head;
		} else {
			Node fresh = new Node(data,head);
			head = fresh;
		}
		listCount++;
	}
	public boolean add(int data) {
		if (head == null) {
			head = new Node(data);
			tail = head;
		} else {
			Node fresh = new Node(data);
			tail.setNext(fresh);
			tail = fresh;
		}
		listCount++;
		return true;
	}
	public Node remove (int index) {
		if (index<1||index> this.listCount) {
			return null;
		}
		if (index == 1) {
			Node result = head;
			head=head.getNext();
			if(head == tail) {
				tail = null;
			}
			result.setNext(null);
			listCount--;
			return result;
		}
		Node current = head;
		for (int i = 0; i < index-1; i++) {
			current = current.getNext();
		}
		Node result = current.getNext();
		Node new_next = result.getNext();
		current.setNext(new_next);
		if(result==tail) {tail = current;}
		listCount--;
		result.setNext(null);
		return result;
	}
}
