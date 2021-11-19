package Week10;

public class Bai2 {
    class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static int height(Node root) {
        int x = 0 , y = 0;
        if(root.right!=null) x = height(root.right)+1;
        if(root.left!=null) y = height(root.left)+1;
        return x>y ? x : y;
    }
}
