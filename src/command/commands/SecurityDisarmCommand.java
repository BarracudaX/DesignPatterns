package command.commands;

import command.Command;
import command.vendors.SecurityControl;

public class SecurityDisarmCommand implements Command {

    private final SecurityControl securityControl;

    public SecurityDisarmCommand(SecurityControl securityControl) {
        this.securityControl = securityControl;
    }

    @Override
    public void execute() {
        securityControl.disarm();
    }

    @Override
    public void undo() {
        securityControl.arm();
    }
}
