package homeAutomation.device;

public class CeilingFan {
    private Speed speed = Speed.ZERO;

    public void high() {
        speed = Speed.HIGH;
        System.out.println("ceiling fan is set to high speed");
    }

    public void medium() {
        speed = Speed.MEDIUM;
        System.out.println("ceiling fan is set to medium speed");
    }

    public void low() {
        speed = Speed.LOW;
        System.out.println("ceiling fan is set to low speed");
    }

    public void off() {
        speed = Speed.ZERO;
        System.out.println("ceiling fan is off");
    }

    public Speed getSpeed() {
        return speed;
    }

    public enum Speed {
        LOW, MEDIUM, HIGH, ZERO
    }
}
