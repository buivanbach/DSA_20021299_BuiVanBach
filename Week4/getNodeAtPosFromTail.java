package Week4;

import java.util.LinkedList;

public class getNodeAtPosFromTail {
    public static int getNode(SinglyLinkedListNode head, int positionFromTail) {

        SinglyLinkedListNode temp = head;
        SinglyLinkedListNode p = head;
        for(int i=0;i<positionFromTail;i++){
            p= p.next;
        }
        while(p.next!=null){
            p= p.next;
            temp = temp.next;
        }
        return temp.data;
    }
    public static void main(String[] args){
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertNode(10);
        linkedList.insertNode(11);
        System.out.println(getNode(linkedList.head,1));
        linkedList.printLinkedList();
    }
}
