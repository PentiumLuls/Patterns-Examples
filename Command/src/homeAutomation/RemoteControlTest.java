package homeAutomation;

import homeAutomation.command.*;
import homeAutomation.device.Light;
import homeAutomation.device.CeilingFan;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        CeilingFan ceilingFan = new CeilingFan();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        control.setCommand(0, lightOnCommand, lightOffCommand);

        CeilingFanLowerCommand ceilingFanLowerCommand = new CeilingFanLowerCommand(ceilingFan);
        CeilingFanHigherCommand ceilingFanHigherCommand = new CeilingFanHigherCommand(ceilingFan);
        control.setCommand(1, ceilingFanHigherCommand, ceilingFanLowerCommand);

        control.onButtonWasPushed(0);
        control.onButtonWasPushed(1);
        control.onButtonWasPushed(1);
        control.offButtonWasPushed(0);
        control.onButtonWasPushed(4);

        System.out.println("\n=== Macro command test ===");
        Command[] partyOn = {lightOnCommand, ceilingFanHigherCommand};
        Command[] partyOff = {lightOffCommand, ceilingFanLowerCommand};

        MacroCommand partyOnCommand = new MacroCommand(partyOn);
        MacroCommand partyOffCommand = new MacroCommand(partyOff);
        control.setCommand(2, partyOnCommand, partyOffCommand);
        control.onButtonWasPushed(2);
        control.offButtonWasPushed(2);
    }
}
