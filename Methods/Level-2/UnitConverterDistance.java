public class UnitConverterDistance {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMetersToMiles(double meters) {
        return meters * 0.000621371;
    }

    public static double convertFeetToMiles(double feet) {
        return feet * 0.000189394;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static void main(String[] args) {
        System.out.println(convertKmToMiles(5));
        System.out.println(convertMetersToMiles(1000));
        System.out.println(convertFeetToMiles(5280));
        System.out.println(convertMetersToFeet(1));
    }
}