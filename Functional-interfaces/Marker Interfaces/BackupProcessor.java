import java.io.*;

interface BackupSerializable {
    // Marker interface: no methods
}

class CustomerData implements BackupSerializable, Serializable {
    private String name;
    private int age;

    public CustomerData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Customer: " + name + ", Age: " + age;
    }
}

public class BackupProcessor {
    public static void main(String[] args) {
        CustomerData customer = new CustomerData("Abhay", 30);

        if (customer instanceof BackupSerializable) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("backup.dat"))) {
                out.writeObject(customer);
                System.out.println(" Backup completed for: " + customer);
            } catch (IOException e) {
                System.out.println(" Backup failed: " + e.getMessage());
            }
        } else {
            System.out.println(" Object not eligible for backup.");
        }
    }
}