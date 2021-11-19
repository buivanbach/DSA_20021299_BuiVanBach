package Week10;

import java.util.ArrayList;
import java.util.List;

public class Bai5 {
    class Node {
        int data;
        Node left;
        Node right;
    }
    ArrayList<Integer> arr = new ArrayList<>();
    void list(Node root, ArrayList<Integer> arr){
        if(root.left!=null)  list(root.left, arr);
        arr.add(root.data);
        if (root.right!=null) list(root.right, arr);

    }
    boolean checkList(Node root){
        list(root,arr);
        for(int i = 0 ; i< arr.size()-1;i++){
            if(arr.get(i)>=arr.get(i+1)){
                return false;
            }
        }
        return true;
    }
    boolean checkBST(Node root) {
        return checkList(root);
    }
}
