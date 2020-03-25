package updHW2;

class Node {
	
	public int data;
	public Node next;
	public Node prev;
 
	public void displayNodeData() {
		System.out.println("{ " + data + " } ");
	}
}

class PlayerDLinkList {
	
	String name;
	int highScore;
	
	 public PlayerDLinkList() {
		
	 }
		
	@Override
	public String toString() {
		return "Player [name=" + name + ", highScore=" + highScore + "]";
	}


	public PlayerDLinkList(String name, int highScore) {
		
		this.name = name;
		this.highScore = highScore;
	}
}
 
public class GameScoresDoublyLinkedList {
		 
		public Node head;
		public Node tail;
		int size;
	 
		public GameScoresDoublyLinkedList(int size) {
			
			this.size = size;
		}

		public boolean isEmpty() {
			return (head == null);
		}
	 
		// used to insert a node at the start of linked list
		public void insertFirst(int data) {
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = head;
			newNode.prev=null;
			if(head!=null)
				head.prev=newNode;
			head = newNode;
			if(tail==null)
				tail=newNode;
			size++;
		}
	 
		// used to insert a node at the start of linked list
		public void insertLast(int data) {
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = null;
			newNode.prev=tail;
			if(tail!=null)
				tail.next=newNode;
			tail = newNode;
			if(head==null)
				head=newNode;
			size++;
		}
		
		// used to delete node from start of Doubly linked list
		public Node deleteFirst() {
	 
			if (size == 0) 
				throw new RuntimeException("Doubly linked list is already empty");
			Node temp = head;
			head = head.next;
			head.prev = null;
			size--;
			return temp;
		}
	 
		// used to delete node from last of Doubly linked list
		public Node deleteLast() {
	 
			Node temp = tail;
			tail = tail.prev;
			tail.next=null;
			size--;
			return temp;
		}
	 
	 
	// For printing Doubly Linked List forward
		public void print() {
			
			Node current = head;
			while (current != null) {
				current.displayNodeData();
				current = current.next;
			}
			System.out.println();
		}
		
		
		
		public void updatePlayer(PlayerDLinkList DLinkList , int newScore) {
			
			if(newScore>DLinkList.highScore) {
				DLinkList.highScore= newScore;
			}
			
			
		}

		
		public void findPlayers(PlayerDLinkList DLinkList , int a, int b) {
			for(int i=0;i<size;i++) {
				
				if(b>DLinkList.highScore && DLinkList.highScore>=a ) 
				{
					
					DLinkList.toString();
					
				}
	 
			}
		}
		
		
}
	



