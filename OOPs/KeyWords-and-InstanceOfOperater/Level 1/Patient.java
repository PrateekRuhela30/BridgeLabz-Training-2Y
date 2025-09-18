public class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid object type.");
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("Eve", 30, "Flu", "P1001");
        patient1.displayDetails();
        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
}
