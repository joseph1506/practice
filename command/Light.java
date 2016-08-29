package practice.command;

public class Light {
    private String position;

    public Light(String position) {
        this.position=position;
    }

    public void on() {
        System.out.println("Light is switched on");
    }

    public void off() {
        System.out.println("Light is switched off");
    }
}
