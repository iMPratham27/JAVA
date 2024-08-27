
class Node{

	Node prev = null;
	int data;
	Node next = null;

	Node(int data){
	
		this.data = data;
	}
}

class DoublyLinkedList{

	Node head = null;
	
	//add node at First
	void addFirst(int data){
	
		Node newNode = new Node(data);

		if(head == null){
		
			head = newNode;
		}else{
		
			newNode.next = head;
			head.prev = newNode;
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

			while(temp.next != null){
			
				temp = temp.next;
			}

			temp.next = newNode;
			newNode.prev = temp;
		}	
	}


	//count total number of nodes
	int countNode(){
	
		int count = 0;

		if(head == null){
		
			System.out.println("Empty LinkedList");
			return count;
		}else{
	
			Node temp = head;	
			while(temp != null){
			
				count++;
				temp = temp.next;
			}
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
			
			newNode.prev = temp;		// 30 <- 25
			newNode.next = temp.next;	// 25 -> 20
			temp.next = newNode;		// 30 -> 25
			newNode.next.prev = newNode;	// 25 <- 20
		}
	}

	
	//delete first node
	void delFirst(){
	
		if(head == null){
		
			System.out.println("Empty LinkedList");

		}else if(countNode() == 1){
		
			head = null;
		}else{
		
			head = head.next;
			head.prev = null;	// because node also has prev and you have to make it null
		}
	}


	//delete last node
	void delLast(){
	
		if(head == null){
		
			System.out.println("Empty LinkedList");

		}else if(countNode() == 1){
		
			head = null;
		}else{
		
			Node temp = head;

			while(temp.next != null){
			
				temp = temp.next;
			}

			temp.prev.next = null;
			temp.prev = null;
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
			temp.next.prev = temp;
		}
	}


	//print SinglyLinkedList
	void printDLL(){
	
		if(head == null){
		
			System.out.println("Empty LinkedList");
			return;
		}else{
		
			Node temp = head;

			while(temp != null){
			
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}

class Client{

	public static void main(String[] args){
	
		DoublyLinkedList ll = new DoublyLinkedList();

		ll.addFirst(50);
		ll.addFirst(40);
		ll.addFirst(30);
		ll.addFirst(20);
		ll.addFirst(10);
		ll.printDLL();

		ll.addLast(35);
		ll.printDLL();

		int totalCount = ll.countNode();
		System.out.println(totalCount);

		ll.addAtPos(2,25);
		ll.printDLL();

		ll.delFirst();
		ll.printDLL();

		ll.delLast();
		ll.printDLL();

		ll.delAtPos(2);
		ll.printDLL();
	}
}
