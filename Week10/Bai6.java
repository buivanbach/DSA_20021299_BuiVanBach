package Week10;

import static java.lang.Math.abs;

public class Bai6 {
    static class Node {
        int val;    //Value
        int ht;        //Height
        Node left;    //Left child
        Node right;    //Right child
    }

    static int height(Node root) {
        if (root == null) return -1;
        return root.ht;
    }

    private static int resetHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }

    private static Node leftRotation(Node root) {
        Node x = root.right;
        root.right = x.left;
        x.left = root;
        root.ht = resetHeight(root);
        x.ht = resetHeight(x);
        return x;
    }

    private static Node rightRotation(Node root) {
        Node x = root.left;
        root.left = x.right;
        x.right = root;
        root.ht = resetHeight(root);
        x.ht = resetHeight(x);
        return x;
    }

    static Node insert(Node root,int val) {
        if(root == null) {
            root = new Node();
            root.val = val;
            root.ht = resetHeight(root);
            return root;
        }
        if(val <= root.val) {
            root.left = insert(root.left, val);
        }
        else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        int balance = height(root.left) - height(root.right);

        if(balance > 1) {
            if(height(root.left.left) >= height(root.left.right)) {
                root = rightRotation(root);
            }
            else {
                root.left = leftRotation(root.left);
                root = rightRotation(root);
            }
        }
        else if(balance < -1) {
            if(height(root.right.right) >= height(root.right.left)) {
                root = leftRotation(root);
            }
            else {
                root.right = rightRotation(root.right);
                root = leftRotation(root);
            }
        }
        else {
            root.ht = resetHeight(root);
        }
        return root;
    }
}
