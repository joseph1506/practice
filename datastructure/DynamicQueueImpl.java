package practice.datastructure;

// First in First Out Logic FIFO

public class DynamicQueueImpl<T extends Object> {
    private int queueSize;
    private T[] queueArray;
    private int front;
    private int rear;
    private int currentSize;


    public void enqueue(T item){
        if(isQueueFull()){
            // increase capacity
            increaseCapacity();
        }
        rear++;
        queueArray[rear]=item;
        currentSize++;
        System.out.println("Added item-->"+item);
    }

   /* public T dequeue(){
        if(isQueueEmpty()){

        }else{

        }
    }*/


    private boolean isQueueFull() {
        if(currentSize==queueArray.length){
            return true;
        }
        return false;
    }

    private boolean isQueueEmpty(){
      return true;
    }


    public void increaseCapacity(){
        int newCapacity= this.queueArray.length*2;
        T[] newArr=(T[]) new Object[newCapacity];

        int tempFront=front;
        int index=0;
        while(true){
           newArr[index]=this.queueArray[tempFront];
           index++;
           tempFront++;
           if(tempFront==this.queueArray.length){
               tempFront=0;
           }
           if(currentSize==index){
               break;
           }
        }
        this.queueArray=newArr;
        this.front=0;
        this.rear=index;
    }


}
