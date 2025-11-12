import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("critical", "Heart rate abnormal"),
            new Alert("info", "Appointment confirmed"),
            new Alert("warning", "Medication missed"),
            new Alert("info", "Lab results available")
        );

        filterAlerts(alerts, a -> a.type.equals("critical"));
        filterAlerts(alerts, a -> a.type.equals("info"));
        filterAlerts(alerts, a -> a.type.equals("warning"));
    }

    static void filterAlerts(List<Alert> alerts, Predicate<Alert> preference) {
        System.out.println("\nFiltered Alerts:");
        alerts.stream()
              .filter(preference)
              .forEach(System.out::println);
    }
}