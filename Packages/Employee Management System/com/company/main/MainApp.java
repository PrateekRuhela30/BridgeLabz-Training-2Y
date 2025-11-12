import com.company.hr.Employee;
import com.company.payroll.*;

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Amit", "IT", 50000);
        Payroll pr = new Payroll();

        emp.display();
        System.out.println("Salary after bonus: " + pr.calculateBonus(emp));
    }
}
