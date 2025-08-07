package NonLinear;

import java.util.LinkedList;
import java.util.Queue;

class BinaryNode {
    int data;
    BinaryNode left, right;

    public BinaryNode(int data) {
        this.data = data;
    }
}

class BinaryOperations {
    static BinaryNode root = null;

    public static void InsertElement(int data) {
        BinaryNode newnode = new BinaryNode(data);
        if (root == null) {
            root = newnode;
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryNode current = queue.poll();
            if (current.left == null) {
                current.left = newnode;
                return;
            } else {
                queue.offer(current.left);
            }
            if (current.right == null) {
                current.right = newnode;
                return;
            } else {
                queue.offer(current.right);
            }
        }
    }

    public static void PostOrderTraversal(BinaryNode node) {
        if (node != null) {
            PostOrderTraversal(node.left);
            PostOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void PreOrderTraversal(BinaryNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            PreOrderTraversal(node.left);
            PreOrderTraversal(node.right);
        }
    }
}

public class BinaryTree extends BinaryOperations {
    public static void main(String[] args) {
        InsertElement(10);
        InsertElement(20);
        InsertElement(5);
        InsertElement(45);
        InsertElement(32);
        InsertElement(79);
        InsertElement(65);
        InsertElement(11);
        InsertElement(22);
        InsertElement(3);

        System.out.print("Postorder Traversal: ");
        PostOrderTraversal(root);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        PreOrderTraversal(root);
        System.out.println();
    }
}
