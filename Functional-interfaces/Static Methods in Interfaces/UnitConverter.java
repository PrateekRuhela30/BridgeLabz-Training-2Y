public interface UnitConverter {

    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double milesToKm(double miles) {
        return miles / 0.621371;
    }

    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }

    static double lbsToKg(double lbs) {
        return lbs / 2.20462;
    }
}

class LogisticsApp {

    public static void main(String[] args) {
        double km = 10.0;
        double kg = 5.0;

        double miles = UnitConverter.kmToMiles(km);
        double lbs = UnitConverter.kgToLbs(kg);

        System.out.println(km + " km = " + miles + " miles");
        System.out.println(kg + " kg = " + lbs + " lbs");
    }
}