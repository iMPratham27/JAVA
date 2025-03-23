
// create BST

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

class BST{

	public static Node insert(Node root, int val){
	
		if(root == null){
		
			root = new Node(val);
			return root;
		}

		if(val < root.data){
		
			root.left = insert(root.left,val);
		}else{
		
			root.right = insert(root.right, val);
		}

		return root;
	}

	public static void inOrder(Node root){
	
		if(root == null){
		
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static boolean search(Node root, int key){
	
		if(root == null){
		
			return false;
		}

		if(key < root.data){
		
			return search(root.left, key);
		
		}else if(root.data == key){
		
			return true;
		
		}else{
		
			return search(root.right, key);
		}
	}

	public static Node delete(Node root, int val){
	
		if(val < root.data){
		
			root.left = delete(root.left,val);
		
		}else if(val > root.data){
		
			root.right = delete(root.right,val);
		
		}else{ // val == root.data(here we found the node we want to delete)
		
			//case 1
			if(root.left == null && root.right == null){
			
				return null;
			}

			//case 2
			if(root.left == null){
			
				return root.right;

			}else if(root.right == null){
			
				return root.left;
			
			}

			//case 3
			Node IS = inorderSuccessor(root.right);
			root.data = IS.data;
			root.right = delete(root.right,IS.data);
		}

		return root;
	}

	public static Node inorderSuccessor(Node root){
	
		while(root.left != null){
		
			root = root.left;
		}

		return root;
	}

	public static void printInRange(Node root, int x, int y){
	
		if(root == null){
		
			return;
		}

		if(root.data >= x && root.data <= y){
		
			printInRange(root.left,x,y);
			System.out.print(root.data + " ");
			printInRange(root.right,x,y);
		
		}else if(root.data > y){
		
			printInRange(root.left,x,y);
		
		}else{
		
			printInRange(root.right,x,y);
		}
	}

	public static void printRootToLeaf(Node root, ArrayList<Integer> path){
	
		if(root == null){
		
			return;
		}

		path.add(root.data);

		if(root.left == null && root.right == null){ //leaf
		
			printPath(path);
		
		}else{
		
			printRootToLeaf(root.left,path);
			printRootToLeaf(root.right,path);	
		}

		path.remove(path.size()-1);
	}

	public static void printPath(ArrayList<Integer> path){
	
	
		for(int i=0; i<path.size(); i++){
		
			System.out.print(path.get(i) + "->");
		}
		System.out.println();
	}



	public static void main(String[] args){
	
		int values[] = new int[]{8,5,3,1,4,6,10,11,14};

		Node root = null;

		for(int i=0; i<values.length; i++){
		
			root = insert(root,values[i]);
		}

		inOrder(root);
		System.out.println();

		if(search(root,3)){
		
			System.out.println("Node found");
		}else{
		
			System.out.println("Node not found");
		}

		inOrder(root);
		System.out.println();
		delete(root,5);
		inOrder(root);
		System.out.println();

		printInRange(root,6,10);
		System.out.println();

		printRootToLeaf(root, new ArrayList<>());
	}
}




