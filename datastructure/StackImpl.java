package practice.datastructure;

public class StackImpl {
    private int stackSize;
    private int[] stackArray;
    private int top;

    public StackImpl(int size) {
        this.stackSize = size;
        this.stackArray = new int[size];
        this.top = -1;
    }

    public void push(int entry) throws Exception {
        if(isStackFull()){
            throw new Exception("Stack Full");
        }
        System.out.println("Entering number---->"+entry);
        stackArray[++top]=entry;
    }

    public int pop() throws Exception {
        if(isStackEmpty()){
            throw new Exception("Stack Already Empty");
        }
        int remove=stackArray[top];
        top=top-1;
        return remove;
    }

    public int peek(){
        return stackArray[top];
    }

    public boolean isStackEmpty(){
        return (top==-1);
    }

    public boolean isStackFull(){
        return (top==stackSize-1);
    }

    public static void main(String[] args) throws Exception {
        StackImpl stackImpl= new StackImpl(10);
        for(int count=0;count<10;count++){
            stackImpl.push(count);
        }

        stackImpl.pop();
        stackImpl.push(56);

    }





}
