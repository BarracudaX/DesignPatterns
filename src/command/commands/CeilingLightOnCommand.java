package command.commands;

import command.Command;
import command.vendors.CeilingLight;

public class CeilingLightOnCommand implements Command {

    private final CeilingLight light;

    public CeilingLightOnCommand(CeilingLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
