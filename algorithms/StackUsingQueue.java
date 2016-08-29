package practice.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<T> {
    Queue<T> queue1=new LinkedList<T>();
    Queue<T> queue2=new LinkedList<T>();

    public boolean isEmpty(){
        return queue1.isEmpty() && queue2.isEmpty();
    }





}
