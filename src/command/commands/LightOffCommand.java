package command.commands;

import command.Command;
import command.vendors.Light;

public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightsOff();
    }

    @Override
    public void undo() {
        light.lightsOn();
    }
}
