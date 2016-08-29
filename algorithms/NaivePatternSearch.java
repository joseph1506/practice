package practice.algorithms;

public class NaivePatternSearch {
    public static void main(String[] args) {
        String input="aaaaa";
        String pattern="aabaa";
        int index=searchPattern(input,pattern);

        if(index==-1){
            System.out.println("Pattern not found");
        }else{
            System.out.println("Pattern found at index -->"+index);
        }

    }

    private static int searchPattern(String input, String pattern) {
        int i=0;int j=0,jIndex=0;
        int index=-1;
        int inputLen=input.length();
        int patLen=pattern.length();
        if(patLen>inputLen)
            return index;

        while(jIndex<inputLen){
            if(j<inputLen && input.charAt(j)==pattern.charAt(i)){
                if(i==patLen-1){
                    break;
                }

                if(index==-1){
                    index=j;
                }
                i++;
                j++;
            }else{
                jIndex++;
                j=jIndex;
                i=0;
                index=-1;
            }
        }
        return index;
    }

}
