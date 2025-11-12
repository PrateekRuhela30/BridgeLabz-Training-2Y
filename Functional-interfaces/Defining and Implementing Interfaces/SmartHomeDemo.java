public interface SmartDevice {
    void turnOn();
    void turnOff();
}
public class Light implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Light is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is now OFF.");
    }
}
public class AirConditioner implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Air Conditioner is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Air Conditioner is now OFF.");
    }
}
public class Television implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Television is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Television is now OFF.");
    }
}
public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartDevice[] devices = {
            new Light(),
            new AirConditioner(),
            new Television()
        };

        for (SmartDevice device : devices) {
            device.turnOn();
        }

        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}