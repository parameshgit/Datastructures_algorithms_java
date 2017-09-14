package com.stack.implementations;

public class Stack {

	public static final int DEFAULT_CAPACITY = 10;
	int capacity;
	int top = -1;

	int stackRep[];

	Stack() {
		this(DEFAULT_CAPACITY);

	}

	Stack(int capacity) {
		this.capacity = capacity;

		stackRep = new int[capacity];
	}

	// Push method
	// 1.Need to check whether it is full or not .If full need to raise an exception
	// (We can create a customized exception.For now i am not creating it).
	// 2.If it's not full then do top++ and add an element to stackRep[]
	// 3.This method doen't return anything

	// 4.For knowing whether stack is full or not we need to use size method

	public int size() {
		return top + 1;
	}

	public void push(int data) {
		if (size() == capacity)
			throw new RuntimeException("Stack is full");
		else
			stackRep[++top] = data;

	}

	// top method

	// 1.if stack is empty it throws an exception as stack is empty
	// 2.else it returns top value

	public int top() {
		if (size() == 0)
			throw new RuntimeException("Stack is Empty");
		else
			return stackRep[top];

	}

	// pop method
	// 1.if stack is empty then it throws an exception as stack is empty
	// 2.if stack is not empty then need to assign top value to a variable.
	// 3.then remove the last value and assign default value to old top value

	public int pop() {
		if (size() == 0)
			throw new RuntimeException("Stack is Empty");
		else {
			int removed_value = stackRep[top];

			stackRep[top--] = Integer.MIN_VALUE;
			return removed_value;
		}

	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();

		buffer.append("[");

		if (size() > 0)
			buffer.append(stackRep[0]);
		if (size() > 1) {
			for (int i = 1; i < size(); i++)
				buffer.append("," + stackRep[i]);
		}

		buffer.append("]");

		return buffer.toString();

	}

}
