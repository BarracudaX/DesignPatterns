package command.commands;

import command.Command;
import command.vendors.GarageDoor;

public class GarageDoorCloseCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }

    @Override
    public void undo() {
        garageDoor.open();
    }

}
