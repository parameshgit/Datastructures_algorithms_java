package com.stack.implementations;

public class StackTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack=new Stack(5);
		
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);


		
		//stack.pop();
		System.out.println(stack);
        System.out.println(stack.top());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        
 		
	}

}
