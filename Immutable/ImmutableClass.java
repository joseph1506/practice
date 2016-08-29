package practice.Immutable;

public final class ImmutableClass {
    private final String variable1;
    private final String variable2;

    public ImmutableClass(String variable1, String variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    public String getVariable1() {
        return variable1;
    }

    public String getVariable2() {
        return variable2;
    }
}
