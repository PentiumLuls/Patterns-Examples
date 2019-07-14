package homeAutomation.command;

import homeAutomation.device.CeilingFan;

public class CeilingFanLowerCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanLowerCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        switch (ceilingFan.getSpeed()) {
            case ZERO: break;
            case LOW: {
                ceilingFan.off();
                break;
            }
            case MEDIUM: {
                ceilingFan.low();
                break;
            }
            case HIGH: {
                ceilingFan.medium();
                break;
            }
        }
    }
}
