package command;

import java.util.Arrays;

public class Remote {

    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoButton ;

    public Remote(int numOfSlots) {
        this.onCommands = new Command[numOfSlots];
        this.offCommands = new Command[numOfSlots];
        for (int i = 0; i < numOfSlots; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undoButton = new NoCommand();
    }

    public void setCommand(Command onCommand, Command offCommand, int slot) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void invokeOnCommand(int slot) {
        onCommands[slot].execute();
        undoButton = onCommands[slot];
    }

    public void invokeOffCommand(int slot) {
        offCommands[slot].execute();
        undoButton = offCommands[slot];
    }

    public void invokeUndo(){
        undoButton.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
