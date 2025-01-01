
// Merge Two Sorted Stacks into Third Stack


import java.util.*;

class MergeStacks{

	Stack<Integer> mergeStacks(Stack<Integer> s1, Stack<Integer> s2){
	
		// store all elements in s3
		Stack<Integer> s3 = new Stack<Integer>();

		// check elements from both stacks, whichever is greater -> push into s3
		while(!s1.empty() && !s2.empty()){
		
			if(s1.peek() > s2.peek()){
			
				s3.push(s1.pop());
			}else{
			
				s3.push(s2.pop());
			}
		}

		// push remaining elements of s1 into s3
		while(!s1.empty()){
		
			s3.push(s1.pop());
		}

		// push remaining elements of s2 into s3
		while(!s2.empty()){
		
			s3.push(s2.pop());
		}

		// if we return s3 then it will show elements in descending order(top will be 1 but we need top = 10)

		//we will put all s3 elements into s2 as s2 is empty now
		while(!s3.empty()){
		
			s2.push(s3.pop());
		}

		return s2;
	}

}

class Client{

	public static void main(String[] args){
	
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();

		s1.push(1);
		s1.push(3);
		s1.push(5);
		s1.push(7);

		s2.push(2);
		s2.push(4);
		s2.push(6);
		s2.push(8);
		s2.push(10);

		MergeStacks ms = new MergeStacks();

		Stack s3 = ms.mergeStacks(s1,s2);

		System.out.println(s3);

	}

}
