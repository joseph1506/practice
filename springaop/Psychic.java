package practice.springaop;

public class Psychic implements MindReader {
    String thoughts;
    @Override
    public void interceptThoughts(String thoughts) {
        this.thoughts=thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
