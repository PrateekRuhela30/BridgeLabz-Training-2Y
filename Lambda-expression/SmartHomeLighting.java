import java.util.HashMap;
import java.util.Map;

interface LightBehavior {
    void activate();
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        Map<String, LightBehavior> triggers = new HashMap<>();

        triggers.put("motion", () -> System.out.println("Lights turned on with motion sensor pattern."));
        triggers.put("timeOfDay", () -> System.out.println("Lights adjusted based on time of day."));
        triggers.put("voiceCommand", () -> System.out.println("Lights activated via voice command."));

        activateTrigger(triggers, "motion");
        activateTrigger(triggers, "timeOfDay");
        activateTrigger(triggers, "voiceCommand");
        activateTrigger(triggers, "unknown");
    }

    static void activateTrigger(Map<String, LightBehavior> triggers, String trigger) {
        LightBehavior behavior = triggers.getOrDefault(trigger, () -> System.out.println("No behavior defined for this trigger."));
        behavior.activate();
    }
}