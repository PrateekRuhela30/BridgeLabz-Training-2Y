public class Employee {
    private static String companyName = "Tech Corp";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid object type.");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, "Developer");
        Employee emp2 = new Employee("Bob", 102, "Manager");

        emp1.displayDetails();
        emp2.displayDetails();
        Employee.displayTotalEmployees();
    }
}
