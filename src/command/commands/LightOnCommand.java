package command.commands;

import command.Command;
import command.vendors.Light;

public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightsOn();
    }

    @Override
    public void undo() {
        light.lightsOff();
    }
}
