package practice.algorithms;

import practice.datastructure.LinkedList;
import practice.datastructure.LinkedNode;

public class LinkedListMiddle {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        System.out.println(getMiddle(linkedList.getHead()));

    }

    public static LinkedNode getMiddle(LinkedNode<Integer> head) {
        LinkedNode<Integer> slow=head;
        LinkedNode<Integer> fast=head;
        while(fast!=null && fast.getNext()!=null && fast.getNext().getNext()!=null){
            slow=slow.getNext();
            fast=fast.getNext().getNext();
        }
        return slow;
    }

}
