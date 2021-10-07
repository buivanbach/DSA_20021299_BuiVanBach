package Week4;

import edu.princeton.cs.algs4.StdIn;

public class InsertNodeAtPosition {

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        int i = 0;
        SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode p = llist;
        if (position == 0) {
            newnode.next = llist;
            llist = newnode;
        }
        while (i < position - 1) {
            p = p.next;
            i++;
        }
        newnode.next = p.next;
        p.next = newnode;
        return llist;
    }

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();
        int size = StdIn.readInt();
        for (int i = 0; i < size; i++) {
            int res = StdIn.readInt();
            llist.insertNode(res);
        }
        System.out.print("input k = ");
        int k = StdIn.readInt();
        System.out.println();
        System.out.print("input position = ");
        int pos = StdIn.readInt();
        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, k, pos);
        llist.printLinkedList();
    }
}
