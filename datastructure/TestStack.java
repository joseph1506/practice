package practice.datastructure;

public class TestStack {
    public static void main(String args[]) throws Exception {
        GenericStackImpl<Integer> stack=new GenericStackImpl<Integer>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        StackReversal<Integer> dataLogic= new StackReversal<Integer>();
        dataLogic.stackReverse(stack);
        System.out.println("");


    }


}
