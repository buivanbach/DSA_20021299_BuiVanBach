package Week4;

import edu.princeton.cs.algs4.StdIn;

public class InsertAtTailaAndHead {
    public static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode p = head;
        SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
        if(head == null){
            return newnode;
        }
        while(p.next != null){
            p = p.next;
        }
        p.next = newnode;
        return head;
    }
    public static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
        newnode.next = llist;
        llist = newnode;
        return llist;

    }
    public static void main(String [] args){
        SinglyLinkedList llist = new SinglyLinkedList();
        SinglyLinkedListNode llist_head = llist.head;
        llist_head = insertNodeAtTail(llist_head,10);
        llist_head = insertNodeAtHead(llist_head,11);
        llist.printLinkedList();
    }
}
