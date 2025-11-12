public class AgeValidator {
    public static boolean isValidAge(String ageInput) {
        try {
            int age = Integer.parseInt(ageInput);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValidAge("21"));   // true
        System.out.println(isValidAge("abc"));  // false
        System.out.println(isValidAge("17"));   // false
    }
}