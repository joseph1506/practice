package practice.Threading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 606883540 on 16/05/2015.
 */
public class BaisedChandanProblem {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int numbers[] = new int[5000];
        int m=0;
        int index=0;
        int sum=0;
        while(m<N){
            int l= Integer.parseInt(br.readLine());
            if(l==0 && m!=0){
                sum-=numbers[index-1];
                index=index-1;
                m++;
            }else{
                numbers[index]=l;
                sum+=l;
                index++;
                m++;
            }


        }
        System.out.println(sum);
    }

}
