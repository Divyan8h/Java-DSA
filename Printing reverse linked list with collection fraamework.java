package session1;
import java.util.*;

public class LL3 {
	Node head;
	int size;
	
	void LL(){
		this.size = size;
	}
	class Node{
		int data;
		Node next;
		
		
		
		
		Node(int data)//constructor
		{
			this.data=data;
			this.next=null;
			size++;
		}
	}
		public void addFirst(int data)
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
		
		public void addLast(int i)
		{
			Node newNode = new Node(i);
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
			
			size--;
			head = head.next; //head ko bna denge head ka next

		}
		
		public void deleteLast()
		{
			if(head.next == null)
			{
				System.out.println("The the list is empty.");
				return;
			}
			
			size--; 
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
		
		public int getsize() {
			return size;
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
		
		void reversefunc() 
		{
			if(head == null || head.next == null)
			{
				return;
			}
			
			Node prevNode = head;
			Node currNode = head.next;
			while(currNode!=null)
			{
				Node nextNode = currNode.next;
				currNode.next = prevNode;
				
				prevNode = currNode;
				currNode = nextNode;
				
			}
			head.next = null;
			head = prevNode;
		}
		
		public Node reverseRecursive(Node head)
		{
			if(head == null || head.next == null)
			{
				return head;
			}
			Node newNode = reverseRecursive(head.next);
			head.next.next = head;
			head.next = null;
			
			return newNode;
		}
		
		public static void main(String[] args) {
			LL3 list = new LL3();
			list.addLast(1);
			list.addLast(2);
			list.addLast(3);
			list.addLast(4);
			list.printList();
			
			list.reversefunc();
			list.printList();
			
			list.head = list.reverseRecursive(list.head);
			list.printList();
		}

}

