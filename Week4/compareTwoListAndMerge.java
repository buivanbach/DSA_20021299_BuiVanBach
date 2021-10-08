package Week4;

import edu.princeton.cs.algs4.StdIn;

public class compareTwoListAndMerge {
    public static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null && head2 == null) {
            return true;
        } else if (head1 == null) {
            return false;
        } else if (head2 == null) {
            return false;
        } else {
            while (head1 != null && head2 != null) {
                if (head1.data != head2.data) {
                    return false;
                }
                if (head1.next == null && head2.next != null) {
                    return false;
                }
                if (head2.next == null && head1.next != null) {
                    return false;
                }
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        return true;
    }

    public static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        if (head1.data < head2.data) {
            head1.next = mergeLists(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeLists(head1, head2.next);
            return head2;
        }


    }

    public static void main(String[] args) {
        SinglyLinkedList llist1 = new SinglyLinkedList();
        int size = StdIn.readInt();
        for (int i = 0; i < size; i++) {
            int res = StdIn.readInt();
            llist1.insertNode(res);
        }
        SinglyLinkedList llist2 = new SinglyLinkedList();
        int size2 = StdIn.readInt();
        for (int i = 0; i < size2; i++) {
            int res = StdIn.readInt();
            llist2.insertNode(res);
        }
        System.out.println(compareLists(llist1.head, llist2.head));
        llist1.head = mergeLists(llist1.head,llist2.head);
        llist1.printLinkedList();
    }
}
