package command.commands;

import command.Command;
import command.vendors.CeilingLight;

public class CeilingLightOffCommand implements Command {

    private final CeilingLight light;

    public CeilingLightOffCommand(CeilingLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

}
