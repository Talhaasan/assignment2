package updHW2;



public class TestScores {

	public static void main(String[] args) {
		/*
		GameScoresArray Alist = new GameScoresArray(10);
		
		Alist.print();
		*/
		
		
		GameScoresDoublyLinkedList myLinkedlist = new GameScoresDoublyLinkedList(10);
		   
		   myLinkedlist.insertFirst(5);
		   myLinkedlist.insertFirst(6);
		   myLinkedlist.insertFirst(7);
		   myLinkedlist.insertFirst(1);
		   myLinkedlist.insertFirst(5);
		   myLinkedlist.insertFirst(15);
		   myLinkedlist.insertFirst(25);
		   myLinkedlist.insertFirst(35);
		   myLinkedlist.insertFirst(12);
		   myLinkedlist.insertFirst(3);
		   myLinkedlist.insertFirst(19);
		   
		  Node node = new Node();
		  
		   node.data=1;
		   
		   myLinkedlist.deleteFirst();
		   myLinkedlist.deleteLast();
		   
		  
	}
 }



