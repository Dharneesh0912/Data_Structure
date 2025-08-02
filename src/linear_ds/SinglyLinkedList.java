package linear_ds;
import java.util.*;
class Node{
	int value;
	Node Next;
	public Node(int value) {
		this.value=value;
		Next=null;
	}
}
class operations{
	static Node head=null;
	public static void InsertAtBeggining(int value) {
		Node newnode=new Node(value);
		if(head==null) {
			head=newnode;
			return;
		}
		else{
			newnode.Next=head;
			head=newnode;
		}
	}
	public static void InsertAtEnd(int value){
		Node newnode=new Node(value);
		if(head==null) {
			head=newnode;
			return;
		}
		else {
			Node temp=head;
			while(temp.Next!=null) {
				temp=temp.Next;
			}
			temp.Next=newnode;
			newnode.Next=null;
		}
	}
	public static void InsertAtPosition(int value,int position) {
		Node newnode=new Node(value);
		int place=0;
		Node temp1=head;
		while(temp1!=null) {
			place++;
			if(place==(position-1)) {
				Node temp2=temp1.Next;
				temp1.Next=newnode;
				newnode.Next=temp2;
			}
			else {
				temp1=temp1.Next;
				
			}
		}
	}
	public static void DeleteAtEnd() {
		Node temp=head;
		while(temp.Next!=null) {
			if(temp.Next.Next==null) {
				temp.Next=null;
			}
			else {
				temp=temp.Next;
			}
		}
	}
	public static void DeleteAtBeggining() {
		Node temp=head;
		head=head.Next;
	}
	public static void DeleteAtPosition(int position) {
		Node temp=head;
		int place=0;
		while(temp!=null) {
			place++;
			if(place==(position-1)) {
				temp.Next=temp.Next.Next;
			}
			else {
				temp=temp.Next;
			}
		}
	}
	public static void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+"-->");
			temp=temp.Next;
		}
		
	}

	
}
public class SinglyLinkedList extends operations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		InsertAtBeggining(23);
		InsertAtBeggining(10);
		InsertAtBeggining(50);
		InsertAtBeggining(90);
		InsertAtBeggining(110);
		InsertAtBeggining(106);
		InsertAtEnd(24);
		InsertAtPosition(20,3);
		DeleteAtEnd();
		DeleteAtBeggining();
		DeleteAtPosition(2);
		display();
		
	}

}
