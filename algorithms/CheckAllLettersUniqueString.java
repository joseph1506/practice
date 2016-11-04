package practice.algorithms;

import org.apache.commons.lang3.StringUtils;

public class CheckAllLettersUniqueString {


    public static void main(String[] args) {
        String testString="JOseph";
        boolean isLettersUnique= checkLettersUnique(testString);
        System.out.println("Unique--->"+isLettersUnique);
    }

    private static boolean checkLettersUnique(String name) {
       if(StringUtils.isEmpty(name)){
           return false;
       }
       for(int i=0;i<name.length();i++){
           char testChar= name.charAt(i);
           for(int j=i+1;j<name.length();j++){
               char iterChar=name.charAt(j);
               if(testChar == iterChar){
                   return false;
               }
           }
       }
        return true;  //To change body of created methods use File | Settings | File Templates.
    }
}
