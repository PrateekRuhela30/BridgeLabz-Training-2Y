import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();

        ZonedDateTime gmt = now.withZoneSameInstant(ZoneId.of("GMT"));
        ZonedDateTime ist = now.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = now.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        System.out.println("GMT: " + gmt);
        System.out.println("IST: " + ist);
        System.out.println("PST: " + pst);
    }
}
