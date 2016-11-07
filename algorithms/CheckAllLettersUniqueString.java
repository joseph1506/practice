package practice.algorithms;

import org.apache.commons.lang3.StringUtils;

public class CheckAllLettersUniqueString {


    public static void main(String[] args) {
        String testString="JOsephe";
        boolean isLettersUnique= checkLettersUnique(testString);
        System.out.println("Unique--->"+isLettersUnique);
    }

    //more time--- n2
    /*private static boolean checkLettersUnique(String name) {
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
    }*/

    //using extended acsii char set--- 256 characters
    private static boolean checkLettersUnique(String name){
        if(StringUtils.isEmpty(name) || name.length()>256){
            return false;
        }

        boolean[] charSet= new boolean[256];

        for(int i=0;i<name.length();i++){
            char value=name.charAt(i);
            System.out.println(value+"----->"+charSet[value]);
            if(charSet[value]){
                return false;
            }
            charSet[value]=true;
        }
        return true;
    }
}
