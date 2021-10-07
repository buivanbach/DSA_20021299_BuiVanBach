package Week4;

import edu.princeton.cs.algs4.StdIn;

public class DeleteNode {
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        // Write your code here
        if(position == 0){
            return llist.next;
        }
        SinglyLinkedListNode p = llist;
        int i = 0;
        while (i < position - 1) {
            p = p.next;
            i++;
        }
        if(p.next.next == null){
            p.next = null;
        }
        else p.next = p.next.next;
        return llist;
    }
    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();
        int size = StdIn.readInt();
        for (int i = 0; i < size; i++) {
            int res = StdIn.readInt();
            llist.insertNode(res);
        }
        deleteNode(llist.head,1);
        llist.printLinkedList();
    }
}
