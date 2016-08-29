package practice.sort;

public class MergeSort {

    private int[] array;
    private int[] tempMergeArray;
    private int length;


    public void sort(int[] numbers){
        this.array=numbers;
        this.length=numbers.length;
        this.tempMergeArray= new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {
        if(lowerIndex<higherIndex){
            int middle=lowerIndex+(higherIndex-lowerIndex)/2;
            doMergeSort(lowerIndex,middle);
            doMergeSort(middle+1,higherIndex);
            mergeParts(lowerIndex,middle,higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArray[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergeArray[i] <= tempMergeArray[j]) {
                array[k] = tempMergeArray[i];
                i++;
            } else {
                array[k] = tempMergeArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergeArray[i];
            k++;
            i++;
        }
    }


    public static void main(String args[]){
        int[] numbers={10,1,3,0};
        MergeSort mergeSort=new MergeSort();
        mergeSort.sort(numbers);

        for(int number:numbers){
            System.out.println(number);
        }
    }


}
