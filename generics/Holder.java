package practice.generics;

public class Holder<T> {
    private T[] contents;
    private int size;
    private int index=0;

    public Holder(int size) {
        this.size = size;
        contents=(T[]) new Object[size];
    }

    public void addContent(T item){
        contents[index]=item;
        index++;
    }

}
