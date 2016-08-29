package practice.datastructure;

/**
 * Created with IntelliJ IDEA.
 * User: 606759708
 * Date: 10/07/15
 * Time: 16:38
 * To change this template use File | Settings | File Templates.
 */
public class LinkedNode<T>{
    T value;
    public LinkedNode<T> next;

    public LinkedNode(T value) {
        this.value=value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }
}
