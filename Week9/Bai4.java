package Week9;

import java.util.LinkedList;
import java.util.Queue;

public class Bai4 {
    class Node {
        int data;
        Node left;
        Node right;
    }

    public static void inOrder(Node root) {
        if(root.left!= null )inOrder(root.left);
        System.out.print(root.data+" ");
        if(root.right!=null)inOrder(root.right);
    }
    public static void preOrder(Node root) {
        System.out.print(root.data+" ");
        if(root.left!= null )preOrder(root.left);

        if(root.right!=null)preOrder(root.right);
    }
    public static void levelOrder(Node root) {
       Queue <Node> queue = new LinkedList<>();
       queue.add(root);
       while (!queue.isEmpty()){
           Node temp = queue.poll();
           System.out.print(temp.data+" ");
           if(temp.left!= null) queue.add(temp.left);
           if(temp.right!= null) queue.add(temp.right);
       }

    }
}
