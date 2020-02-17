package command.commands;

import command.Command;
import command.vendors.CeilingFan;

public class CeilingFanMediumCommand implements Command {


    private final CeilingFan ceilingFan;

    private CeilingFan.CeilingSpeed prevValue;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevValue = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        switch (prevValue) {
            case LOW:
                ceilingFan.low();
                break;
            case HIGH:
                ceilingFan.high();
                break;
            case MEDIUM:
                ceilingFan.medium();
                break;
            case OFF:
                ceilingFan.off();
                break;
        }
    }

}
