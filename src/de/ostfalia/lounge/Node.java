package de.ostfalia.lounge;

public class Node {
	private int data;
	private Node next;

	public Node() {
	}

	public Node(int data) {
	}

	public Node(int data, Node next) {
	}

	public int getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String toString() {
		return "";
	}
}
