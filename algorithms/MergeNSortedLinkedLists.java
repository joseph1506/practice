package practice.algorithms;

import practice.datastructure.LinkedList;
import practice.datastructure.LinkedNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeNSortedLinkedLists {

    public static void main(String[] args) {
        LinkedList<Integer> list1= new LinkedList<Integer>();
        list1.add(1);
        list1.add(5);
        list1.add(10);
        LinkedList<Integer> list2= new LinkedList<Integer>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        LinkedList<Integer> list3= new LinkedList<Integer>();
        list3.add(3);
        list3.add(7);
        list3.add(9);


        List<LinkedNode> nodeList=new ArrayList<LinkedNode>();
        nodeList.add(list1.getHead());
        nodeList.add(list2.getHead());
        nodeList.add(list3.getHead());

        LinkedNode<Integer> mergedNode= mergeNLinkedList(nodeList);
        System.out.println(mergedNode);

    }

    private static LinkedNode<Integer> mergeNLinkedList(List<LinkedNode> nodeList) {
        if(nodeList==null || nodeList.size()==0){
            return null;
        }
        PriorityQueue<LinkedNode<Integer>> nodeQueue= new PriorityQueue<LinkedNode<Integer>>(nodeList.size(),new Comparator<LinkedNode<Integer>>() {
            @Override
            public int compare(LinkedNode<Integer> node1, LinkedNode<Integer> node2) {
                return node1.getValue().compareTo(node2.getValue());
            }
        });

        for(LinkedNode<Integer> node:nodeList){
            nodeQueue.add(node);
        }

        LinkedNode head= new LinkedNode(0);
        LinkedNode p=head;

        while(nodeQueue.size()>0){
            LinkedNode temp=nodeQueue.poll();
            p.next=temp;
            if(temp.next!=null){
                nodeQueue.add(temp.next);
            }
            p=p.next;
        }
        return head.next;
    }


}
