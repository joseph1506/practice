package practice.collections.LinkedListImpl;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private Node<T> temp;
    private int size;

    public DoublyLinkedList(){
        head=null;
        tail=null;
        size=0;
    }


    public void add(T element){
        temp=new Node<T>();
        temp.setElement(element);
        if(head==null){
            temp.setPrev(head);
            head=temp;
            tail=head;
        }else{
            tail.setNext(temp);
            tail=temp;
        }
        size++;
    }



}
