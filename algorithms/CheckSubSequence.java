package practice.algorithms;

import org.apache.cxf.common.util.StringUtils;

public class CheckSubSequence {

    public static void main(String[] args) {
        String input1="gksrek";
        String input2="geeksforgeeks";
        boolean sequenceFound=checkSubSequence(input1,input2);
        System.out.println("Found--->"+sequenceFound);
    }

    private static boolean checkSubSequence(String input1, String input2) {
        if(StringUtils.isEmpty(input1) || StringUtils.isEmpty(input2)){
            return false;
        }
        int len1=input1.length();
        int len2= input2.length();
        int j=0;
        for(int i=0;i<len2 && j<len1;i++){
              if(input1.charAt(j)==input2.charAt(i)){
                  j++;
              }
        }
        return (j==len1);
    }
}
