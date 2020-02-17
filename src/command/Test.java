package command;

import command.commands.*;
import command.vendors.CeilingFan;
import command.vendors.GarageDoor;
import command.vendors.Light;
import command.vendors.Stereo;

public class Test {

    public static void main(String[] args) {
        Remote remote = new Remote(10);

        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan();

        LightOnCommand livingRoomOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenOff = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        MacroCommands macroCommandsOn = new MacroCommands(new Command[]{ceilingFanHigh,stereoOn,garageDoorClose});
        MacroCommands macroCommandsOff = new MacroCommands(new Command[]{ceilingFanOff,stereoOff});

        remote.setCommand(livingRoomOn,livingRoomOff,0);
        remote.setCommand(kitchenOn,kitchenOff,1);
        remote.setCommand(garageDoorOpen,garageDoorClose,2);
        remote.setCommand(stereoOn,stereoOff,3);
        remote.setCommand(ceilingFanHigh,ceilingFanOff,4);
        remote.setCommand(ceilingFanMedium,ceilingFanOff,5);
        remote.setCommand(macroCommandsOn,macroCommandsOff,6);

        remote.invokeOnCommand(0);
        remote.invokeOffCommand(0);
        remote.invokeUndo();//UNDO

        remote.invokeOnCommand(1);
        remote.invokeUndo();//UNDO
        remote.invokeOffCommand(1);

        remote.invokeOnCommand(2);
        remote.invokeOffCommand(2);

        remote.invokeOnCommand(3);
        remote.invokeUndo();
        remote.invokeOffCommand(3);
        remote.invokeUndo();

        remote.invokeOnCommand(4);
        remote.invokeUndo();

        remote.invokeOnCommand(4);
        remote.invokeOnCommand(5);
        remote.invokeUndo();
        remote.invokeOffCommand(5);
        remote.invokeUndo();

        remote.invokeOnCommand(6);
        remote.invokeOffCommand(6);

        System.out.println(remote);
    }

}
