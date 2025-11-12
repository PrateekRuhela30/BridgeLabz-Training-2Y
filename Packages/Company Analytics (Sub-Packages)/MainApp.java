import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

public class MainApp {
    public static void main(String[] args) {
        new SalesReport().showSales();
        new EmployeeReport().showPerformance();
    }
}
