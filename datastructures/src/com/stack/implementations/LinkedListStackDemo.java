package com.stack.implementations;

public class LinkedListStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListStack linkedListStack = new LinkedListStack();

		linkedListStack.push(10);
		linkedListStack.push(20);
		System.out.println(linkedListStack);

		linkedListStack.pop();
		linkedListStack.pop();
		linkedListStack.pop();
		System.out.println(linkedListStack);

	}

}
