package practice.command;

public class Stereo {
    public void on() {
        System.out.println("Stereo is switched on");
    }

    public void setCD() {
        System.out.println("CD is set in Stereo");
    }

    public void setVolume(int volume) {
        System.out.println("Volume is set to level "+volume);
    }
}
