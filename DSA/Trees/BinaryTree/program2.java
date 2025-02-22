
// construct binary tree using preorder array

class TreeNode{

	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data){
	
		this.data = data;
		left = right = null;
	}
}

class BinaryTree{

	int index = -1;

	TreeNode constructBT(int nodeArr[]){
	
		index++;

		if(nodeArr[index] == -1){
		
			return null;
		}

		TreeNode newNode = new TreeNode(nodeArr[index]);

		newNode.left = constructBT(nodeArr);
		newNode.right = constructBT(nodeArr);

		return newNode;

	}

	void preOrderBT(TreeNode root){
	
		if(root == null)
			return;

		System.out.print(root.data + " ");
		preOrderBT(root.left);
		preOrderBT(root.right);
		
	}

	void inOrderBT(TreeNode root){
	
		if(root == null)
			return;

		inOrderBT(root.left);
		System.out.print(root.data + " ");
		inOrderBT(root.right);
	}

	void postOrderBT(TreeNode root){
	
		if(root == null)
			return;

		postOrderBT(root.left);
		postOrderBT(root.right);
		System.out.print(root.data + " ");
	}

	int countNodes(TreeNode root){
	
		if(root == null)
			return 0;

		int leftSTNodes = countNodes(root.left);
		int rightSTNodes = countNodes(root.right);

		return leftSTNodes + rightSTNodes + 1;

	}

	public static void main(String[] args){
	
		// -1 => null
		int nodeArr[] = new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

		BinaryTree bt = new BinaryTree();

		TreeNode root = bt.constructBT(nodeArr);

		bt.preOrderBT(root);
		System.out.println();
		
		bt.inOrderBT(root);
		System.out.println();
		
		bt.postOrderBT(root);
		System.out.println();

		int count = bt.countNodes(root);
		System.out.println("Total Count: " + count);
	}
}
