package linear_ds;
class NodeDL{
	int data;
	NodeDL prev;
	NodeDL next;
	public NodeDL(int data) {
		this.data=data;
		prev=null;
		next=null;
	}
}
class DoublyOperation{
	static NodeDL head=null;
	public static void InsertAtBeggining(int data) {
		NodeDL newnode=new NodeDL(data);
		NodeDL temp=head;
		if(temp==null) {
		head=newnode;
		head.next=null;
		head.prev=null;
		}
		else{
			head.prev=newnode;
			newnode.next=head;
			head=newnode;
		}
	}
	public static void InsertAtEnd(int data) {
		NodeDL newnode=new NodeDL(data);
		NodeDL temp=head;
		if(temp==null) {
			head=newnode;
			head.next=null;
			head.prev=null;
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
		newnode.prev=temp;
		newnode.next=null;
	}
	public static void InsertAtPosition(int data,int position) {
		NodeDL newnode=new NodeDL(data);
		int place=0;
		NodeDL temp=head;
		NodeDL temp1;
		if(position==1) {
			InsertAtBeggining(data);
		}
		while(temp!=null) {
			place++;
			if(place==(position-1)) {
				temp1=temp.next;
				temp.next=newnode;
				newnode.next=temp1;
			}
			temp=temp.next;
			
		}
	}
	public static void DeleteAtBeggining() {
		NodeDL temp=head;
		NodeDL temp1;
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			temp1=temp.next;
			temp.next=null;
			head=temp1;
			
		}
	}
	public static void DeleteAtEnd() {
		NodeDL temp=head;
		if(temp==null) {
			System.out.println("Empty list");
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.prev.next=null;	
	}
	public static void DeleteAtPosition(int position) {
		NodeDL temp=head;
		NodeDL temp1;
		int place=0;
		if(position==1) {
			DeleteAtBeggining();
			return;
		}
		while(temp!=null) {
			place++;
			if(temp.next==null) {
				DeleteAtEnd();
				return;
			}
			else if(place==position) {
				   temp.next.prev=temp.prev;
				   temp.prev.next=temp.next;
				   return;
				
			}
			else {
			    temp=temp.next;
			}
		}
	}
	public static void DeleteElement(int data) {
		NodeDL temp=head;
		NodeDL temp1;
		NodeDL temp2;
		if(data==head.data) {
			DeleteAtBeggining();
			return;
		}
		
		while(temp!=null) {
			if(temp.next==null) {
				DeleteAtEnd();
				return;
			}
			else if(temp.data==data) {
				  temp1=temp.prev;
				  temp2=temp.next;
				  temp1.next=temp2;
				  temp2.prev=temp1;
				  return;
			}
			temp=temp.next;
		}
	}
	public static void display() {
		NodeDL temp=head;
		if(temp==null) {
			System.out.println("No node");
		}
		while(temp!=null) {
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
		System.out.print("null");
		
	}

	

}
public class DoublyLinkedList extends DoublyOperation{
	public static void main(String[] args) {
		InsertAtBeggining(10);
		InsertAtBeggining(2);
		InsertAtBeggining(29);
		InsertAtBeggining(30);
		InsertAtBeggining(43);
		InsertAtBeggining(77);
		InsertAtBeggining(56);
		InsertAtBeggining(99);
		InsertAtEnd(19);
		InsertAtPosition(25,4);
		InsertAtEnd(40);
		InsertAtEnd(90);
		InsertAtEnd(109);
		InsertAtEnd(70);
		DeleteAtPosition(12);
		
		
		
		
		display();

	}

}
