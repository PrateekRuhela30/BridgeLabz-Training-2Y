public interface SecurityUtils {

    static boolean isStrongPassword(String password) {
        return password != null &&
               password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[!@#$%^&*()].*");
    }
}

class InsurancePortal {

    public static void main(String[] args) {
        String password = "Secure@123";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println(" Password is strong.");
        } else {
            System.out.println(" Password does not meet strength requirements.");
        }
    }
}