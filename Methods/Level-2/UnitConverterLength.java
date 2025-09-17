public class UnitConverterLength {
    public static double convertYardsToFeet(double yards) {
        return yards * 3.33333;
    }

    public static double convertInchesToFeet(double inches) {
        return inches * 0.0833333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertCentimetersToInches(double cm) {
        return cm * 0.393701;
    }

    public static void main(String[] args) {
        System.out.println(convertYardsToFeet(1));
        System.out.println(convertInchesToFeet(12));
        System.out.println(convertMetersToInches(1));
        System.out.println(convertCentimetersToInches(100));
    }
}