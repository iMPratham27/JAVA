
// Two Stack using an Array

import java.util.*;

class TwoStacks{

	int stackArr[];
	int top1;
	int top2;
	int maxSize;

	TwoStacks(int size){
	
		this.stackArr = new int[size];
		this.maxSize = size;
		this.top1 = -1;
		this.top2 = size;
	}

	// PUSH1
	void push1(int data){
	
		if(top2 - top1 > 1){
		
			top1++;
			stackArr[top1] = data;
		}else{
		
			System.out.println("Stack Overflow!");
		}
	}

	// PUSH2
	void push2(int data){
	
		if(top2 - top1 > 1){
		
			top2--;
			stackArr[top2] = data;
		}else{
		
			System.out.println("Stack Overflow!");
		}
	}

	// POP1
	int pop1(){
	
		if(top1 == -1){
		
			System.out.println("Stack1 is Empty");
			return -1;
		}else{
		
			int val = stackArr[top1];
			top1--;
			return val;
		}
	}

	// POP2
	int pop2(){
	
		if(top2 == maxSize){
		
			System.out.println("Stack2 is Empty");
			return -1;
		}else{
		
			int val = stackArr[top2];
			top2++;
			return val;
		}
	}

}

class Client{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();

		TwoStacks obj = new TwoStacks(size);

		char ch;

		do{
			System.out.println("1.push1");
			System.out.println("2.push2");
			System.out.println("3.pop1");
			System.out.println("4.pop2");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch(choice){
			
				case 1: {
				
						System.out.print("Enter element for stack1: ");
						int data = sc.nextInt();
						obj.push1(data);
					}
					break;

				case 2: {
				
						System.out.print("Enter element for stack2: ");
						int data = sc.nextInt();
						obj.push2(data);
					}
					break;

				case 3: {
				
						int ret = obj.pop1();

						if(ret != -1){
						
							System.out.println(ret +" popped from stack1");
						}
					}
					break;

				case 4: {
				
						int ret = obj.pop2();

						if(ret != -1){
						
							System.out.println(ret + " popped from stack2");
						}
					}
					break;

				default: 
					System.out.println("Wrong choice");
					break;
			}

			System.out.print("Do you want to Continue?");
			ch = sc.next().charAt(0);
		
		}while(ch=='y' || ch=='Y');
	}
}
