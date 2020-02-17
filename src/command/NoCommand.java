package command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No command is set.");
    }

    @Override
    public void undo() {
        System.out.println("No command is set.");
    }
}
