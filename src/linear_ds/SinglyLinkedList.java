package Linear;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		next=null;
	}
}
class Node1{
	int data1;
	Node1 next1;
	public Node1(int data) {
		this.data1=data;
		next1=null;
	}
}
class operations{
	static Node head=null;
	static Node1 head1=null;
	public static void InsertAtBegin(int data) {
		Node newnode=new Node(data);
		Node temp=head;
		if(head==null) {
			head=newnode;
			newnode.next=null;
			return;
		}
		newnode.next=temp;
		head=newnode;
	}
	public static void InsertAtBegin1(int data) {
		Node1 newnode1=new Node1(data);
		Node1 temp1=head1;
		if(head1==null) {
			head1=newnode1;
			newnode1.next1=null;
			return;
		}
		newnode1.next1=temp1;
		head1=newnode1;
	}
	public static void InsertAtEnd(int data) {
		Node newnode=new Node(data);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
	}
	public static void DeleteAtBegin() {
		Node temp=head;
		Node temp1=temp.next;
		temp.next=null;
		head=temp1;
		
	}
	public static void DeleteAtEnd() {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
	public static void DeleteAtPosition(int position) {
		int count=0;
		Node temp=head;
		if(position==1) {
			DeleteAtBegin();
		}
		while(temp!=null) {
			count++;
			if(count==(position-1)) {
				temp.next=temp.next.next;
				return;
			}
			temp=temp.next;
		}
		
	}
	public static void DeleteByElement(int data) {
		Node temp=head;
		while(temp.next.data!=data) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		
	}
	public static void Sort() {
		List<Integer> lst=new ArrayList<>();
		Node temp=head;
		head=null;
		while(temp!=null) {
			lst.add(temp.data);
			temp=temp.next;
		}
		Collections.sort(lst);
		for(int i=0;i<lst.size();i++) {
			InsertAtBegin(lst.get(i));
		}
	}
	public static void HigherElement() {
		Sort();
		head.next=null;
		
	}
	public static void LowestElement() {
		Sort();
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		head=temp;
	}
	public static void display() {
		Node temp=head;
		if(temp==null) {
			System.out.print("Empty list");
		}
		while(temp!=null) {
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
		System.out.print("null");
	}
	public static void display1() {
		Node1 temp1=head1;
		if(temp1==null) {
			System.out.print("Empty list");
		}
		while(temp1!=null) {
			System.out.print(temp1.data1+"--->");
			temp1=temp1.next1;
		}
		System.out.print("null");
	}
}
public class SinglyLinkedList extends operations{
	public static void main(String[] args) {
		InsertAtBegin(10);
		InsertAtBegin(20);
		InsertAtBegin(30);
		InsertAtBegin(40);
		InsertAtBegin(50);
		InsertAtEnd(60);
		InsertAtBegin1(70);
		InsertAtBegin1(80);
		InsertAtBegin1(90);
		InsertAtBegin1(100);
		InsertAtBegin1(110);
		//DeleteAtPosition(1);
		//DeleteAtEnd();
		//DeleteByElement(30);
		//Sort();
		//HigherElement();
		//LowestElement();
		display();
		System.out.println();
		display1();


	}

}
