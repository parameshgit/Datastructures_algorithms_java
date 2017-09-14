package datastructures;

public class StackDynamicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackDynamic stackDynamic = new StackDynamic(8);

		System.out.println("Stack initical capacity:"+stackDynamic.stackRep.length);
		
		stackDynamic.push(10);
		stackDynamic.push(20);
		stackDynamic.push(30);
		System.out.println("size:" + stackDynamic.size());
		System.out.println(stackDynamic);
		stackDynamic.push(40);
		stackDynamic.push(40);
		stackDynamic.push(40);
		stackDynamic.push(40);
		System.out.println("size:" + stackDynamic.size());

		// StackDynamic.pop();
		System.out.println(stackDynamic);
		System.out.println(stackDynamic.top());
		System.out.println(stackDynamic);
		for(int i=0;i<5;i++)
		System.out.println(stackDynamic.pop());
		System.out.println(stackDynamic);
		
		System.out.println("Stack last capacity:"+stackDynamic.stackRep.length);

	}

}
