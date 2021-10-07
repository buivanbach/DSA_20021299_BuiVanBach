package Week4;

import edu.princeton.cs.algs4.StdIn;

public class Reverse {
    public static SinglyLinkedListNode reversePrint(SinglyLinkedListNode llist) {
        // Write your code here
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode cur = llist;
        SinglyLinkedListNode nex = null;
        while(cur != null){
            nex = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nex;

        }
        llist = prev;
        return llist;
    }
    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();
        int size = StdIn.readInt();
        for (int i = 0; i < size; i++) {
            int res = StdIn.readInt();
            llist.insertNode(res);
        }
        llist.head = reversePrint(llist.head);
        llist.printLinkedList();
    }
}
