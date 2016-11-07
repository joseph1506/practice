package practice.algorithms;

import practice.datastructure.LinkedList;
import practice.datastructure.LinkedNode;

import java.util.HashSet;
import java.util.Set;

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


    //O(n)
    private static LinkedNode removeDuplicate(LinkedNode<Integer> head){
        Set<Integer> integers= new HashSet<Integer>();
        LinkedNode<Integer> current=head;
        LinkedNode<Integer> previous=null;
        while(current!=null){
            int value=current.getValue();
            if(integers.contains(value)){
                previous.next=current.next;

            }  else{
                integers.add(value);
                previous=current;
            }
            current=current.next;
        }
        return head;
    }




    //O(n^2) techinique
    private static LinkedNode removeDuplicates(LinkedNode<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }
        LinkedNode current=head;
        while(current!=null){
            LinkedNode runner=current;

            while(runner.next!=null){
                if(runner.next.getValue()==current.getValue()){
                    runner.next=runner.next.next;
                }else{
                    runner=runner.next;
                }
            }
            current=current.next;
        }
       return head;
    }




}
