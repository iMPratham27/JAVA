
// Reverse LinkedList

class Node{

	int data;
	Node next = null;

	Node(int data){
	
		this.data = data;
	}
}

class LinkedList{

	Node head = null;

	void addFirst(int data){
	
		Node newNode = new Node(data);

		if(head == null){
		
			head = newNode;
		}else{
		
			newNode.next = head;
			head = newNode;
		}
	}

	// Iterative reverse
	void reverseIterate(){
	
		// when linkedlist is empty or contains only single node
		if(head == null || head.next == null){
		
			return;
		}

		Node prev = head;
		Node curr = head.next;

		while(curr != null){
		
			Node next = curr.next;

			curr.next = prev;//reverse

			//update
			prev = curr;
			curr = next;
		}

		head.next = null; // old original head to null
		head = prev; // new head
	}

	// Recursive reverse
	Node reverseRecursive(Node head){
	
		if(head == null || head.next == null){
		
			return head;
		}

		// recursive call
		Node newHead = reverseRecursive(head.next);

		Node front = head.next;
		front.next = head;// reverse
		head.next = null; // old head to null

		return newHead;
	}

	void printLL(){
	
		if(head == null){
		
			System.out.println("Empty Linkedlist");
			return;
		}

		Node temp = head;
		while(temp != null){
		
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}
}

class Client{

	public static void main(String[] args){
	
		LinkedList ll = new LinkedList();

		ll.addFirst(40);
		ll.addFirst(30);
		ll.addFirst(20);
		ll.addFirst(10);
		ll.printLL();

		ll.reverseIterate();
		ll.printLL();

		ll.head = ll.reverseRecursive(ll.head);
		ll.printLL();
	}
}
