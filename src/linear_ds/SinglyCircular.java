package linear_ds;
class NodeSCL {
	int data;
	NodeSCL next;
	public NodeSCL(int data) {
		this.data = data;
		next = null;
	}
}
class SCLoperations {
	static NodeSCL head = null;
	public static void InsertAtBeggining(int data) {
		NodeSCL newnode=new NodeSCL(data);
		if(head==null) {
			newnode.next=newnode;
			head=newnode;
			return;
		}
		NodeSCL temp=head;
		while(temp.next!=head) {
			temp=temp.next;
		}
		temp.next=newnode;
		newnode.next=head;
		head=newnode;
	}
	public static void InsertAtEnd(int data) {
		NodeSCL newnode=new NodeSCL(data);
		NodeSCL temp=head;
		NodeSCL temp1;
		if(head==null) {
			InsertAtBeggining(data);
		}
		while(temp.next!=head) {
			temp=temp.next;
		}
		temp1=temp.next;
		temp.next=newnode;
		newnode.next=temp1;
	}
	public static void InsertAtPosition(int data,int position) {
		NodeSCL newnode=new NodeSCL(data);
		NodeSCL temp=head;
		NodeSCL temp1;
		int place=0;
		if(position==1) {
			InsertAtBeggining(data);
		}
		while(temp.next!=head) {
			place++;
			if((position-1)==place) {
				if(temp.next.next==head) {
					InsertAtEnd(data);
				}
				else {
					temp1=temp.next;
					temp.next=newnode;
					newnode.next=temp1;
					return;
				}
			}
			temp=temp.next;
		}
	}
	public static void display() {
		if(head==null) {
			System.out.println("List is empty");
		}
		NodeSCL temp=head;
		do {
			System.out.print(temp.data+"---->");
			temp=temp.next;
		}
		while(temp!=head);
	}
}
public class SinglyCircular extends SCLoperations {
	public static void main(String[] args) {
		InsertAtBeggining(10);
		InsertAtBeggining(20);
		InsertAtBeggining(30);
		InsertAtEnd(99);
		InsertAtEnd(67);
		InsertAtEnd(55);
		InsertAtPosition(40,4);
		display();


	}

}
