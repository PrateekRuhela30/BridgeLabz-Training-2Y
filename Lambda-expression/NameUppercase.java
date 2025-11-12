import java.util.*;

public class NameUppercase {
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList("Amit", "Neha", "Ravi", "Priya");

        employeeNames.stream()
                     .map(String::toUpperCase)
                     .forEach(System.out::println);
    }
}