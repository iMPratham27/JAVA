
import java.util.*;

class Node{

	int data;
	Node left;
	Node right;

	Node(int data){
	
		this.data = data;
		left = right = null;
	}
}

class BinaryTree{

	Scanner sc = new Scanner(System.in);

	Node constructBT(){
	
		System.out.print("Enter data for Node: ");
		int data = sc.nextInt();

		Node newNode = new Node(data);

		System.out.print("Do you want to enter node at left side of "+newNode.data+" : ");
		char leftNode = sc.next().charAt(0);

		if(leftNode == 'y' || leftNode == 'Y'){
		
			newNode.left = constructBT();
		}


		System.out.print("Do you want to enter node at right side of "+newNode.data+" : ");
		char rightNode = sc.next().charAt(0);

		if(rightNode == 'y' || rightNode == 'Y'){
		
			newNode.right = constructBT();
		}

		return newNode;
	}

	void preOrder(Node root){
	
		if(root == null)
			return;

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	void inOrder(Node root){
	
		if(root == null)
			return;

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	void postOrder(Node root){
	
		if(root == null)
			return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void main(String[] args){
	
		Node root = null;

		BinaryTree bt = new BinaryTree();
		root = bt.constructBT();

		char ch;
		do{
			System.out.println("How do you want to print the tree?");
			System.out.println("1. Pre-Order");
			System.out.println("2. In-Order");
			System.out.println("3. Post-Order");

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch(choice){
			
				case 1: {
				
						bt.preOrder(root);
						System.out.println();
					}
					break;

				case 2: {
				
						bt.inOrder(root);
						System.out.println();
					}
					break;

				case 3: {
				
						bt.postOrder(root);
						System.out.println();
					}
					break;

				default: {
				
						 System.out.println("Wrong choice!");
					}
					break;
			}

			System.out.print("Do you want to continue? ");
			ch = sc.next().charAt(0);
		
		}while(ch == 'y' || ch == 'Y');
	}
}
