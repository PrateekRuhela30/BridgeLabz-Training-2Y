interface SensitiveData {
    // Marker interface: no methods
}

class UserProfile implements SensitiveData {
    private String name;
    private String email;
    private String ssn;

    public UserProfile(String name, String email, String ssn) {
        this.name = name;
        this.email = email;
        this.ssn = ssn;
    }

    public String toString() {
        return "Name: " + name + ", Email: " + email + ", SSN: " + ssn;
    }
}

public class EncryptionProcessor {
    public static void main(String[] args) {
        UserProfile user = new UserProfile("Abhay", "abhay@example.com", "123-45-6789");

        if (user instanceof SensitiveData) {
            System.out.println(" Encrypting sensitive data for backup...");
            // Simulated encryption logic
        } else {
            System.out.println(" No encryption needed for this object.");
        }
    }
}