package practice.springaop;

public class Volunteer implements Thinker {
    String thoughts;
    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts=thoughts;
    }

    public String getThoughts(){
        return thoughts;
    }
}
