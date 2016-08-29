package practice.algorithms;

import java.util.HashMap;
import java.util.Map;

public class CheckIfAStringCanBeMadePalindrome {

    public static void main(String[] args) {
        //String input="MALAYALAM";
        //String input="ALAYALA";
        String input="MALALALAMA";


        boolean isPalindromeInIt= canBeReArrangedToPalindrome(input);
        System.out.println("Status--->"+isPalindromeInIt);

    }

    private static boolean canBeReArrangedToPalindrome(String input) {
        Map<Character,Integer> charCountMap=new HashMap<Character, Integer>();
        for(int i=0;i<input.length();i++){
            Integer countForChar=charCountMap.get(input.charAt(i))!=null?charCountMap.get(input.charAt(i)):0;
            charCountMap.put(input.charAt(i),countForChar+1);
        }

        int countOdd=0;

        for(Map.Entry<Character,Integer> entry:charCountMap.entrySet()){
            Character character=entry.getKey();
            Integer charCount=entry.getValue();

            if(charCount%2==1){
                if(countOdd>=1){
                    return false;
                }
                countOdd++;
            }
        }

        return true;  //To change body of created methods use File | Settings | File Templates.
    }


}
