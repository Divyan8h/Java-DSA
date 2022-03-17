package session1;
import java.util.*;

class deleteLL {
	Node head;
	class Node{
		String data;
		Node next;
		
		Node(String data)//constructor
		{
			this.data=data;
			this.next=null;
		}
	}
		public void addFirst(String data)
		{
			//check if LL is created or not
			Node newNode = new Node(data);
			if(head == null)
			{
				head = newNode;
				return;
			}
				newNode.next = head;//newNode h usko head mein refer krva denge
				head = newNode;
		}
		
		public void addLast(String data)
		{
			Node newNode = new Node(data);
			if(head == null)
			{
				head = newNode;
				return;
			}
			Node currNode = head;
			while(currNode.next !=null)
			{
				currNode = currNode.next;
			}
			
			currNode.next = newNode;
			
		}
		
		public void deleteFirst()
		{
			if(head == null)
			{
				System.out.println("The list is empty");
				return;
			}
			
			head = head.next; //head ko bna denge head ka next

		}
		
		public void deleteLast()
		{
			if(head.next == null)
			{
				head = null;
				return;
			}
			
			Node secondLast = head; //secondNode mein head
			Node lastNode = head.next; //lastNode head ke next node ke liye
			while(lastNode.next!=null) //jab tak linked list ke end pe na aajaye
			{
				lastNode=lastNode.next;
				secondLast = secondLast.next; 
			}
			secondLast.next = null;
		}
		
		
		public void printList()
		{

			if(head == null)
			{
				System.out.println("node is empty");
				return;
			}
			
			Node currNode = head;
			while(currNode != null)
			{
				System.out.print(currNode.data + " ");
				currNode = currNode.next;
			}
			System.out.println("NULL");
		}
		
	
		public static void main(String[] args) {
			
	
		deleteLL list = new deleteLL();
		list.addFirst("a");
		list.addFirst("is");
		list.addFirst("This");
		list.addLast("Project");
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteLast();
		list.printList();
	}

}
