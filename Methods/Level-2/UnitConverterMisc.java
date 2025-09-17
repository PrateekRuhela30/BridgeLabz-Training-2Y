public class UnitConverterMisc {
    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.204621;
    }

    public static double convertGallonsToLiters(double gal) {
        return gal * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println(convertFahrenheitToCelsius(98.6));
        System.out.println(convertCelsiusToFahrenheit(37));
        System.out.println(convertPoundsToKilograms(150));
        System.out.println(convertKilogramsToPounds(68));
        System.out.println(convertGallonsToLiters(1));
        System.out.println(convertLitersToGallons(3.78541));
    }
}