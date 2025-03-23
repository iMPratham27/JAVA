
// construct binary tree using preorder array

import java.util.*;

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

	void levelOrderTraversal(TreeNode root){

        	if(root == null){
            		return;
        	}
        	
		Queue<TreeNode> q = new LinkedList<>();
        	q.add(root);
        	q.add(null);

        	while(!q.isEmpty()){
            		TreeNode currNode = q.remove();

            		if(currNode == null){

                		System.out.println();

                		if(q.isEmpty()){
                    			break;
                		}else{
                    			q.add(null);
                		}

            		}else{

                		System.out.print(currNode.data);

                		if(currNode.left != null){
                    			q.add(currNode.left);
                		}

                		if(currNode.right != null){
                    			q.add(currNode.right);
                		}
            		}
        	}
    	}

	
	int sumOfNodes(TreeNode root){
        	
		if(root == null){
            		return 0;
        	}

        	return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
    	}

	
	int heightOfTree(TreeNode root){

        	if(root == null){
            		return 0;
        	}

        	int leftHeight = heightOfTree(root.left);
        	int rightHeight = heightOfTree(root.right);

        	int myHeight = 0;
        	if(leftHeight > rightHeight){
            		myHeight = leftHeight;
        	}else{
            		myHeight = rightHeight;
        	}

        	return myHeight+1;

    	}


	// O(n^2)
	int diameterOfTree(TreeNode root){

		if(root == null){
			return 0;
		}

		int diam1 = diameterOfTree(root.left);
		int diam2 = diameterOfTree(root.right);
		int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

		return Math.max(diam3, Math.max(diam1,diam2));
	}

	// O(n)
	class TreeInfo{
		int ht;
		int diam;

		TreeInfo(int ht, int diam){
			this.ht = ht;
			this.diam = diam;
		}
	}
	TreeInfo diameterTree(TreeNode root){

		if(root == null){
			return new TreeInfo(0, 0);
		}

		TreeInfo left = diameterTree(root.left);
		TreeInfo right = diameterTree(root.right);

		int myHeight = Math.max(left.ht, right.ht) + 1;

		int diam1 = left.diam;
		int diam2 = right.diam;
		int diam3 = left.ht + right.ht + 1;

		int myDiam = Math.max(diam3, Math.max(diam1, diam2));

		TreeInfo myInfo = new TreeInfo(myHeight, myDiam);

		return myInfo;
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

		int sum = bt.sumOfNodes(root);
		System.out.println("Total sum: " + sum);

        	int height = bt.heightOfTree(root);
		System.out.println("Height: " + height);

		int diameter = bt.diameterOfTree(root);
		System.out.println("Diameter: " + diameter);

		System.out.println("Diameter: " + bt.diameterTree(root).diam);
	}
}
