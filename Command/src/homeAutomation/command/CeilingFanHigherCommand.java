package homeAutomation.command;

import homeAutomation.device.CeilingFan;

public class CeilingFanHigherCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanHigherCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        switch (ceilingFan.getSpeed()) {
            case ZERO: {
                ceilingFan.low();
                break;
            }
            case LOW: {
                ceilingFan.medium();
                break;
            }
            case MEDIUM: {
                ceilingFan.high();
                break;
            }
            case HIGH: {
                break;
            }
        }
    }
}
