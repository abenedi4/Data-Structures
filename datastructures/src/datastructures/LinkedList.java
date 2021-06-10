package datastructures;

public class LinkedList {
	//Head of linked list
	Node head;
	
	static class Node {
		//Fields:
		//data: stores the value of the node
		//next: node that follows current node
		int data;
		Node next;
		
		//Constructor to initialize data when node is created
		Node(int d) {
			data = d;
		}
		
	}


	public static void main(String []args) {
		//Create linked list
		LinkedList llist = new LinkedList();
		
		//Set head of linked list to 1
		llist.head = new Node(1);
		
		//Create two more nodes, storing 2 and 3 respectively
		Node second = new Node(2);
		Node third = new Node(3);
		
		//Link nodes
		llist.head.next = second;
		second.next = third;
		
		//Iterate through linked list and print
		Node n = llist.head;
		while(n != null) { //While we have more nodes to iterate to...
			System.out.print(n.data + " "); 
			//Set current node to next node
			n = n.next;
		}
		
	}
}