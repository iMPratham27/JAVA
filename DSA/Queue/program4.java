
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class StackUsingQueue{

	Queue<Integer> q = new LinkedList<Integer>();

	void push(int data){
	
		int size = q.size();
		q.add(data); // Add new element at the rear

		// Move all previous elements behind the new one
		for(int i=0; i<size; i++){
			q.add(q.poll());
		}
		/*
  			Suppose the queue has: [10, 20, 30] (10 is front).
			You push 40:
				Add 40: [10, 20, 30, 40]
				Rotate previous size elements:
					Remove 10 and add to rear → [20, 30, 40, 10]
					Remove 20 and add to rear → [30, 40, 10, 20]
					Remove 30 and add to rear → [40, 10, 20, 30]
  		*/
	}

	int pop(){
		
		if(q.isEmpty()){
		
			System.out.println("Stack is empty");
			return -1;
		}

		return q.poll(); // Removes front
	}

	int top(){
	
		if(q.isEmpty()){
		
			System.out.println("Stack is empty");
			return -1;
		}

		return q.peek();
	}

	boolean empty(){
	
		if(q.isEmpty()){
		
			return true;
		}else{
		
			return false;
		}
	}

	void printStack(){
		
		if(q.isEmpty()){
		
			System.out.println("Stack is empty");
		}else{
		
			System.out.println(q);
		}
	}

	public static void main(String[] args){
	
		StackUsingQueue stack = new StackUsingQueue();

		Scanner sc = new Scanner(System.in);
		
		char ch;

		do{
		
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.top");
			System.out.println("4.empty");
			System.out.println("5.printStack");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch(choice){
			
				case 1: {
						System.out.print("Enter data to add: ");
						int data = sc.nextInt();
						stack.push(data);
					}
					break;

				case 2: {
						int popEle = stack.pop();
						if(popEle != -1){
						
							System.out.println(popEle + " popped");
						}
					}
					break;

				case 3: {
						int topEle = stack.top();
						if(topEle != -1){
						
							System.out.println("top : " + topEle);
						}
					}
					break;

				case 4: {
						boolean ret = stack.empty();
						if(ret == true){
						
							System.out.println("Stack is empty");
						}else{
						
							System.out.println("Stack is not empty");
						}
					}
					break;

				case 5: {
						stack.printStack();
					}
					break;
						
				default: 
					System.out.println("Wrong choice");
					break;

			}

			System.out.print("Do you want to continue? ");
			ch = sc.next().charAt(0);

		}while(ch == 'Y' || ch == 'y');


	}
}
