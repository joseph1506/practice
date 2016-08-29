package practice.datastructure;

public class StackReversal<T> {

    public void stackReverse(GenericStackImpl<T> stack) throws Exception {
        if(stack.isStackEmpty()) return;
        T lastElement = getLast(stack);
        stackReverse(stack);
        stack.push(lastElement);
    }

    private T getLast(GenericStackImpl<T> stack) throws Exception {
         T element=stack.pop();

        if(stack.isStackEmpty()){
            return element;
        } else{
            T last=getLast(stack);
            stack.push(element);
            return last;
        }
    }
}
