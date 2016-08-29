package practice.command;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Empty Slot");
    }
}
