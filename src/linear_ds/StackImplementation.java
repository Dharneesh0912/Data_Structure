package linear_ds;
class NodeStack{
	int data;
	NodeStack next;
	public NodeStack(int data) {
		this.data=data;
		next=null;
	}
}
class StackOperations{
	static NodeStack top=null;
	static NodeStack bottom=top;
	static int counter=-1;
	public static void push(int data) {
		NodeStack newnode=new NodeStack(data);
		if(top==null) {
			top=newnode;
			newnode.next=null;
			counter++;
			return;
		}
		else {
			bottom=top;
			bottom.next=newnode;
			newnode.next=null;
			top=newnode;
			counter++;
		}
	}
	public static void pop() {
		if(counter==-1) {
			System.out.println("Empty stack");
		}
		NodeStack temp=top;
		while(bottom!=null) {
			if(counter!=-1) {
				System.out.println(top.data);
				counter--;
			}
			top=bottom;
			bottom=bottom.next;
		}
	}
}
public class StackImplementation extends StackOperations{
	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		//push(40);
		pop();

	}

}
