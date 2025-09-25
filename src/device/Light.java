package device;

public class Light {
    private boolean isOn;

    public String turnOn() {
        isOn = true;
        return "Light is ON (Brightness: 70%)";
    }

    public String turnOff() {
        isOn = false;
        return "Light is OFF";
    }
}