package practice.sort;

public class BubbleSort {

    public void sort(int[] numbers){
        int size=numbers.length;
        int swap;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length-i-1;j++){
                if(numbers[j]>numbers[j+1]){
                    swap=numbers[j+1];
                    numbers[j+1]=numbers[j];
                    numbers[j]=swap;
                }
            }
        }
    }

    public static void main(String args[]){
        int[] numbers={10,23,11,45,22,56,89,1,0,23};
        System.out.println("before sort-->"+numbers);
        BubbleSort algorithm= new BubbleSort();
        algorithm.sort(numbers);
        System.out.println("after sort-->"+numbers);
        for(int number:numbers){
            System.out.println(number);
        }

    }
}
