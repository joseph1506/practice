package practice.algorithms;

import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueUsingStack<T> {
    Stack<T> stackOne= new Stack<T>();
    Stack<T> stackTwo= new Stack<T>();


    public void add(T element){
        stackOne.push(element);
    }

    public T remove(){
        if(isQueueEmpty()){
            throw new NoSuchElementException("Queue Empty");
        }
        if(stackTwo.isEmpty()){
            swapStacks(stackOne,stackTwo);
        }
        return stackTwo.pop();
    }

    private boolean isQueueEmpty() {
        return stackOne.isEmpty() && stackTwo.isEmpty();
    }

    private void swapStacks(Stack<T> stackOne, Stack<T> stackTwo) {
        while(!stackOne.isEmpty()){
            stackTwo.push(stackOne.pop());
        }
    }



}
