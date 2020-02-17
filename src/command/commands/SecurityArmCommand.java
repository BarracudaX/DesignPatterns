package command.commands;

import command.Command;
import command.vendors.SecurityControl;

public class SecurityArmCommand  implements Command {

    private final SecurityControl securityControl;


    public SecurityArmCommand(SecurityControl securityControl) {
        this.securityControl = securityControl;
    }


    @Override
    public void execute() {
        securityControl.arm();
    }

    @Override
    public void undo() {
        securityControl.disarm();
    }
}
