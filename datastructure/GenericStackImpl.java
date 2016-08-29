package practice.datastructure;

// Last in First Out logic LIFO

public class GenericStackImpl<T extends Object> {
    private int stackSize;
    private T[] stackArray;
    private int top;

    public GenericStackImpl(int size) {
        this.stackSize = size;
        this.stackArray = (T[])new Object[size];
        this.top = -1;
    }

    public void push(T entry) throws Exception {
        if(isStackFull()){
            this.increaseStackCapacity();
        }
        System.out.println("Entering ---->"+entry);
        stackArray[++top]=entry;
    }

    private void increaseStackCapacity() {
        T[] newStack= (T[])new Object[stackSize*2];
        for(int count=0;count<stackSize;count++){
             newStack[count]=stackArray[count];
        }
        stackSize=newStack.length;
        stackArray=newStack;

    }

    public T pop() throws Exception {
        if(isStackEmpty()){
            throw new Exception("Stack Already Empty");
        }
        T remove=stackArray[top];
        top=top-1;
        return remove;
    }

    public T peek(){
        return stackArray[top];
    }

    public boolean isStackEmpty(){
        return (top==-1);
    }

    public boolean isStackFull(){
        return (top==stackSize-1);
    }

    public static void main(String[] args) throws Exception {
        GenericStackImpl stackImpl= new GenericStackImpl(10);
        for(int count=0;count<10;count++){
            stackImpl.push("String"+count);
        }
        stackImpl.pop();
        stackImpl.push("String"+56);
    }
}
