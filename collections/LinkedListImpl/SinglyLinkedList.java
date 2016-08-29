package practice.collections.LinkedListImpl;

public class SinglyLinkedList<T> {
   private Node<T> head;
   private Node<T> tail;
   private Node<T> temp;
   private int size;


   public SinglyLinkedList(){
       head=null;
       tail=null;
       size=0;
   }

   public void addLast(T element){
       temp=new Node<T>();
       temp.setElement(element);
       if(head==null){
           head=temp;
           tail=head;
       }else{
           tail.setNext(temp);
           tail=temp;
       }
       size++;
   }

   public void addFirst(T element){
       temp=new Node<T>();
       temp.setElement(element);
       if(head==null){
           head=temp;
           tail=head;
       }else{
           temp.setNext(head);
           head=temp;
       }
       size++;
   }

   public void removeFirst() {
       if(head==null){
           return;
       }else{
         temp=head;
         head=temp.getNext();
         if(head==null){
             tail=null;
         }
       }
       size--;
   }

   public int getSize(){
       return size;
   }
}
