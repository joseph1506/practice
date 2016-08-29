package practice.sort;

public class InsertionSort {
    public void sort(int[] input){
        int key=0;
        int j=0;
        for(int i=1;i<input.length;i++){
            key=input[i];
            j=i-1;
            while(j>-1 && input[j]>key){
                input[j+1]=input[j];
                j--;
            }
            input[j+1]=key;
        }
    }
    public static void main(String[] args){
        int[] input={10,20,50,2,3,12,89};
        InsertionSort insertionLogic= new InsertionSort();
        insertionLogic.sort(input);
        for(int num:input){
            System.out.println(num);
        }
    }
}
