package com.stack.implementations;

public class LinkedListStack {

	public int length;
	public ListNode top = null;

	public LinkedListStack() {
		length = 0;

	}

	public void push(int data) {
		ListNode listNode = new ListNode(data);

		listNode.setNext(top);

		top = listNode;
		length++;
	}

	public int pop() {

		if (isEmpty())
			throw new RuntimeException("Stack is Empty");
		int result = top.getData();

		top = top.getNext();
		length--;
		return result;
	}

	public int top() {
		if (isEmpty())
			throw new RuntimeException("Stack is Empty");

		return top.getData();

	}

	public boolean isEmpty() {

		return length == 0;

	}

	public String toString() {

		String result = "{";

		ListNode listNode = top;
		if (listNode != null) {
			result += listNode.getData();
			listNode = listNode.getNext();
		}

		while (listNode != null) {
			result += "," + listNode.getData();
			listNode = listNode.getNext();

		}

		return result + "}";
	}

}
