package NonLinear;
import java.util.LinkedList;
import java.util.Queue;
class BSNode{
	int data;
	BSNode left,right;
	public BSNode(int data) {
		this.data=data;
		left=null;
		right=null;
	}
}
class Bstoperations{
	static BSNode root=null;
	public static void InsertElement(int data) {
		BSNode newnode=new BSNode(data);
		if(root==null) {
			root=newnode;
			newnode.left=null;
			newnode.right=null;
			return;
		}
		BSNode current=root;
		while(current!=null) {
			if(current.data<data) {
				if(current.left==null) {
					current.left=newnode;
					return;
				}
				current=current.left;
			}
			else if(current.data>data) {
				if(current.right==null) {
					current.right=newnode;
					return;
				}
				current=current.right;
			}
		}
	}
	public static void inorderTraversal(BSNode node) {
	    if (node == null) {
	        return;
	    }
	    inorderTraversal(node.left);     
	    System.out.print(node.data + " "); 
	    inorderTraversal(node.right);     
	}

}

public class BinarySearchTree extends Bstoperations {
	public static void main(String[] args) {
		InsertElement(10);
		InsertElement(20);
		InsertElement(30);
		InsertElement(5);
		InsertElement(7);
		InsertElement(4);
		InsertElement(17);
		
		
		inorderTraversal(root);

	}
}


