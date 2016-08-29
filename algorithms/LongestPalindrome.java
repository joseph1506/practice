package practice.algorithms;

public class LongestPalindrome {

    public static void main(String[] args) {
        String inputString="MALAYALA";
        String longestPalindrome= fetchLongestPalindrome(inputString);
        System.out.println(longestPalindrome);
    }

    private static String fetchLongestPalindrome(String inputString) {
        int length= inputString.length();
        String longestPalindrome="";
        int maxPalLength=0;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                String current=inputString.substring(i,j+1);
                int len=current.length();
                if(isPalindrome(current)){
                     if(len>maxPalLength){
                        maxPalLength=len;
                        longestPalindrome=current;
                     }
                }
            }
        }
        return longestPalindrome;
    }

    private static boolean isPalindrome(String input) {
        int len=input.length();

        for(int i=0;i<len/2;i++){
            if(input.charAt(i)!=input.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }

}
