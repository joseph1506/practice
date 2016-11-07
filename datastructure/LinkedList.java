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

    @Override
    public String toString() {
        LinkedNode node=head;
        StringBuffer output=new StringBuffer();
        while(node!=null){
            output.append("------>");
            String value=node.getValue()!=null?node.getValue().toString():"";
            output.append(value);
            node=node.getNext();
        }
        output.append("------->null");
        return output.toString();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public LinkedNode<T> deleteNode(T value) {
        if(head==null){
            return null;
        }
        LinkedNode node=head;
        if(node.getValue()==value){
            head=node.getNext();
            return head;
        }

        while(node.getNext()!=null){
          if(value==node.getNext().getValue()){
              node.setNext(node.getNext().getNext());
              break;
          }
          node=node.getNext();
        }
        return head;
    }
}


