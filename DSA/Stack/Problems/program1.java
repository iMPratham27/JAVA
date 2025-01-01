

// Reverse a String using Stack

import java.util.*;

class ReverseString{

	String revString(String str){
	
		// we are using predefined Stack given by JAVA
		Stack<Character> s = new Stack<Character>();

		// here we are adding each charcter into the stack
		for(int i=0; i<str.length(); i++){
		
			s.push(str.charAt(i));
		}

		// we will pop the chacters from stack and store it into the arrary
		char stackArr[] = new char[str.length()];

		int i=0; // i iterate over the array and store the character at proper index of array
		while(!s.empty()){
		
			stackArr[i] = s.pop();
			i++;
		}

		return new String(stackArr);
		//we can not directly pass the character array becoz we are storing into the String
		//String rev = obj.revString(str);
	}

}

class Client{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String str = sc.next();

		ReverseString obj = new ReverseString();
		String rev = obj.revString(str);

		System.out.println("Reversed String: "+ rev);
	}
}
