package command.commands;

import command.Command;
import command.vendors.Stereo;

public class StereoOffCommand implements Command {

    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

}
