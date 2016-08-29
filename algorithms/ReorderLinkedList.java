package practice.algorithms;

import practice.datastructure.LinkedList;
import practice.datastructure.LinkedNode;

public class ReorderLinkedList {
    // output ----> 1,7,2,6,3,5,4
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);

        //reOrderList(linkedList.getHead());

        LinkedList<Integer> forReverseTest= new LinkedList<Integer>();
        forReverseTest.add(1);
        forReverseTest.add(2);
        forReverseTest.add(3);
        forReverseTest.add(4);
        //forReverseTest.add(5);
        //forReverseTest.add(6);
        //forReverseTest.add(7);

        LinkedNode reversed=reverseRecursive(forReverseTest.getHead());
        System.out.println(reversed);

    }

    private static void reOrderList(LinkedNode head) {
        if(head==null || head.getNext()==null){
            return;
        }
        LinkedNode slow=head;
        LinkedNode fast=head;

        while(fast!=null && fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        LinkedNode secondPart=slow.next;
        //closing firstPart
        slow.next=null;

        LinkedNode reversedNode=reverseNode(secondPart);

        System.out.println(reversedNode);

        LinkedNode first=head;


        while(reversedNode!=null){
            LinkedNode temp1=first.next;
            LinkedNode temp2=reversedNode.next;

            first.next= reversedNode;
            reversedNode.next=temp1;

            first=temp1;
            reversedNode=temp2;
        }

        System.out.println(head);
    }

    private static LinkedNode reverseNode(LinkedNode head) {
        if(head==null || head.next==null){
            return head;
        }
        LinkedNode previous=head;
        LinkedNode current= head.next;
        previous.next=null;
        while(current!=null){
            LinkedNode temp=current.next;
            current.next=previous;
            previous=current;
            current=temp;
        }
        head.next=null;
        return previous;
    }

    public static LinkedNode reverseRecursive(LinkedNode head){
        return reverse(head);
    }


    public static LinkedNode reverse(LinkedNode node){
        if(node==null || node.next==null){
            return node;
        }

        LinkedNode next=node.next;
        node.next=null;

        LinkedNode rest=reverse(next);
        next.next=node;
        return rest;
    }


}
