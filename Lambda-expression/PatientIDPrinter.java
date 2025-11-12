import java.util.*;

class Patient {
    String id;

    Patient(String id) {
        this.id = id;
    }

    String getId() {
        return id;
    }
}

public class PatientIDPrinter {
    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
            new Patient("P001"),
            new Patient("P002"),
            new Patient("P003"),
            new Patient("P004")
        );

        patients.stream()
                .map(Patient::getId)
                .forEach(System.out::println);
    }
}