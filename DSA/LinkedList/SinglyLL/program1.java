
class Node{

	int data;
	Node next = null;

	Node(int data){
	
		this.data = data;
	}
}

class LinkedList{

	Node head = null;
	
	//add node at First
	void addFirst(int data){
	
		Node newNode = new Node(data);

		if(head == null){
		
			head = newNode;
		}else{
		
			newNode.next = head;
			head = newNode;
		}
	}


	//add node at Last
	void addLast(int data){
	
		Node newNode = new Node(data);

		if(head == null){
		
			head = newNode;
		}else{
		
			Node temp = head;

			while(temp.next != null){	// this will find the last node
			
				temp = temp.next;
			}
			temp.next = newNode;	// this will connect the newNode to last node
		}
	}


	//count total number of nodes
	int countNode(){
	
		Node temp = head;
		int count = 0;

		while(temp != null){
		
			count++;
			temp = temp.next;
		}

		return count;
	}	


	//add at a given position
	void addAtPos(int pos, int data){	// pos always starts from 1
	
		if(pos <= 0 || pos >= countNode()+2){
		
			System.out.println("Wrong Input");
			return;
		}

		if(pos == 1){
		
			addFirst(data);

		}else if(pos == countNode()+1){
		
			addLast(data);

		}else{
			
			Node newNode = new Node(data);

			Node temp = head;

			while(pos-2 != 0){
		
				temp = temp.next;
				pos--;
			}

			newNode.next = temp.next;	// here 25 -> 10
			temp.next = newNode;		// here 20 -> 15
		}
	}

	
	//delete first node
	void delFirst(){
	
		if(head == null){
		
			System.out.println("Empty LinkedList");
			return;
		}

		if(countNode() == 1){
		
			head = null;

		}else{
		
			head = head.next;// Garbage collector will take the first node & connect head to second node
		}
	}


	//delete last node
	void delLast(){
	
		if(head == null){
		
			System.out.println("Empty LinkedList");
			return;
		}

		if(countNode() == 1){
		
			head = null;

		}else{
		
			Node temp = head;

			while(temp.next.next != null){
			
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	
	//delete at given position
	void delAtPos(int pos){
	
		if(pos <= 0 || pos >= countNode()+1){
		
			System.out.println("Wrong Input");
			return;
		}

		if(pos == 1){
		
			delFirst();

		}else if(pos == countNode()){
		
			delLast();

		}else{
		
			Node temp = head;

			while(pos-2 != 0){
			
				temp = temp.next;
				pos--;
			}

			temp.next = temp.next.next;
		}
	}


	//print SinglyLinkedList
	void printSLL(){
	
		if(head == null){
		
			System.out.println("Empty LinkedList");
		}else{
		
			Node temp = head;	// temp is used to traverse the linked list

			while(temp != null){
			
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println();

			//OR

			/*while(temp.next != null){	// here last data will not print as last node has next=null
							
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println(temp.data);	// here we print last data
			*/
		}
	}
}

class Client{

	public static void main(String[] args){
	
		LinkedList ll = new LinkedList();

		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);

		ll.printSLL();

		ll.addLast(15);
		ll.printSLL();

		ll.addAtPos(3,25);
		ll.printSLL();

		ll.delFirst();
		ll.printSLL();

		ll.delLast();
		ll.printSLL();

		ll.delAtPos(2);
		ll.printSLL();
	}
}
