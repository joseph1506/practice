package practice.algorithms;

import practice.datastructure.LinkedList;
import practice.datastructure.LinkedNode;

public class RemoveDuplicatesLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list1= new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(4);
        list1.add(5);
        list1.add(10);


        LinkedNode head=removeDuplicates(list1.getHead());


    }

    private static LinkedNode removeDuplicates(LinkedNode<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }

        LinkedNode curr=head;
        LinkedNode prev=head;

        //while



       return null;
    }




}
