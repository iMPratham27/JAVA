
// "Predefined Stack" present in "util" package


import java.util.*;

class StackDemo{

	public static void main(String[] args){
	
		Stack<Integer> s = new Stack<Integer>();
		
		// push() - to add a number to a stack
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

		System.out.println(s);
		
		// pop() - to remove top element from a stack
		s.pop();
		
		System.out.println("Removed top element: "+ s);
		
		System.out.println("size: "+ s.size());

		System.out.println("top element: "+ s.peek());// peek() just give top element but does not remove it

		System.out.println(s);
	}
}
