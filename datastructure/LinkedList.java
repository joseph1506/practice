package practice.datastructure;

public class LinkedList<T> {
     private LinkedNode<T> head;
     private int size=0;

    public LinkedList() {
        size=0;
    }

    public boolean add(T nodeValue){
        LinkedNode node= new LinkedNode(nodeValue);
        if(head==null){
            head=node;
        } else{
            LinkedNode currentNode=head;
            while(currentNode.getNext()!=null){
                currentNode=currentNode.getNext();
            }
            currentNode.setNext(node);
        }
        size++;
        return true;
    }

    public boolean addNode(LinkedNode<T> node){
        if(head==null){
            head=node;
        } else{
            LinkedNode currentNode=head;
            while(currentNode.getNext()!=null){
                currentNode=currentNode.getNext();
            }
            currentNode.setNext(node);
        }
        size++;
        return true;
    }

    public LinkedNode<T> getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

}


