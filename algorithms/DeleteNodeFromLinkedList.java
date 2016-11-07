package practice.algorithms;

import practice.datastructure.LinkedList;

public class DeleteNodeFromLinkedList {


    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<Integer>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list.toString());

        list.deleteNode(0);
        System.out.println(list.toString());

    }
}
