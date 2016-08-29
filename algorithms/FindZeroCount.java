package practice.algorithms;

public class FindZeroCount {

    public static int[][] populateIntArray(){
        int binNumber[][] = new int[4][4];
        binNumber[0][0]=1;binNumber[0][1]=1;binNumber[0][2]=1;binNumber[0][3]=1;  // row 1
        binNumber[1][0]=0;binNumber[1][1]=1;binNumber[1][2]=0;binNumber[1][3]=1; // row  2
        binNumber[2][0]=0;binNumber[2][1]=0;binNumber[2][2]=0;binNumber[2][3]=1; // row  3
        binNumber[3][0]=0;binNumber[3][1]=1;binNumber[3][2]=0;binNumber[3][3]=0; // row  4
        return binNumber;
    }

    public int findZeroCountRow(int[][] binNumber){
        int minSum=0;
        int currentRow=0;
        int rowSum=0;
        for(int i=0;i<4;i++){
            rowSum=0;
            for(int j=0;j<4;j++){
              rowSum+=binNumber[i][j];
            }
            if(i==0){
                minSum=rowSum;
            }
            if(rowSum<minSum){
                minSum=rowSum;
                currentRow=i;
            }
        }
        return currentRow;
    }

    public static void main(String[] args) {
        FindZeroCount zeroCount= new FindZeroCount();
        System.out.println("Row with max zero--->"+zeroCount.findZeroCountRow(populateIntArray()));
    }
}
