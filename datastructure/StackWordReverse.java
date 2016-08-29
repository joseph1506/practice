package practice.datastructure;

public class StackWordReverse {
    GenericStackImpl<Character> stack;

    public StackWordReverse(GenericStackImpl<Character> stackImpl) {
        this.stack = stackImpl;
    }

    public static void main(String args[]) throws Exception {
        String wordToReverse="Reverse me";
        StackWordReverse stackWordReverse= new StackWordReverse(new GenericStackImpl<Character>(wordToReverse.length()));
        System.out.println(stackWordReverse.reverseWord(wordToReverse));
    }

    private String reverseWord(String wordToReverse) throws Exception {
        StringBuilder builder= new StringBuilder();
        for(int i=0;i<wordToReverse.length();i++){
            stack.push(wordToReverse.charAt(i));
        }

        while(!stack.isStackEmpty()){
            builder.append(stack.pop());
        }
        return builder.toString();
    }
}
