package practice.algorithms;

import practice.datastructure.LinkedList;
import practice.datastructure.LinkedNode;

public class CheckLoopLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList= new LinkedList<Integer>();
        LinkedNode node= new LinkedNode(2);
        LinkedNode node5= new LinkedNode(5);
        node5.setNext(node);
        linkedList.add(1);
        linkedList.addNode(node);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.addNode(node5);
        //linkedList.add(6);
        System.out.println(detectLoop(linkedList));
        System.out.println(linkedList);
    }

    private static String detectLoop(LinkedList<Integer> linkedList) {
        LinkedNode slow=linkedList.getHead();
        LinkedNode fast=linkedList.getHead();
        while(slow!=null && fast!=null && fast.getNext()!=null){
            slow=slow.getNext();
            fast=fast.getNext().getNext();
            if(slow==fast){
              return "Loop detected";
            }
        }
        return "No Loop";
    }


}
